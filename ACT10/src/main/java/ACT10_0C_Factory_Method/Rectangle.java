/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT10_0C_Factory_Method;

/**
 *
 * @author Tomas
 */
public class Rectangle implements FiguraGeometrica {
    double amplada, alcada;
    
    public Rectangle(double amplada, double alcada){
        this.alcada = alcada;
        this.amplada = amplada;
    }
    
    public Rectangle(){
        
    }
    
    @Override 
    public double calculaArea(){
        return amplada * alcada;
    }
}