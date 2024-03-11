/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT7_0;

/**
 *
 * @author Tomas
 * Clase que almacena la base y apotema de un pentágono
 */
public class Pentagon {    
    private double base;
    private double apotema;
    
    
    public Pentagon(double base, double apotema) {
        this.base = base;
        this.apotema = apotema;
    }
    
    private Pentagon(){        
    }
    /**
     * 
     * @return calcularArea() devuelve el área del pentágono 
     */
    public double calcularArea(){
        return calcularPerimetro() * apotema /2;
    }

    /**
     * 
     * @return Devuelve el perímetro del pentágono 
     */
    public double calcularPerimetro(){
        return 5 * base;
    }



    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
    

}
