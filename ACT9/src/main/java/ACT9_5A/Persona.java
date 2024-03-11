/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_5A;

import java.util.ArrayList;

/**
 *
 * @author Tomas
 */
public class Persona {
    
    private String nom;
    private int edat;
    private ArrayList<ProducteBancari> productesBancaris = new ArrayList<>();
    
    public Persona(String nom, int edat, ArrayList<ProducteBancari> productesBancaris){
        this.nom = nom;
        this.edat = edat;
        this.productesBancaris = productesBancaris;
    }
    
    public  double calculaRemuneracioTotal(){
        double remuneracio = 0;
        for(ProducteBancari pB : productesBancaris){
            remuneracio += pB.calculaRemuneracio();
        }
        return remuneracio;        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public ArrayList<ProducteBancari> getProductesBancaris() {
        return productesBancaris;
    }

    public void setProductesBancaris(ArrayList<ProducteBancari> productesBancaris) {
        this.productesBancaris = productesBancaris;
    }
    
    @Override
    public String toString(){
        String text = "Nom: " + this.nom + ", edat: " + this.edat + ", Productes bancaris: {";
        for(ProducteBancari pB : productesBancaris){
            text += "\n\t" + pB.toString() + "\n";
        }
        return text + "}";
    }
    
    
    
    
    
}
