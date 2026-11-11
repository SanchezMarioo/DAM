/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.EmpresaDAO;
import Vista.VistaConsola;

/**
 *
 * @author mario.sanper.2
 */
public class ControladorEmpresa {
    private VistaConsola vista = new VistaConsola();
    private EmpresaDAO dao = new EmpresaDAO();
    
    public void init(){
        vista.mostrarMenu();
        int numero = vista.pedirNumero("Dime un numero: ");
    }
}
