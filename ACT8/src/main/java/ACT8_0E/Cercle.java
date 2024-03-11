/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT8_0E;

/**
 *
 * @author tomas
 */
public class Cercle extends Figura {
    
    public double radi;

    public Cercle(String color, double radi) {
        super(color);
        this.radi = radi;
    }
    public double calcularArea() {
        return Math.PI * Math.pow(radi, 2);
    }

    @Override
    public double calcularPerimetre() {
        return Math.PI * 2 * radi;
        
    }
    
        @Override
    public String toString(){
        return super.toString() + " el radio es " + radi;
    }
    
    @Override
    public boolean equals(Object o){
        Cercle c = (Cercle) o;
        return (super.equals(o) && c.equals(this.radi));
    }
    
}
