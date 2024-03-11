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
public class Iphone10 extends Iphone8 {
    
    private String patroRostre;
    
    public Iphone10 (String marca, Persona persona, String patroCodiPin, String patroEmprempta, String patroRostre){
        super(marca, persona, patroCodiPin, patroEmprempta);
        setPatroRostre(patroRostre);
    }
    
    @Override
    public void setPatrons(String patroCodiPin, String patroTeclat, String patroEmprempta, String patroRostre){
        super.setPatroCodiPin(patroCodiPin);
        super.setPatroEmprempta(patroEmprempta);
        setPatroRostre(patroRostre);        
    }
    
    @Override    
    public boolean validaPatrons(Object o) {
        Persona persona = (Persona) o;
        if (super.getOnOff()) {
            if (super.validaPatrons(persona)) {
                return true;
            }
            else
                if (persona.getPatroRostre() != null){
                       return (persona.getPatroRostre().equalsIgnoreCase(this.patroRostre));
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
        
    
    public void setPatroRostre(String patroRostre){
        this.patroRostre = patroRostre;
    }
}


