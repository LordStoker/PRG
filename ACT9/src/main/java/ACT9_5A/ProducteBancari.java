/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_5A;

/**
 *
 * @author Tomas
 */
public abstract class ProducteBancari {
    
    private String codiProducte;
    private String nom;
    private double importContractat;
    private double interesPeriode;
    
    public ProducteBancari(String codiProducte, String nom, double importContractat, double interesPeriode){
        this.codiProducte = codiProducte;
        this.nom = nom;
        this.importContractat = importContractat;
        this.interesPeriode = interesPeriode;        
    }
    
    public abstract double calculaRemuneracio();

    public String getCodiProducte() {
        return codiProducte;
    }

    public void setCodiProducte(String codiProducte) {
        this.codiProducte = codiProducte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getImportContractat() {
        return importContractat;
    }

    public void setImportContractat(double importContractat) {
        this.importContractat = importContractat;
    }

    public double getInteresPeriode() {
        return interesPeriode;
    }

    public void setInteresPeriode(double interesPeriode) {
        this.interesPeriode = interesPeriode;
    }
    
    @Override
    public String toString(){
        return "Codi: " + this.codiProducte + ", nom: " + this.nom + ", Import Contractat: " + this.importContractat + ", Interés Periode: " + this.interesPeriode;
        
    }
    
}
