/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_5A;

/**
 *
 * @author Tomas
 */
public class Credit extends Tarjeta{
    private double importEnNegatiu;
    
    public Credit(String codiTarjeta, double comisUs, double importMaximCaixer, double importMaximCompra, double importEnNegatiu){
       super(codiTarjeta, comisUs, importMaximCaixer, importMaximCompra);
       this.importEnNegatiu = importEnNegatiu;       
    }
    
    @Override
    
    public String toString(){
        return super.toString() + ", Import en Negatiu: " + this.importEnNegatiu;
    }
    
    
    
}
