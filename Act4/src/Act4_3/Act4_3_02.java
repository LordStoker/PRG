/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Act4_3;
import Act4_1.UtilitatsArrays;
import Act4_2.UtilitatsMatrius;

/**
 *
 * @author Tomas
 */
public class Act4_3_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] alumnes = new String [5];
        int [] [] notes = UtilitatsMatrius.generaMatriu(5, 0, 10);
        float media = 0;
        
        for (int i = 0; i < alumnes.length;i++){
            alumnes[i] = UtilitatsArrays.llegirCadena("Introduce el nombre del alumno:");
            System.out.print(alumnes[i] + ":");
            UtilitatsArrays.mostraArray(notes[i]);
            media = UtilitatsArrays.mitja(notes[i]);
            System.out.println("Mitjana = " + media);            
        }
        
        // TODO code application logic here
    }
    
}
