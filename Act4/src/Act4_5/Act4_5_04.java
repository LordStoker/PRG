/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Act4_5;
import Act4_3.UtilitatsConsola;

/**
 *
 * @author tomas
 */
public class Act4_5_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = UtilitatsConsola.llegirSencer("Introduce num1:");
        int num2 = UtilitatsConsola.llegirSencer("Introduce num2:");
        System.out.println("El MCD de " + num1 + " y " + num2 + " es:" + UtilitatsRecOrdCerca.calculaMCD(num1, num2));
        // TODO code application logic here
    }
    
}
