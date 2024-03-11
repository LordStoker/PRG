/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT8_0D;

/**
 *
 * @author Tomas
 */
public class Estudiant extends Persona {
    
    private String curs;
    
    public Estudiant (String nom, int edat, String curs){
        super(nom, edat);
        this.curs = curs;
    }
    
    public String getCurs(){
        return curs;
    }
    
    public void setCurs(String curs){
        this.curs = curs;
    }
    
    @Override
    public String toString(){
        return super.toString() + " " + "ESTUDIANT Nom: " + super.getNom() + " Edat: " + super.getEdat() + " " + curs;
    }
    
    @Override
    public boolean equals(Object o){
        Estudiant e = (Estudiant) o;        
        if(e.getNom().equals(this.getNom()))
            return true;
        else
            return false;
    }
    
}
