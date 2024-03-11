/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_5A;

/**
 *
 * @author Tomas
 */
public class Debit extends Tarjeta{
    
    private double importCompraMinim;
    
    public Debit(String codiTarjeta, double comisUs, double importMaximCaixer, double importMaximCompra, double importCompraMinim){
        
        super(codiTarjeta, comisUs, importMaximCaixer, importMaximCompra);
        this.importCompraMinim = importCompraMinim;
    }
    
    @Override
    
    public String toString(){
        return super.toString() + ", Import Compra Minim: " + this.importCompraMinim;
    }
}
