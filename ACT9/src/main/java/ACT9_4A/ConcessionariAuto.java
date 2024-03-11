/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_4A;

import ACT9_4B.*;
import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public class ConcessionariAuto implements Concessionari {
    
    private ArrayList<Vehicle> autos;
    
    public ConcessionariAuto(ArrayList<Vehicle> autos){
        this.autos = autos;
    }
        
    public ConcessionariAuto(){        
    }
    

    @Override
    public double calculaIngressos() {
        double ingresos = 0;
        
        for(Vehicle v : autos){
            ingresos = v.getPreu() + v.calculaImpost();
        }
        return ingresos;        
    }
    
    public void setVehicle(Vehicle vehicle){
        autos.add(vehicle);
    }
    
    @Override
    public String toString(){        
        String text = "";
        for(Vehicle v : autos){
            text = text +=  v.toString() + " Imposts " + v.calculaImpost();            
        }
        return "Concessionario Autos: {" + text + "\n" + "}";
        
        
        
    }
    
}
