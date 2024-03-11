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
public abstract class Vehicle {
    
    private String marca;
    private String model;
    private double preu;
    
    // CONSTRUCTOR
    public Vehicle(String marca, String model, double preu){
        this.marca = marca;
        this.model = model;
        this.preu = preu;
    }
    //método abstracto que implementaremos en las subclases.
    public abstract double calculaImpost();

    
    // GETTERS Y SETTERS 
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }
    
    @Override    
    public String toString(){
        return "Marca: " + this.marca + ", Model: " + this.model + ", Preu: " + this.preu;
    }
    
    
    
    
}
