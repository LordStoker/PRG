/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_0E;

/**
 *
 * @author Tomas
 */
public class Cercle implements FiguraGeometrica, Coloreador {
    
    String color;
    double radi;
    
    public Cercle (String color, double radi){
        
        this.color = color;
        this.radi = radi;
    }
    
    @Override
    public double calculaArea(){
        return Math.PI * Math.pow(radi, 2);
    }
    
    @Override
    public void aplicaColor(String color){
        this.color = color;
    }
    
    @Override
    public String toString(){        
        return "Color: " + color + " Radi; " + radi;
    }
    
}
