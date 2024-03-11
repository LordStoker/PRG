/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT6_0B;

/**
 *
 * @author Tomas
 */
public class Cercle {
    public double radi;
    
    public double calcularArea(){
        return Math.PI * Math.pow(radi, 2);
    }
    
    public double calcularPerimetro(){
        return 2 * (Math.PI + radi);
    }
}
