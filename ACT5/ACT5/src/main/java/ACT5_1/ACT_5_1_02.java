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
public class ACT_5_1_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {1,2,3,4,5,6,7,8,9};
        int index;
        try(Scanner scanner = new Scanner (System.in)){
            System.out.print("Introduce el elemento que quieres ver del array: ");
            index = scanner.nextInt();
            System.out.println(array[index]);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());            
        }        
        
    }
    
}
