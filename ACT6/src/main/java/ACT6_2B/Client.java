/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT6_2B;

import ACT6_2A.*;
import java.util.ArrayList;

/**
 *
 * @author Tomas
 */
public class Client {
    
    public String llinatge1;
    public String llinatge2;
    public String nom;
    public ArrayList <Compte> comptes;
    
    
    public void realizaTransaccio (Compte compte, double quantitat){
        if(quantitat > 0){
            compte.ingresa(quantitat);
        }
    
        else if (quantitat < 0){
            compte.reintegra(Math.abs(quantitat));
        }
    }
    public void mostraSaldo(){
        for(Compte cCuenta : comptes){
            System.out.println("El saldo de la cuenta " +  cCuenta.numeroCompte + "es de " + cCuenta.saldo + "€.");
        }
    }
}
    

    

