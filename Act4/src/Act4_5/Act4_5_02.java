/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Act4_5;
import Act4_3.UtilitatsConsola;

/**
 *
 * @author Tomas
 */
public class Act4_5_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int factorial = UtilitatsConsola.llegirSencer("Introduce el número del factorial que quieres sacar: ");
        // TODO code application logic here
        System.out.print(UtilitatsRecOrdCerca.calculaFactorial(factorial));
    }
    
}