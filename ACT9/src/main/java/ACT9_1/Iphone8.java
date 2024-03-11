/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_1;

/**
 *
 * @author Tomas
 */
public class Iphone8 extends Telefon implements ValidadorDispositius {
    
    protected String patroCodiPin;
    protected String patroEmprempta;
    
    public Iphone8(String marca, Persona persona, String patroCodiPin, String patroEmprempta){
        super(marca, persona, false);
        this.patroCodiPin = patroCodiPin;
        this.patroEmprempta = patroEmprempta;
    }

    @Override
    public void on() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void off() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @Override
    public void setPatrons(String patroCodiPin, String patroTeclat, String patroEmprempta, String patroRostre) {
        setPatroCodiPin(patroCodiPin);
        setPatroEmprempta(patroEmprempta);

    }

    @Override
    public boolean validaPatrons(Persona persona) {

        if(super.getOnOff()){
            
            if(this.patroCodiPin != null){
                return this.patroCodiPin.equalsIgnoreCase(persona.getPatroCodiPin());
            }
            if(this.patroEmprempta != null){
                return this.patroEmprempta.equalsIgnoreCase(persona.getPatroCodiPin());
            }
            else{
                return false;
            }
        }
        else{
            System.out.println("El terminal se encuentra apagado\n");
            System.out.println("Encendiendo el terminal...");
            super.setOnOff(true);
            return super.getOnOff();
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
