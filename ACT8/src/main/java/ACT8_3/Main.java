/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT8_3;

/**
 *
 * @author Tomas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EmpleatPerComptePropia empleat1 = new EmpleatPerComptePropia("Joan", "Amengual", 3000, 80);
        EmpleatPerCompteAliena empleat2 = new EmpleatPerCompteAliena("Juanjo", "García", 1800);
        
        System.out.println(empleat1.toString());
        System.out.println(empleat2.toString());
        System.out.println(empleat1.calcularSalari());
        
        System.out.println("Comparació d'empleats: " + empleat1.equals(empleat2));
        
        
    }
    
}
