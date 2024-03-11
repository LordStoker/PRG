/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ACT9_2B;

import ACT9_2A.*;
import ACT9_1.*;

/**
 *
 * @author Tomas
 */
public abstract class ValidadorDispositius {
    
    protected String[] patrons = {null, null, null, null}; // patroCodiPin, patroTeclat, patroEmprempta, patroRostre
    
    //Constructor
    public ValidadorDispositius(String[] patrons){
        this.patrons = patrons;
    }    
    public abstract boolean validaPatrons(Object o);
    

    //Método concreto
    public void setPatrons(String[] patrons){
        setPatroCodiPin(patrons[0]);
        setPatroTeclat(patrons[1]);
        setPatroEmprempta(patrons[2]);
        setPatroRostre(patrons[3]);    
}    
    
    // GETTERS Y SETTERS
    public String getPatroCodiPin(){
        return patrons[0];
    }
    public String getPatroTeclat(){
        return patrons[1];
    }
    public String getPatroEmprempta(){
        return patrons[2];
    }
    public String getPatroRostre(){
        return patrons[3];
    }
    
    public void setPatroCodiPin(String patroCodiPin){
        this.patrons[0] = patroCodiPin;
    }
    public void setPatroTeclat(String patroTeclat){
        this.patrons[1] = patroTeclat;
    }    
    public void setPatroEmprempta(String patroEmprempta) {
        this.patrons[2] = patroEmprempta;
    }
    public void setPatroRostre(String patroRostre) {
        this.patrons[3] = patroRostre;
    }
    
}
