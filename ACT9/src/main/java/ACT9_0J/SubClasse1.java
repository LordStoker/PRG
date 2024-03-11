/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_0J;

/**
 *
 * @author Tomas
 */
public class SubClasse1 extends ClasseAbstracta {
    
    int b1;
    String b2;
    
    public SubClasse1(int a1, int b1, String b2){
        super(a1);
        this.b1 = b1;
        this.b2 = b2;
    }
    
    @Override
    public void metodeAbstracte(){
        System.out.println("Métode Abstracte implementat en SubClasse1");
    }
    
    @Override
    public void metodeConcret(){
        System.out.println("Métode concret implementa en SubClasse1");
    }
    
    
    
}
