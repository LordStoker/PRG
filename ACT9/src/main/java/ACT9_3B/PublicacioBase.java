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
public abstract class PublicacioBase implements Publicacio {
    protected String titol;
    protected int anyPublicacio;
    protected double preu;
    
    public PublicacioBase (String titol, int anyPublicacio, double preu){
        this.titol = titol;
        this.anyPublicacio = anyPublicacio;
        this.preu = preu;
    }
    
    @Override
    public String toString(){
        return "Titol: " + this.titol + ", any publicació: " + this.anyPublicacio;
    }
    
}
