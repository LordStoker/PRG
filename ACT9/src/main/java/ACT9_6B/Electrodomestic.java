/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_6B;

/**
 *
 * @author tomas
 */
public abstract class Electrodomestic extends Producte {
    protected char classeEnergetica;

    public Electrodomestic(String nom, double preu, double consumEnergetic, int garantiaMesos, char classeEnergetica) {
        super(nom, preu, consumEnergetic, garantiaMesos);
        this.classeEnergetica = classeEnergetica;
    }
    
    public final double calculaSuplement(){
        double preuDescomptat = 0;
        if(this.classeEnergetica == 'A'){
            preuDescomptat = super.preu * 1.05;
        }
        else if(this.classeEnergetica == 'B'){
            preuDescomptat = super.preu * 1.10;
        }
        else if(this.classeEnergetica == 'C'){
            preuDescomptat = super.preu * 1.15;
        }
        return preuDescomptat;
    }
    
    @Override 
    public String toString(){
        return super.toString() + ", Classe Energetica: " + this.classeEnergetica;
    }
    
    @Override
    public boolean equals(Object o){
        Electrodomestic e = (Electrodomestic) o;
        return super.equals(e) && e.classeEnergetica == this.classeEnergetica;
    }
    
    
    
    
}
