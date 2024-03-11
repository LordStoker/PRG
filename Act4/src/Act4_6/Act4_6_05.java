/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Act4_6;

import Act4_1.UtilitatsArrays;
import Act4_2.UtilitatsMatrius;
import Act4_3.UtilitatsConsola;
import java.util.ArrayList;

/**
 *
 * @author Tomas
 */
public class Act4_6_05 {
    static int NTAULER;
    static int NMINES;
    static int[][] tauler;
    static int taulerVisible;
    static ArrayList<int[]> mines = new ArrayList<>();
    static int SIMBOL_MINA = 9;
    static int SIMBOL_VACIO = 0;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NTAULER = UtilitatsConsola.llegirSencer("Tamaño del tablero: ");
        NMINES = UtilitatsConsola.llegirSencer("Número de minas: ");
        tauler = UtilitatsMatrius.generaMatriu(NTAULER, 0, 0);
        emplenaTauler(tauler, mines);
        
        
        
    }
    public static void emplenaTauler (int[][] tauler, ArrayList<int[]> mines){
         final int MIN = 0, MAX = tauler.length-1;
         int i = 0;
         int [] posMina = UtilitatsArrays.generaArray(2, MIN, MAX);
         boolean vacio = false;         
         while(i < NMINES){
             while(!vacio)             
             if(tauler[posMina[0]][posMina[1]] == SIMBOL_VACIO){
                 tauler[posMina[0]][posMina[1]] = SIMBOL_MINA;
                 vacio = true;
                 i++;
                 mines.add(posMina);
             }
             else{
                 posMina = UtilitatsArrays.generaArray(2, MIN, MAX);
             }
         }
         
        
        
    }
    
}
