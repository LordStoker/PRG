/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_0A;

/**
 *
 * @author Tomas
 */
public class Cercle implements FiguraGeometrica{
    
    private double radi;
    
    public Cercle(double radi){
        this.radi = radi;
    }

    @Override
    public double calculaArea() {
        return Math.PI * Math.pow(radi ,2);
    }

    @Override
    public double calculaPerimetre() {
        return 0;
    }

    @Override
    public int calculaNCostat() {
        return 0;
    }
    
    
    
}
