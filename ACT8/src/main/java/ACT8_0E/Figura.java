/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT8_0E;

/**
 *
 * @author tomas
 */
public abstract class  Figura {
    protected String color;
    
    public Figura(String color){
        this.color = color;
    }
    
    @Override
    
    public String toString(){
        return "El color de la figura es el " + color;
    }
    
    @Override
    public boolean equals(Object o){
        Figura f = (Figura) o;
        return f.color.equals(this.color);
    }
    
    public abstract double calcularArea();
    
    public abstract double calcularPerimetre();    
    
}
