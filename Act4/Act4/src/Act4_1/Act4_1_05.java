/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Act4_1;

/**
 *
 * @author Tomas
 */
public class Act4_1_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] array1 = UtilitatsArrays.generaArray(5, 0, 0);
        int [] array2 = UtilitatsArrays.generaArray(6, 0, 0);
        boolean igualdad = UtilitatsArrays.comparaArrays(array1, array2);
        UtilitatsArrays.mostraArray(array1);
        UtilitatsArrays.mostraArray(array2);
        System.out.println(igualdad);
        // TODO code application logic here
    }
    
}
