/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Act4_5;

import Act4_1.UtilitatsArrays;
import Act4_3.UtilitatsConsola;

/**
 *
 * @author Tomas
 */
public class Act4_5_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = UtilitatsArrays.generaArray(10, 0, 100);
        UtilitatsRecOrdCerca.ordenaArrayBimbolla(array);
        UtilitatsArrays.mostraArray(array);
        int pos = 0;
        int num = UtilitatsConsola.llegirSencer("¿Qué número quieres buscar: ");
        pos = UtilitatsRecOrdCerca.CercaArray(array, num);
        
        if (pos != -1){
            System.out.println("El número " + num + "se encuentra en la posición" + pos);
        }
        else{
            System.out.println("El número " + num + " no se encuentra en el array.");
        }
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
