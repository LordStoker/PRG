/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT8_0G;

/**
 *
 * @author Tomas
 */
public class Cotxe extends Vehicle {
    
    private String model;
    
    public Cotxe(int nRodes, String model){
        super(nRodes);
        this.model = model;
    }
    
    public void mostraDetalles(){
        System.out.println("Això és un cotxe model " + model + ".");
    }
    
}
