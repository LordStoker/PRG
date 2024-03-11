/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_5A;

import java.util.ArrayList;

/**
 *
 * @author Tomas
 */
public class CompteEstalvis extends ProducteBancari {
    
    protected double comisMantCompte;
    protected ArrayList<Tarjeta> tarjetes = new ArrayList<>();


    public CompteEstalvis(String codiProducte, String nom, double importContractat, double interesPeriode, double comisMantCompte, ArrayList<Tarjeta> tarjetes){
        super(codiProducte, nom, importContractat, interesPeriode);
        this.comisMantCompte = comisMantCompte;
        this.tarjetes = tarjetes;        
    }
    @Override
    public double calculaRemuneracio(){        
        double remuneracio =- (this.comisMantCompte);
        for(Tarjeta t : tarjetes){
            remuneracio -= t.comisUs;            
        }        
        return remuneracio;
    }
    
    @Override
    public String toString(){
        String text = super.toString() +  ", Comisión Manteniment Compte: " + this.comisMantCompte + ", Tarjetes del client: {" ;
        for(Tarjeta t : tarjetes){
            text += "\n\t" + t.toString() + "\n";
        }
        return  "}" + text;
    }
    
}
