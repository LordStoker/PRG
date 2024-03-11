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
public class Act4_5_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int base = UtilitatsConsola.llegirSencer("Introduce el número base:");
       double exponente = UtilitatsConsola.llegirSencer("Introduce el número exponente:");
       System.out.println(UtilitatsRecOrdCerca.calcularPotencia(base, exponente));
    }
    
}
