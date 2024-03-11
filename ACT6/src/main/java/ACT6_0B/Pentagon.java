/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT6_0B;

/**
 *
 * @author Tomas
 */
public class Pentagon {    
    public double base;
    public double apotema;
    
    public double calcularArea(){
        return calcularPerimetro() * apotema /2;
    }
    
    
    public double calcularPerimetro(){
        return 5 * base;
    }
    

}
