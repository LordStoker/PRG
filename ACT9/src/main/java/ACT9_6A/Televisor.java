/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_6A;

/**
 *
 * @author Tomas
 */
public class Televisor extends Producte{
    
     public Televisor(String nom, double preu, double consumEnergetic, int garantiaMesos, int midaPantalla){
     super(nom, preu, consumEnergetic, garantiaMesos, midaPantalla);
    }    

    @Override
    public double calculaDescompte() {
        if(super.getMidaPantalla() > 40){
            return super.getPreu() / 1.12;
        }
        else{
            return super.getPreu() /1.08;
        }
    }
    
   @Override
   public String toString(){
        return "Nom: " + super.getNom() + ", preu: " + super.getPreu() + ", consum energètic: " + super.getConsumEnergetic() + ", Mesos garantia: " + super.getGarantiaMesos() + 
                ", mida pantalla: " + super.getMidaPantalla();
    }
}
