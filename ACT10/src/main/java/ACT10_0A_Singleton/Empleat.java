/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT10_0A_Singleton;

/**
 *
 * @author Tomas
 */
public class Empleat {
    private String nom;
    private String llinatge;
    
    private static Empleat empleat; // static, para asegurar que sólo hay 1 empleado
    
    //Constructor en private
    
    private Empleat(String nom, String llinatge){
        this.nom = nom;
        this.llinatge = llinatge;
    }
    
    //Pseudo-constructor
    
    public static Empleat getEmpleat(String nom, String llinatge){ // Devuelve el valor del atributo empleado
        if(empleat == null) // si no se ha instanciado 
            empleat = new Empleat(nom, llinatge);
        return empleat;        
    }
    
    @Override
    public String toString(){
        return this.nom + " " + this.llinatge;
    }
    
}
