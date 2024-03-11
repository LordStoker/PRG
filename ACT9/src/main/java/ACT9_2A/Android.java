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
public class Android extends Telefon {
    private String patroCodiPin;
    private String patroTeclat;
    private String patroEmprempta;
    
    //Constructor
    public Android(String marca, Persona persona, String patroCodiPin, String patroTeclat, String patroEmprempta) {
        super(marca, persona, false);
        setPatroCodiPin(patroCodiPin);
        setPatroTeclat(patroTeclat);
        setPatroEmprempta(patroEmprempta);
    }   


    @Override    
    public String toString(){
        return " Código PIN: " + this.patroCodiPin + ", Patrón teclat: " + this.patroTeclat + ", Patrón emprempta: " + this.patroEmprempta;
    }
    
    @Override
    public boolean equals (Object o){
        Android a = (Android) o;
        return a.patroCodiPin.equals(this.patroCodiPin) && a.patroTeclat.equals(this.patroTeclat) && a.patroEmprempta.equals(this.patroEmprempta);
    }

    @Override
    public void on() {
        System.out.println("Teléfono encendido");        
        if(this.onOff == false){
            this.onOff = true;
        }
    }

    @Override
    public void off() {
        System.out.println("Teléfono apagado");        
        if(this.onOff == true){
            this.onOff = false;
        }
    }
    
    @Override
    public void setPatrons(String patroCodiPin, String patroTeclat, String patroEmprempta, String patroRostre) {
        setPatroCodiPin(patroCodiPin);
        setPatroTeclat(patroTeclat);
        setPatroEmprempta(patroEmprempta);
 
    }

    @Override
    public boolean validaPatrons(Object o) {       

        if(super.getOnOff()){            
            if(this.patroCodiPin != null){
                return this.patroCodiPin.equalsIgnoreCase(persona.getPatroCodiPin());
            }
            if(this.patroTeclat != null){
                return this.patroTeclat.equalsIgnoreCase(persona.getPatroTeclat());
            }
            if(this.patroEmprempta != null){
                return this.patroEmprempta.equalsIgnoreCase(persona.getPatroEmprempta());
            }
            else{
                return false;
            }
        }
        else{
            return super.getOnOff();
        }
    }
    
            
    //Setters
    public void setPatroCodiPin(String patroCodiPin) {
        this.patroCodiPin = patroCodiPin;
    }

    public void setPatroTeclat(String patroTeclat) {
        this.patroTeclat = patroTeclat;
    }

    public void setPatroEmprempta(String patroEmprempta) {
        this.patroEmprempta = patroEmprempta;
    }
    
}
