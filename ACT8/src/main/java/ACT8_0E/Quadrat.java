/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT8_0E;

/**
 *
 * @author tomas
 */
public class Quadrat extends Figura{
    
    private double costat;

    public Quadrat(double costat, String color) {
        super(color);
        this.costat = costat;
    }

    @Override
    public double calcularArea() {
        return Math.pow(costat, 2);        
    }

    @Override
    public double calcularPerimetre() {
        return Math.pow(4, costat);
    }
    
    @Override
    public String toString(){
        return super.toString() + " y el tamaño de los lados es " + costat;
    }
    
    @Override
    public boolean equals(Object o){
        Quadrat q = (Quadrat) o;
        return (super.equals(o) && q.equals(this.costat));
    }
    
    
}
