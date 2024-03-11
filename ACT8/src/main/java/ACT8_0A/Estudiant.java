/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT8_0A;

/**
 *
 * @author Tomas
 */
public class Estudiant extends Persona {
    private String curs;
    
    public Estudiant(String nom, int edat, String curs){
        super(nom, edat);
        this.curs = curs;
    }
    
    public void mostraEstudiant(){
        mostraPersona();
        System.out.println("Curs: " + curs);
    }
    
    public String getCurs(){
        return curs;
    }
    
    public void setCurs(String curs){
        this.curs = curs;
    }
    
}
