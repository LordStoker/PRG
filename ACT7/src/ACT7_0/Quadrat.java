/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT7_0;

/**
 *
 * @author Tomas
 * Clase que almacena los lados de un cuadrado
 */
public class Quadrat {
    private double lado;
    
    public Quadrat(double lado) {
        this.lado = lado;
    }
    
    private Quadrat (){
        
    }
    /**
     * 
     * @return Devuelve el perímetro del cuadrado 
     */
    public double calcularPerimetro(){
        return Math.pow(4, lado);
    }
    /**
     * 
     * @return Devuelve el perímetro del cuadrado 
 
     */
    public double calcularArea(){
        return Math.pow(lado, 2);
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
}
