/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT5_1;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class ACT_5_1_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int[] array = {1,2,3,4,5,6,7,8,9};
        int index;
        try(Scanner scanner = new Scanner (System.in)){
            System.out.println("Introduce qué elemento de la lista quieres ver: ");
            index = scanner.nextInt();
            verArray(array, index);
        }

        catch(Exception e){
            System.out.println(e.getMessage());            
        }
    }
        
        public static void verArray (int[]array, int index){
            try{
                System.out.println(array[index]);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
        }
    }
    

