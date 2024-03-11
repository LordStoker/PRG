/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Act4_1;

/**
 *
 * @author Tomas
 */
public class Act4_1_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int total = 0;
        int [] numeros = UtilitatsArrays.generaArray(10, 0, 100);

        total = UtilitatsArrays.sumaArray(numeros);
        System.out.println(total);
        // TODO code application logic here
    }
    
}
