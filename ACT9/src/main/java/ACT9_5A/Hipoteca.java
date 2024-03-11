/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_5A;

/**
 *
 * @author Tomas
 */
public class Hipoteca extends ProducteBancari {
    
    protected double comisApertura;
    protected int nombrePeriodes;
    
    public Hipoteca(String codiProducte, String nom, double importContractat, double interesPeriode, double comisApertura, int nombrePeriodes){
         super(codiProducte, nom, importContractat, interesPeriode);
         this.comisApertura = comisApertura;
         this.nombrePeriodes = nombrePeriodes;        
    }

    @Override
    public double calculaRemuneracio() {
        return - (getImportContractat() * getInteresPeriode() * this.nombrePeriodes);
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Comisión apertura: " + this.comisApertura + ", nº Periodes: " + this.nombrePeriodes;
    }
    
}
