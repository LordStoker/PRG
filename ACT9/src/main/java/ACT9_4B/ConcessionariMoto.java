/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_4B;

import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public class ConcessionariMoto implements Concessionari {
    
    private ArrayList<Motocicleta> motos = new ArrayList<>();
    
    public ConcessionariMoto(){
        
    }

    @Override
    public double calculaIngressos() {
        double ingresos = 0;
        
        for(Motocicleta m : motos){
            ingresos += m.getPreu() + m.calculaImpost();
        }
        return ingresos;        
    }
    
    public void setMotocicleta(Motocicleta moto){
        motos.add(moto);
    }
    
    @Override
    public String toString(){        
        String text = "";
        for(Motocicleta m : motos){
            text = text +=  m.toString() + " Imposts " + m.calculaImpost();            
        }
        return "Concessionario Motos: {" + text + "\n" + "}";        
    }
}
