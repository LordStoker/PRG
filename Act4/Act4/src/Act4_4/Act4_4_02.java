/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Act4_4;
import Act4_1.UtilitatsArrays;
import java.util.ArrayList;

/**
 *
 * @author Tomas
 */
public class Act4_4_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] array = UtilitatsArrays.generaArray(10, 0, 2);
        ArrayList<Integer> calculo = new ArrayList<>();
        UtilitatsArrays.mostraArray(array);
        calculo = UtilitatsClasses.mostrarDiferents(array);
        UtilitatsClasses.mostrarArrayListInteger(calculo);        
        
    }
    
}
