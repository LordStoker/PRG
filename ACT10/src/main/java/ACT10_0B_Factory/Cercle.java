/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT10_0B_Factory;

/**
 *
 * @author Tomas
 */
public class Cercle implements FiguraGeometrica {
    double radi;
    
    public Cercle(double radi){
        this.radi = radi;
    }
    
    public Cercle(){
        
    }
    
    //Implementación del método de FiguraGeometrica
    
    @Override
    public double calculaArea(){
        return Math.PI * Math.pow(radi, 2);
    }
    
    public void setRadi(double radi){
        this.radi = radi;
    }
    
}
