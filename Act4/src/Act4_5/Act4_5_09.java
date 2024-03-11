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
public class Act4_5_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] array = UtilitatsRecOrdCerca.ordenaArrayBimbolla(UtilitatsArrays.generaArray(100, 0, 1000));
        int min = 0;
        int max = array.length-1;
        int pos = 0;
        UtilitatsArrays.mostraArray(array);
        int num = UtilitatsConsola.llegirSencer("¿Qué número quieres buscar");
        pos = UtilitatsRecOrdCerca.CercaArrayRecursiu(array, num, min, max);
        
        if (pos != -1){
            System.out.println("El número " + num + " se encuentra en la posicion " + pos);
        }
        else{
            System.out.println("El número " + num + " no se encuentra en el array");
        }
        
        
        
    }
    
}
