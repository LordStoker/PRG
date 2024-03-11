/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_5B;

/**
 *
 * @author Tomas
 */
public class FonsInversio extends ProducteBancari {
    
    private double comisApertura;
    private int nombrePeriodes;
    
    public FonsInversio(String codiProducte, String nom, double importContractat, double interesPeriode, double comisApertura, int nombrePeriodes){
        super(codiProducte, nom, importContractat, interesPeriode);
        this.comisApertura = comisApertura;
        this.nombrePeriodes = nombrePeriodes;
    }

    @Override
    public double calculaRemuneracio() {
        return (super.getImportContractat() * super.getInteresPeriode() * this.nombrePeriodes) - this.comisApertura;
    }

    public double getComisApertura() {
        return comisApertura;
    }

    public void setComisApertura(double comisApertura) {
        this.comisApertura = comisApertura;
    }

    public int getNombrePeriodes() {
        return nombrePeriodes;
    }

    public void setNombrePeriodes(int nombrePeriodes) {
        this.nombrePeriodes = nombrePeriodes;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", comisión apertura: " + this.comisApertura + ", nº periodes: " + this.nombrePeriodes;
    }
    
    
    
    
    
}
