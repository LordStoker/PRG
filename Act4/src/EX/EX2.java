package EX;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Tomas
 */
import Act4_4.*;
import java.util.ArrayList;
import Act4_1.UtilitatsArrays;
import Act4_5.UtilitatsRecOrdCerca;


public class EX2 {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<Integer> resultat = new ArrayList<>();
        int num = 25;
        array = UtilitatsClasses.arrayToArrayListInt(  // es transforma a ArrayList
                UtilitatsRecOrdCerca.ordenaArrayBimbolla(  // s'ordena l'array
                        UtilitatsArrays.generaArray(10, 0, 199))); // es genera un array
        
        // cos del programa
        UtilitatsClasses.mostrarArrayListInt(array);
        resultat = afegeixNum(array, num);  
        UtilitatsClasses.mostrarArrayListInt(resultat);
    }
     
    private static ArrayList<Integer> afegeixNum(ArrayList<Integer> array, int num) {
        ArrayList<Integer> resultat = new ArrayList<>();
        
        // TO-DO
        
        return resultat;
    }

}
