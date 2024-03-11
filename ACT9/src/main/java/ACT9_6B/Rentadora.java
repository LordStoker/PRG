/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_6B;

/**
 *
 * @author Tomas
 */
public final class Rentadora extends Electrodomestic {
    
    private int capacitatCarrega;

    public Rentadora(char classeEnergetica, String nom, double preu, double consumEnergetic, int garantiaMesos, int capacitatCarrega) {
        super(nom, preu, consumEnergetic, garantiaMesos, classeEnergetica);
        this.capacitatCarrega = capacitatCarrega;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", capacitat Carrega: " + this.capacitatCarrega + " kg";
    }
    
    @Override
    public boolean equals(Object o){
        Rentadora r = (Rentadora) o;
        return super.equals(r) && r.capacitatCarrega == this.capacitatCarrega;
    }
    
}
