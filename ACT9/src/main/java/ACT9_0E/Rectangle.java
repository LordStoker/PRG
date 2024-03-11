/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_0E;

/**
 *
 * @author Tomas
 */
public class Rectangle implements FiguraGeometrica, Coloreador {
    
    String color;
    double amplada, alcada;
    
    public Rectangle (String color, double amplada, double alcada){
        this.color = color;
        this.amplada = amplada;
        this. alcada = alcada;
    }
    
    @Override
    public double calculaArea(){
        return amplada * alcada;
    }
    
    @Override
    public void aplicaColor(String color){        
        this.color = color;
    }
    
    @Override
    public String toString(){
        return "Color: " + color + " Amplada: " + amplada + " Alçada: " + alcada;
    }
}
