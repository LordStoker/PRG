/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT6_0B;

/**
 *
 * @author Tomas
 */
public class Quadrat {
    public double lado;
    
    public double calcularPerimetro(){
        return Math.pow(4, lado);
    }
    
    public double calcularArea(){
        return Math.pow(lado, 2);
    }
    
}
