/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT9_0K;

/**
 *
 * @author Tomas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SubClasse1 sC1 = new SubClasse1(1, "aaa");
        
        sC1.metodePerDefecte(); //Cridada a métodePerDefecte() d'Interficie
        sC1.metodeAbstracte();
        System.out.println(sC1.getB1());
        
        SubClasse2 sC2 = new SubClasse2();
        sC2.metodePerDefecte(); //Cridada a métodoPerDefecte() de SubClasse2
        sC2.metodeAbstracte();
    }
    
}
