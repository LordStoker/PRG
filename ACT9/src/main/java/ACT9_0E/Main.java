/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT9_0E;

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
        Cercle c = new Cercle ("Vermell", 5.0);
        Rectangle r = new Rectangle ("Groc", 8.7, 9.2);
        
        c.aplicaColor("Rosa");
        System.out.println("Cercle: "+ c.toString());
        System.out.println("Área del cercle: " + c.calculaArea());
    }
    
}
