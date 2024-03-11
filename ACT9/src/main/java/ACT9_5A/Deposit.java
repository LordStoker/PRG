/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_5A;

/**
 *
 * @author Tomas
 */
public class Deposit extends ProducteBancari {
    
    private int nombrePeriodes;
    
    public Deposit(String codiProducte, String nom, double importContractat, double interesPeriode, int nombrePeriodes){
        super(codiProducte, nom, importContractat, interesPeriode);
        this.nombrePeriodes = nombrePeriodes;
    }
    
    @Override
    public double calculaRemuneracio(){
        return getImportContractat() * getInteresPeriode() * this.nombrePeriodes;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", nº Periodes: " + this.nombrePeriodes;
    }
    
    
    
    
    
    
}
