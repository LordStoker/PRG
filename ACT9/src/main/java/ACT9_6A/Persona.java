/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_6A;

import java.util.ArrayList;

/**
 *
 * @author Tomas
 */
public class Persona {
    
    private String nom;
    private String cognom;
    private ArrayList<Producte> productes;

    public Persona(String nom, String cognom, Telefon telefon, Portatil portatil, Televisor televisor){
        this.nom = nom;
        this.cognom = cognom;

    }
    
    public double calculaPreuTotal(){
        double preu = 0;
         for(Producte p : productes){
            preu += p.getPreu() - p.calculaDescompte();
        }
         return preu;
    }
    
    @Override
    public String toString(){
        String text = "";
        text += "Nom: " + this.nom + ", cognom: " + this.cognom + "\n Productes : ";
                for(Producte p : productes){
                    text += p.toString();
                }
                return text;
    }
    
}
