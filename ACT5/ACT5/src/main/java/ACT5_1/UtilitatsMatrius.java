/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Act4_2;

/**
 *
 * @author Tomas
 */
public class UtilitatsMatrius {
        // ACT4_7
    /**
     * Assigna a cada posicio de la matriu la suma de les seves coordenades
     * @param longitud
     * @param minim
     * @param maxim
     * @return matriu
     */
    public static int[][] generaMatriu(int longitud, int minim, int maxim) {
        int[][] matriu = new int[longitud][longitud];
        
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = minim + (int) (Math.random() * (maxim - minim + 1));
            }
        }
        return matriu;
    }

    // ACT4_7
    /**
     * Mostra la matriu
     * @param matriu
     */
    public static void mostrarMatriu(int[][] matriu) {
        String separador = " ";
        System.out.print('[');
        for (int i = 0; i < matriu.length; i++) {
            System.out.print(separador + '[');
            separador = "";
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(separador + (matriu[i][j]==0? " ":matriu[i][j]));
                separador = ", ";
            }
            System.out.println(']');
        }
        System.out.println(']');
    }
 
    // ACT4_7
    /**
     * Mostra per consola la diagonal principal de la matriu
     * @param matriu
     */
    public static int[] generaDiagonalPrincipal(int[][] matriu) {
        int[] sortida = new int[matriu.length];
        
        for (int i = 0; i < matriu.length; i++) {
            sortida[i] = matriu[i][i];
        }
        return sortida;
    }
 
    // ACT4_7
    /**
     * Mostra per consola la diagonal secundaria de la matriu
     * @param matriu
     */
    public static int[] generaDiagonalSecundaria(int[][] matriu) {
        int[] sortida = new int[matriu.length];
        
        for (int i = 0, j=matriu.length-1; i < matriu.length; i++, j--) {
            sortida[i] = matriu[i][j];
        }
        return sortida;
    }
    
}
