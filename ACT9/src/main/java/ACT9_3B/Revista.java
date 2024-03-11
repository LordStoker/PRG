/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_3B;

import ACT9_3A.*;

/**
 *
 * @author tomas
 */
public class Revista extends PublicacioBase {
    private int numEdicio;

    
    public Revista (String titol, int anyPublicacio, int numeroEdicio, double preu){
        super(titol, anyPublicacio, preu);
        this.numEdicio = numeroEdicio;

    }
    
    @Override
    public String toString(){
        return super.toString() + ", nº Edició: " + this.numEdicio + ", preu: " + this.preu;
    }
    
    @Override
    public double calculaPreu(){
        return this.preu * 1.10;
    }
    
}
