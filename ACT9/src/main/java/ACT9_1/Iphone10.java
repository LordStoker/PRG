/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_1;

/**
 *
 * @author Tomas
 */
public class Iphone10 extends Iphone8 implements ValidadorDispositius {
    
    private String patroRostre;
    
    public Iphone10 (String marca, Persona persona, String patroCodiPin, String patroEmprempta, String patroRostre){
        super(marca, persona, patroCodiPin, patroEmprempta);
        this.patroRostre = patroRostre;
    }
    
    @Override
    public void setPatrons(String patroCodiPin, String patroTeclat, String patroEmprempta, String patroRostre){
        super.setPatrons(patroCodiPin, patroTeclat, patroEmprempta, patroRostre);
        setPatroRostre(patroRostre);        
    }
    
    @Override    
    public boolean validaPatrons(Persona persona) {
        if (super.getOnOff()) {
            if (super.validaPatrons(persona)) {
                return true;
            }
            else if (this.patroRostre.equals(persona.getPatroRostre())) {
                return true;
            }
            else {
                return super.getOnOff();
            }
        }
        else{
            System.out.println("El terminal está apagado\n");
            System.out.println("Encendiendo terminal...");
            super.setOnOff(true);
            return false;
        }
    }
        
    
    public void setPatroRostre(String patroRostre){
        this.patroRostre = patroRostre;
    }
}


