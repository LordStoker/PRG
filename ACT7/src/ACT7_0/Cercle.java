/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT7_0;

/**
 *
 * @author Tomas
 * 
 * Clase que almacen el radio de un círculo.
 */
public class Cercle {
    private double radi;
    /**
     
   
     */
    public Cercle(double radi) {
    this.radi = radi;
    }
    private Cercle (){
        
    }
    /**
     * 
     * @return Devuelve el área del círculo
     */
    public double calcularArea(){
        return Math.PI * Math.pow(radi, 2);
    }
    /**
     * 
     * @return Devuelve el perímetro del círculo 
     */
    public double calcularPerimetro(){
        return 2 * (Math.PI + radi);        
    }

    public double getRadi() {
        return radi;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }


}
