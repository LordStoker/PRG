/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_6A;

/**
 *
 * @author Tomas
 */
public abstract class Producte {
    private String nom;
    private double preu;
    private double consumEnergetic;
    private int garantiaMesos;
    private int midaPantalla;
    
    public Producte(String nom, double preu, double consumEnergetic, int garantiaMesos, int midaPantalla){
        this.nom = nom;
        this.preu = preu;
        this.consumEnergetic = consumEnergetic;
        this.garantiaMesos = garantiaMesos;
        this.midaPantalla = midaPantalla;
    }
    
    public abstract double calculaDescompte();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public double getConsumEnergetic() {
        return consumEnergetic;
    }

    public void setConsumEnergetic(double consumEnergetic) {
        this.consumEnergetic = consumEnergetic;
    }

    public int getGarantiaMesos() {
        return garantiaMesos;
    }

    public void setGarantiaMesos(int garantiaMesos) {
        this.garantiaMesos = garantiaMesos;
    }

    public int getMidaPantalla() {
        return midaPantalla;
    }

    public void setMidaPantalla(int midaPantalla) {
        this.midaPantalla = midaPantalla;
    }
    
    
    
    @Override
    public abstract String toString();
    
    
}
