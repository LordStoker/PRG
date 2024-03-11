/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT8_0C;

/**
 *
 * @author Tomas
 */
public class Moto extends Vehicle {
    
    public Moto (String marca, String modelo){
        super(marca, modelo);
    }
    
    public void acelera(){
        System.out.println("La moto " + getMarca() + " accelera");
    }
    
}
