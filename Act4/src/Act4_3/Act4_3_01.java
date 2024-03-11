/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Act4_3;

import Act4_1.UtilitatsArrays;

/**
 *
 * @author Tomas
 */
public class Act4_3_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cadena = UtilitatsConsola.llegirSencer("Introduce el número de notas: ");
        int [] notas = new int [cadena];
        float media = 0;
        for (int i = 0; i < notas.length; i++){
            notas[i] = UtilitatsConsola.llegirSencer("Introduce la nota: ");
        }
        UtilitatsArrays.mostraArray(notas);
        media = UtilitatsArrays.mitja(notas);
        System.out.println(media);
        // TODO code application logic here
    }
    
}
