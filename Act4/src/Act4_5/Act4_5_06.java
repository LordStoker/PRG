/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Act4_5;

import Act4_1.UtilitatsArrays;
//import static Act4_5.UtilitatsRecOrdCerca.ordenaArray3;

/**
 *
 * @author Tomas
 */
public class Act4_5_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] array = UtilitatsArrays.generaArray(3, 0, 100);
        
        UtilitatsArrays.mostraArray(array);
        
        UtilitatsRecOrdCerca.ordenaArray3(array);
        
        UtilitatsArrays.mostraArray(array);        
    }
    
}
