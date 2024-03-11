/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_6B;

import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public class Persona {
    private String nom;
    private String cognom;
    private ArrayList<Producte> productes;
    
    public Persona(String nom, String cognom, ArrayList<Producte> productes){
        this.nom = nom;
        this.cognom = cognom;
        this.productes = productes;
    }
    
    public double calculaPreuTotal(){
        double preuTotal = 0;
        for(Producte p : productes){
           if(p instanceof Electrodomestic){
               preuTotal += ((Electrodomestic) p).preu + ((Electrodomestic) p).calculaSuplement();
           }
           else if(p instanceof Electronic){
               preuTotal += ((Electronic) p).preu - ((Electronic) p).calculaDescompte();
           }
        }
        return preuTotal;
        
    }
    
}
