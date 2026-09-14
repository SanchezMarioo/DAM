let palabra = prompt("Ingrese una palabra:");

function contarVocales(cadena) {
  let vocales = "aeiouAEIOU";
  let contador = 0;

  for (let index = 0; index < palabra.length; index++) {
    if (vocales.includes(cadena[index])) {
      contador++;
    }
  }
  return contador;
}
console.log(
  "El numero de vocales del texto " + palabra + " " + contarVocales(palabra) + " vocales",
);
