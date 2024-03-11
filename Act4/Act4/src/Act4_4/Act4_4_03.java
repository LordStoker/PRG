/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Act4_4;
import Act4_1.UtilitatsArrays;
import java.util.ArrayList;


/**
 *
 * @author tomas
 */
public class Act4_4_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> arrayordenado = new ArrayList<Integer>();
        int [] array = UtilitatsArrays.generaArray(100, 0, 100);
        UtilitatsArrays.mostraArray(array);
        arrayordenado = UtilitatsClasses.mostrarDiferentsMillorat(array);
        UtilitatsClasses.mostrarArrayListInteger(arrayordenado);
        

        
        
        // TODO code application logic here
    }
    
}
