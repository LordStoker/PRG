/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_0A;

/**
 *
 * @author Tomas
 */
public class Quadrat implements FiguraGeometrica {
    
    private double costat;
    
    public Quadrat(double costat){
        this.costat = costat;
    }
    
    @Override
    public double calculaArea(){
        return Math.pow(costat, 2);
    }
    
    @Override
    public double calculaPerimetre(){
        return 0;
    }
    
    @Override 
    public int calculaNCostat(){
        return 4;
    }
    
}
