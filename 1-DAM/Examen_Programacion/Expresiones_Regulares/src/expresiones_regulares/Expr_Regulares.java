/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expresiones_regulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author MARIO
 */
public class Expr_Regulares {

    private final String accesoNivelBasico = "\\b[A-Z]{3}-\\d{4}";
    private final String accesoPrivilegiado = "\\b(ROOT|ADMIN|X-ADMIN)-\\d{4}\\b";
    private final String identificadoresInternos = "\\b SYS_{A-Z}{3}\\d{2} \\b";
    private final String palabrasFinalesSospechosas = "\\b(?i)(EXPLOIT|BYPASS|PAYLOAD|INJECT|BACKDOOR)\\b";
    private final String texto = """
                                        Registro interno de comunicaciones interceptadas.
                                        Canal: nodo-externo-17
                                        Estado del análisis: en curso
                                           Mensaje 1:
                                        El operador indicó que la entrega se haría sin incidencias, aunque en la nota manuscrita apareció el código ABC-1234 junto a una referencia antigua que parecía ilegible.
                                        Un técnico anotó después AB-1234 como posible variante, pero no se ha confirmado que sea válida.
                                        También se observó una cadena SYS_CFG12 asociada al módulo principal.
                                        En la misma línea aparecía la palabra exploit escrita en minúsculas.
                                           Mensaje 2:
                                        Durante la madrugada se recibió una secuencia con varias marcas: ROOT-4589, ADMIN-0001 y una tercera referencia mal escrita como admin-1234.
                                        La revisión automática también detectó SYS_NET03 cerca del final del bloque.
                                        En otra parte del mensaje apareció la palabra BYPASS en mayúsculas completas.
                                        Un analista añadió la referencia ABC1234, aunque se cree que no sigue el formato correcto.
                                           Mensaje 3:
                                        La transcripción contiene frases aparentemente normales, pero entre ellas se localizó NET-0001 en una sección dedicada a credenciales caducadas.
                                        Más adelante aparece SYS_KEY99 como identificador de servicio.
                                        También se leyó payload en una observación secundaria y más tarde la palabra Inject escrita como Inject, mezclando mayúsculas y minúsculas.
                                        En la última línea alguien escribió XADMIN-7777, pero el separador no parece correcto.
                                           Mensaje 4:
                                        En un bloque corrupto se encontró SYS-9087 repetido dos veces: SYS-9087 y de nuevo SYS-9087.
                                        Sin embargo, el supervisor anotó SYS-90A7 en otro lugar y esta última referencia no parece válida.
                                        En una conversación paralela aparece backdoor como término aislado.
                                        Otro operador apuntó SYS_ABCD12, aunque tiene demasiadas letras para el identificador interno esperado.
                                           Mensaje 5:
                                        El archivo de incidencias refleja que una puerta de acceso secundario quedó vinculada a X-ADMIN-7777 durante unos minutos.
                                        También consta la cadena ROOT-45, probablemente incompleta.
                                        En una sección de depuración aparece SYS_LOG07, que podría confundirse con un código interno correcto si no se revisa bien el patrón.
                                        Cerca del final hay varias palabras sueltas: exploit, payload y bypass.
                                           Mensaje 6:
                                        Una nota de campo recoge el valor QWE-9876 como credencial temporal.
                                        A continuación se menciona SYS_DBX41 y un intento fallido de registrar SYS_db41.
                                        La herramienta de parseo señaló además BACKDOOR en letras mayúsculas y la palabra inject unas líneas más abajo.
                                        No se detectó actividad útil en el resto del párrafo.
                                           Mensaje 7:
                                        El responsable del nodo remoto escribió lo siguiente:
                                        "Activar perfil ADMIN-2468 solo si el canal secundario responde".
                                        En el mismo texto aparece ADMIN-24A8, que parece un error humano.
                                        El sistema de inventario incorporó SYS_API22 como etiqueta de un subsistema.
                                        Al final del mensaje se cita la palabra Payload con inicial mayúscula.
                                           Mensaje 8:
                                        Se revisaron los datos históricos y apareció MNO-4321 enlazado a una tarea de mantenimiento.
                                        También se localizaron las formas exploit, EXPLOIT y Exploit repartidas por distintas líneas del documento.
                                        El identificador SYS_CFG12 volvió a aparecer duplicado en este mensaje.
                                        Una marca adicional, SYS-CFG12, fue anotada por error por otro técnico.
                                           Mensaje 9:
                                        En una exportación parcial del servidor se observa ROOT-9999 seguido de X-ADMIN-1357.
                                        En cambio, ROOT9999 no debería considerarse válido.
                                        Se encontró además SYS_SEC88 dentro de una relación de nodos internos.
                                        La cadena backdoor aparece repetida dos veces: backdoor y BackDoor.
                                        En otra línea alguien escribió SYS_sec88, pero no cumple el patrón de mayúsculas.
                                           Mensaje 10:
                                        Los operadores discutían sobre si el término bypass debía disparar una alerta alta o media.
                                        En mitad del informe apareció TTT-1111 y más tarde ZZZ-0000.
                                        También se registró SYS_RAM64 como identificador técnico.
                                        Un error frecuente del documento es omitir el guion, como en TTT1111, que no debería contarse.
                                           Mensaje 11:
                                        El canal cifrado devolvió una combinación breve con ADMIN-7777 y el identificador SYS_CPU11.
                                        Otro texto cercano mencionaba exploit junto a inject y payload en la misma frase.
                                        Como ruido adicional aparece la secuencia SYS_CP111, que no encaja porque no tiene exactamente tres letras antes de los dos dígitos.
                                        Un operador antiguo dejó escrito X-ADMIN-77, claramente incompleto.
                                           Mensaje 12:
                                        Parte del contenido parecía una conversación banal sobre horarios, café y turnos, pero escondía el código LNX-2026 en medio del párrafo.
                                        A unos caracteres de distancia se encontraba SYS_DEV55.
                                        En el comentario final se puede leer BYpass de forma irregular, que igualmente debería ser localizado si la búsqueda no distingue mayúsculas de minúsculas.
                                        También apareció la variante incorrecta SYS_DEV555 con un dígito de más.
                                           Mensaje 13:
                                        Las notas del turno de noche contienen AAA-0001, BBB-2345 y CCC-6789 en una sola línea.
                                        Después se cita ROOT-1234 como acceso restringido.
                                        En un apunte posterior alguien introdujo ROOT-12A4, que mezcla letras y números de forma incorrecta.
                                        Se añadió además SYS_INT30 como identificador interno.
                                        La palabra backdoor se menciona en el contexto de una revisión de seguridad.
                                           Mensaje 14:
                                        Un analista revisó el texto y dejó anotadas las expresiones inject, exploit y payload como términos de alto interés.
                                        En la parte técnica aparece SYS_MOD77.
                                        Un informe paralelo incluye el código QX-9087, que no debería aceptarse porque solo tiene dos letras antes del guion.
                                        Sí debe aceptarse, en cambio, PRT-9087, que aparece unas líneas después.
                                        También se ve X-ADMIN-8080 como clave temporal.
                                           Mensaje 15:
                                        Resumen provisional:
                                        - Códigos detectados manualmente: ABC-1234, NET-0001, MNO-4321
                                        - Códigos privilegiados observados: ROOT-4589, ADMIN-0001, X-ADMIN-7777
                                        - Identificadores internos visibles: SYS_CFG12, SYS_NET03, SYS_KEY99
                                        - Palabras críticas encontradas: exploit, bypass, payload, inject, backdoor
                                           Fin del registro.
                   """;

    public String getTexto() {
        return texto;
    }
    

    private void buscar(String expresionRegular) {
        Pattern p = Pattern.compile(expresionRegular);
        Matcher m = p.matcher(texto);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
    

    public void accesoBasico() {
        buscar(accesoNivelBasico);
    }

    public void accesoPrivilegiado() {
        buscar(accesoPrivilegiado);
    }
    public void identificadoresDelSistema(){
        buscar(identificadoresInternos);
    }
    public void palabrasSospechosas(){
        buscar(palabrasFinalesSospechosas);
    }

}
