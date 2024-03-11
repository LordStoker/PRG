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
public class ACT5_1_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a , b , resultat;
        
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Introduce el dividendo: ");
            a = scanner.nextInt();
            System.out.print("Introduce el divisor: ");
            b = scanner.nextInt();
            resultat = a/b;
            System.out.println("El resultado es " + resultat);
        }
        catch(Exception e){
            System.out.println("No se puede dividir entre 0 " + "Mensaje de la excepción: " + e.getMessage());
            e.printStackTrace();
            
        }
        
    }
    
}
