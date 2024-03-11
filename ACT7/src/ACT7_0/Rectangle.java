/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT7_0;

/**
 *
 * @author Tomas
 * Clase que almacena la bado y el lado de un rectángulo
 */
public class Rectangle {
    
    private double base;
    private double lado;
    
    
    public Rectangle(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }
    
    private Rectangle(){
        
    }
    /**
     * 
     * @return Devuelve el area del rectángulo
     */
    public double calcularArea(){
        return base * lado;        
    }
    /**
     * 
     * @return Devuelve el perimetro del rectángulo
     */
    public double calcularPerimetro(){
        return 2 * (base + lado);
    }



    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
}
