/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Act4_4;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Tomas
 */
public class UtilitatsClasses {
    
    public static ArrayList<Integer> mostrarDiferents (int [] array){        
       
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++){
            if(! arraylist.contains(array[i])){
                arraylist.add(array[i]);
                System.out.print(" ");
            }             
        }
        return arraylist;       
    }
    
    public static ArrayList<Integer> generaArraylist ( int longitud, int MIN, int MAX){
        ArrayList<Integer> arraylist = new ArrayList<>(longitud);
        for (int i = 0; i < arraylist.size(); i++){
            arraylist.add(MIN + (int) (Math.random() * ((MAX - MIN)) + 1 ));
        }
       return arraylist;         
    
    }
    
    public static void mostrarArrayListInteger (ArrayList<Integer> arrayList){
        System.out.print("[");
        String separador = " ";
        for (int i = 0; i < arrayList.size(); i++){
            System.out.print(separador + arrayList.get(i) );
            separador = ", ";
        }
        System.out.println(" ]");
    }
        public static void mostrarArrayListString (ArrayList<String> arrayList){
        System.out.print("[");
        String separador = " ";
        for (int i = 0; i < arrayList.size(); i++){
            System.out.print(separador + arrayList.get(i) );
            separador = ", ";
        }
        System.out.println(" ]");
    }
    
        public static ArrayList<Integer> mostrarDiferentsMillorat (int [] array){        
       
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++){
            if (! arraylist.contains(array[i])){
                arraylist.add(array[i]);
            }
        }
        Collections.sort(arraylist);
      
        return arraylist;    
    }
    
}

    
    

