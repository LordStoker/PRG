/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT6_2A;

/**
 *
 * @author Tomas
 */
public class Compte {
    public String banc;
    public String oficina;
    public String dc; 
    public String numeroCompte;
    public double saldo;
    
    
    public void ingresa (double quantitat){
        saldo = saldo + quantitat;
        System.out.println("Se ha ingresado la cantidad de " + quantitat + "€ a la cuenta " + numeroCompte
                +  " Saldo total de " + saldo);
    }
    
    public void reintegra(double quantitat){
        if (quantitat > saldo){
            System.err.print("No hay saldo suficiente");
        }
        else{
            saldo = saldo - quantitat;
        }
        
    }
    
    
}
