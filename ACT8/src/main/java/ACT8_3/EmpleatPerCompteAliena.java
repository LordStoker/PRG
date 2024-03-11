/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT8_3;

/**
 *
 * @author Tomas
 */
public class EmpleatPerCompteAliena extends Empleat {

    
    public EmpleatPerCompteAliena(String nom, String llinatge1, double souBase){
        super(nom, llinatge1, souBase);
    }
    
    
    protected double calcularSalari() {
        return souBase;
    }
    
    /*@Override
    public String toString(){
        return super.toString();
    }*/
    

    
}
