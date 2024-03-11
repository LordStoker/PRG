/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_2A;

import ACT9_1.*;

/**
 *
 * @author Tomas
 */
public class Iphone8 extends Telefon {
    
    protected String patroCodiPin;
    protected String patroEmprempta;
    
    public Iphone8(String marca, Persona persona, String patroCodiPin, String patroEmprempta){
        super(marca, persona, false);
        setPatrons(patroCodiPin, null, patroEmprempta, null);
    }

    @Override
    public void setPatrons(String patroCodiPin, String patroTeclat, String patroEmprempta, String patroRostre) {
        setPatroCodiPin(patroCodiPin);
        setPatroEmprempta(patroEmprempta);
    }

    @Override
    public boolean validaPatrons(Object o){
        Persona persona = (Persona) o;
        if(super.getOnOff()){
            
            if(persona.getPatroCodiPin() != null){
                return persona.getPatroCodiPin().equalsIgnoreCase(this.patroCodiPin);
            }
            if(persona.getPatroEmprempta() != null){
                return persona.getPatroEmprempta().equalsIgnoreCase(this.patroEmprempta);
            }
            else{
                return false;
            }
        }
        else{
            System.out.println("El terminal está apagado");
            return false;
        }
    }
    
    @Override
    public String toString(){
        return super.toString() + " Patro PIN: " + this.patroCodiPin + ", Emprempta: " + this.patroEmprempta + ".";
    }
    
    @Override
    public boolean equals (Object o){
        Iphone8 i = (Iphone8) o;
        return i.patroCodiPin.equalsIgnoreCase(this.patroCodiPin) && i.patroEmprempta.equalsIgnoreCase(this.patroEmprempta);
    }

    //Setters
    public void setPatroCodiPin(String patroCodiPin){
        this.patroCodiPin = patroCodiPin;
    }
    
    public void setPatroEmprempta(String patroEmprempta){
        this.patroEmprempta = patroEmprempta;
    }
    

    
    
}
