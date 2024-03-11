/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_5A;

/**
 *
 * @author Tomas
 */
public abstract class Tarjeta {
    protected String codiTarjeta;
    protected double comisUs;
    protected double importMaximCaixer;
    protected double importMaximCompra;


    public Tarjeta(String codiTarjeta, double comisUs, double importMaximCaixer, double importMaximCompra){
        this.codiTarjeta = codiTarjeta;
        this.comisUs = comisUs;
        this.importMaximCaixer = importMaximCaixer;
        this.importMaximCompra = importMaximCompra;        
    }
    
    @Override
    public String toString(){
        return "Codi Tarjeta: " + this.codiTarjeta + ", Comisió Ús: " + this.comisUs + ", Import Màxim Caixer: " + this.importMaximCaixer + ", Import Màxim Compra: " + this.importMaximCompra;
    }
}
