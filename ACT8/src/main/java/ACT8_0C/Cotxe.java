/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT8_0C;

/**
 *
 * @author Tomas
 */
public class Cotxe extends Vehicle {
    
    public Cotxe(String marca, String model){
        super(marca, model);
    }
    
    public void condueix(){
        System.out.println("El cotxe " + getMarca() + " està en moviment");
    }
    
    
}
