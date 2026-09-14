/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package sala_aeropuertos;

/**
 *
 * @author MARIO
 */
public enum DiaSemana {
    LUNES, 
    MARTES, 
    MIERCOLES, 
    JUEVES,
    VIERNES, 
    SABADO, 
    DOMINGO;
    
    
    public boolean esValidoDia(DiaSemana dia){
        for (DiaSemana Dia : DiaSemana.values()) {
            if(Dia.equals(dia)){
                return true;
            }
        }
        return false;
    } 
    
}
