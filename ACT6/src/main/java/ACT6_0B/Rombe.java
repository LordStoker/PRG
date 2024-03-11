/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT6_0B;

/**
 *
 * @author Tomas
 */
public class Rombe {
    
    public double base;
    public double diagonal1;
    public double diagonal2;
    
    
    public double calcularPerimetro(){
        return 4 * base;
    }
    
    public double calcularArea(){
        return (diagonal1 * diagonal2) /2;
    }
    
}
