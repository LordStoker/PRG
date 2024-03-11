/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_4B;

/**
 *
 * @author tomas
 */
public class Camio extends Vehicle {
    
    private double capacitatCarrega;
    
    public Camio (String marca, String model, double preu, double capacitatCarrega){
        super(marca, model, preu);
        this.capacitatCarrega = capacitatCarrega;
    }

    @Override
    public double calculaImpost() {
        return super.getPreu() * 1.15;
    }
    
    @Override 
    public String toString(){
        return super.toString() + " Carga: " + this.capacitatCarrega + "kg.";
    }
    



    
}
