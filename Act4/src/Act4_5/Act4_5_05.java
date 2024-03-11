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
public class Act4_5_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fibo = UtilitatsConsola.llegirSencer("Introduce de qué número quieres la secuencia Fibonnaci:");
        System.out.println(UtilitatsRecOrdCerca.calculaFibonacci(fibo));
    }
    
}