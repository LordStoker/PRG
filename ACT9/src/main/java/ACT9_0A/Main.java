/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT9_0A;

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
        Cercle c = new Cercle(5.0);
        Quadrat q = new Quadrat(5.0);
        
        System.out.println(c.calculaArea());
        System.out.println(q.calculaArea());
    }
    
}
