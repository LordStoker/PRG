/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT8_0G;

/**
 *
 * @author Tomas
 */
public abstract class Vehicle {
    protected int nRodes = 4;
    
    public Vehicle(int nRodes){
        this.nRodes = nRodes;
    }
    
    public void mostraInformaciónGeneral(){
        System.out.println("Això és un vehicle amb " + nRodes + " rodes");
    }
    
    public abstract void mostraDetalles();
    
}
