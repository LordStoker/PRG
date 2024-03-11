/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT6_0B;

/**
 *
 * @author Tomas
 */
public class Rectangle {
    
    public double base;
    public double lado;
    
    public double calcularArea(){
        return base * lado;        
    }
    
    public double calcularPerimetro(){
        return 2 * (base + lado);
    }
    
}
