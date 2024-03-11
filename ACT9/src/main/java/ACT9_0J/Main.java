/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT9_0J;

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
        
        SubClasse1 sC1 = new SubClasse1(1,2,"aaa");
        SubClasse2 sC2 = new SubClasse2(1);
        
        sC1.metodeConcret();
        sC1.metodeAbstracte();
        sC2.metodeConcret();
        sC2.metodeAbstracte();
    }
    
}
