/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_2A;

import ACT9_1.*;
import java.util.ArrayList;

/**
 *
 * @author Tomas
 */
public abstract class Telefon implements DispositiuElectronic, ValidadorDispositius {
    
    protected String marca;
    protected Persona persona;
    protected boolean onOff;
    
    
    //Constructor
    public Telefon(String marca, Persona persona, boolean onOff){
        this.marca = marca;
        this.persona = persona;
        this.onOff = onOff;
    }
    
    
    
    @Override
    public String toString(){
        return "Marca: " + this.marca;
       
    }
    
    @Override
    public void on(){
        System.out.println("Teléfono encendido");
        if(!this.onOff){
            this.onOff = true;
        }
    }
    @Override
    public void off(){
        System.out.println("Teléfono apagado");
        if(this.onOff){
            this.onOff = false;
        }
    }
    
    @Override
    public boolean equals (Object o){
        Telefon t = (Telefon) o;
        return t.marca.equals(this.marca) && t.persona.equals(this.persona);
    }
    //Setters y Getters
    public boolean getOnOff(){
        return onOff;
    }
    
    public void setOnOff(boolean onOff){
        this.onOff = onOff;
    }

    
    
}
