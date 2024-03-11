/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Act4_5;

import Act4_1.UtilitatsArrays;

/**
 *
 * @author Tomas
 */
public class Act4_5_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] array = UtilitatsArrays.generaArray(10, 0, 100);
        int[] array1 = UtilitatsArrays.generaArray(10, 0, 100);
        
        UtilitatsArrays.mostraArray(array);
        
        UtilitatsRecOrdCerca.ordenaArrayBimbolla(array);
        
        UtilitatsArrays.mostraArray(array);
        
        UtilitatsArrays.mostraArray(array1);
        
        UtilitatsRecOrdCerca.ordenaArrayBimbollaInvertido(array1);
        
        UtilitatsArrays.mostraArray(array1); 
        // TODO code application logic here
    }
    
}
