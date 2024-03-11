/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_3A;

/**
 *
 * @author tomas
 */
public class Llibre extends PublicacioBase{
    private String autor;
    private double preu;
    
    public Llibre(String titol, int anyPublicacio, String autor, double preu){
        super(titol, anyPublicacio);
        this.autor = autor;
        this.preu = preu;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", autor: " + this.autor + ", preu:" + this.preu;
    }
    
    @Override
    public double calculaPreu(){
        return this.preu *1.21;
    }
    
    
    
}
