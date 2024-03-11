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
public class Persona {
    
    private String nom;
    private String patroCodiPin;
    private String patroTeclat;
    private String patroEmprempta;
    private String patroRostre;

    
    //Constructor
    public Persona(String nom, String patroCodiPin, String patroTeclat, String patroEmprempta, String patroRostre) {
        setNom(nom);
        setPatroCodiPin(patroCodiPin);
        setPatroTeclat(patroTeclat);
        setPatroEmprempta(patroEmprempta);
        setPatroRostre(patroRostre);
    }
    //Setter y Getter
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPatroCodiPin() {
        return patroCodiPin;
    }

    public void setPatroCodiPin(String patroCodiPin) {
        this.patroCodiPin = patroCodiPin;
    }

    public String getPatroTeclat() {
        return patroTeclat;
    }

    public void setPatroTeclat(String patroTeclat) {
        this.patroTeclat = patroTeclat;
    }

    public String getPatroEmprempta() {
        return patroEmprempta;
    }

    public void setPatroEmprempta(String patroEmprempta) {
        this.patroEmprempta = patroEmprempta;
    }

    public String getPatroRostre() {
        return patroRostre;
    }

    public void setPatroRostre(String patroRostre) {
        this.patroRostre = patroRostre;
    }
    
    
    
}
