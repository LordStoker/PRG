/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Act4_2;

import Act4_1.UtilitatsArrays;

/**
 *
 * @author Tomas
 */
public class Act4_2_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int MIDA = 10;
        int[][] matriu = UtilitatsMatrius.generaMatriu(MIDA, 10, 100);
        int[]diagonal;
        
        System.out.println();
        UtilitatsMatrius.mostrarMatriu(matriu);
        System.out.println();
        diagonal = UtilitatsMatrius.generaDiagonalSecundaria(matriu);
        UtilitatsArrays.mostraArray(diagonal);
    }
    
}
