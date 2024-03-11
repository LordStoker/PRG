/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_2B;

import ACT9_2A.*;
import ACT9_1.*;

/**
 *
 * @author Tomas
 */
public class Persona extends ValidadorDispositius{
    
    private String nom;  
    
    //Constructor
    public Persona(String nom) {
        super(new String[] {null, null, null, null});
        this.nom = nom;  
    }
    
    @Override
    public boolean validaPatrons(Object o) {
        Telefon telefon = (Telefon) o;
        
        if (telefon.getOnOff()) {
            if (this.getPatroCodiPin() != null) 
                return this.getPatroCodiPin().equals(telefon.getPatroCodiPin());
            if (this.getPatroTeclat() != null) 
                return this.getPatroTeclat().equals(telefon.getPatroTeclat());
            if (this.getPatroEmprempta() != null) 
                return this.getPatroEmprempta().equals(telefon.getPatroEmprempta());
            if (this.getPatroRostre() != null) 
                return this.getPatroRostre().equals(telefon.getPatroRostre());
            return false;
        } else {
            System.out.println("Telèfon no encès");
            return false;
        }     
    }
    //Setter y Getter
    public String getNom() {
        return nom;
    }
}
