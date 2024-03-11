/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_4A;

import ACT9_4B.*;

/**
 *
 * @author tomas
 */
public class Motocicleta extends Vehicle {
    
    private int cilindrada;
    private String tipus;
    
    public Motocicleta(String marca, String model, double preu, int cilindrada,
            String tipus){
        super(marca, model, preu);
        this.cilindrada = cilindrada;
        this.tipus = tipus;
    }
    
    @Override
    public double calculaImpost(){
        return super.getPreu() * 1.05;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Cilindrada: " + this.cilindrada + " tipus: " + this.tipus;
    }
    
    
    
    
    
    
}
