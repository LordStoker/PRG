/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Act4_5;
import Act4_3.UtilitatsConsola;
/**
 *
 * @author tomas
 */
public class probando_recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /*int num = UtilitatsConsola.llegirSencer("Introdueixi la base: ");
         factorial(num);       
         
         System.out.println(factorial(num));*/  
         inv (1234);
         
    }
    
    /*public static int factorial(int num){        
        if(num == 1){
            return num;
        }
        else        
            return num * factorial(num-1);                
    }*/
    
    
    public static int inv (int num){
        if (num <10){
            System.out.println(num);
            return num;
        }
        else{
            System.out.println(num%10);
            return inv(num/10);
        }
    }
}
    
    
    

