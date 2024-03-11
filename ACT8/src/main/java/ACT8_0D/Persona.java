/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT8_0D;

/**
 *
 * @author Tomas
 */
public class Persona {
    private String nom;
    private int edat;
    
    public Persona(String nom, int edat){
        this.nom = nom;
        this.edat = edat;
    }
    
    public String getNom(){
        return nom;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public int getEdat(){
        return edat;
    }
    
    public void setEdat(int edat){
        this.edat = edat;
    }
    
    @Override
    public String toString(){
        return "PERSONA Nom: " + nom + ", Edat: " + edat;
    }
    
}
