/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialesparciales;

/**
 *
 * @author MARIO
 */
public class FactorialesParciales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 6, resultadoN = 1, mult1 = 1, mult2 = 1;
        for (int i = 1; i <= n; i++) {

            resultadoN = i * mult1;
            if (resultadoN >= 1000D) {
                break;
            }
            mult1 = resultadoN;
            System.out.println(resultadoN);
        }
    }

}
