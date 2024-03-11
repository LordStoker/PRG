/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_6B;

/**
 *
 * @author tomas
 */
public abstract class Producte {
    protected String nom;
    protected double preu;
    protected double consumEnergetic;
    protected int garantiaMesos;

    public Producte(String nom, double preu, double consumEnergetic, int garantiaMesos) {
        this.nom = nom;
        this.preu = preu;
        this.consumEnergetic = consumEnergetic;
        this.garantiaMesos = garantiaMesos;
    }
    
    @Override
    public String toString(){
        return "Nom: " + this.nom + ", preu: " + this.preu + 
                ", consum energètic: " + this.consumEnergetic + ", mesos garantia: " + this.garantiaMesos;
    }
    
    @Override
    public boolean equals(Object O){
        Producte p = (Producte) O;
        return p.nom.equals(this.nom) && p.preu == this.preu && p.consumEnergetic == this.consumEnergetic
                && p.garantiaMesos == this.garantiaMesos;
    }
    
}
