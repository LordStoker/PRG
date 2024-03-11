/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_0K;

/**
 *
 * @author Tomas
 */
public class SubClasse2 implements Interficie {
    
    //La SubClasse2 sobreescriu el metodePerDefecte() de la interfaz
    @Override
    public void metodePerDefecte(){
        System.out.println("MÉTODO PER DEFECTE EN SubClasse2." + a1);
    }
    
    @Override
    public void metodeAbstracte(){
        System.out.println("MÉTODO ABSTRACTE en SubClasse2");
    }
    
}
