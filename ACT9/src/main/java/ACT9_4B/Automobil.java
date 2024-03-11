/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_4B;

/**
 *
 * @author tomas
 */
public class Automobil extends Vehicle {
    
    protected int numPortes;
    protected double capacitatMaleter;
    
    public Automobil ( String marca, String model, double preu,int numPortes, double capacitatMaleter){
        super(marca, model, preu);
        this.numPortes = numPortes;
        this.capacitatMaleter = capacitatMaleter;
    }
    
    @Override    
    public double calculaImpost(){
        return super.getPreu() * 1.10;        
    }

    public int getNumPortes() {
        return numPortes;
    }

    public void setNumPortes(int numPortes) {
        this.numPortes = numPortes;
    }

    public double getCapacitatMaleter() {
        return capacitatMaleter;
    }

    public void setCapacitatMaleter(double capacitatMaleter) {
        this.capacitatMaleter = capacitatMaleter;
    }
    
    @Override
    
    public String toString(){
        return super.toString() + ", Portes: " + this.numPortes + ", Maleter:" + this.capacitatMaleter;
    }
    
    
    
    
    
    
    
    
}
