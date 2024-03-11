/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_0K;

/**
 *
 * @author Tomas
 */
public class SubClasse1 implements Interficie {
    
    private int b1;
    private String b2;
    
    //Constructor
    public SubClasse1(int b1, String b2){
        this.b1 = b1;
        this.b2 = b2;
    }
    
    @Override
    public void metodeAbstracte(){
        System.out.println("MÉTODO ABSTRACTE EN SubClasse1. " + a1);
    }
    
    //La SubClasse1 hereda automàticamente el métodeperDefecte() de la interfaz

    public int getB1(){
        return b1;
    }
    
    public String getB2(){
        return b2;
    }
    
}
