/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT6_2B;

import ACT6_2A.*;
import java.util.ArrayList;

/**
 *
 * @author Tomas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Compte> comptes = new ArrayList<>();
        
        
        Compte compte = new Compte();
        
        compte.banc = "La Caixa";
        compte.oficina = "oficina";
        compte.numeroCompte = "2100200303020010";
        compte.dc = "ABCD";
        compte.saldo = 72978.56;
        comptes.add(compte);
        
        
        Compte compte2 = new Compte();
        
        compte2.banc = "BBVA";
        compte2.oficina = "oficina2";
        compte2.numeroCompte = "2100200303020010";
        compte2.dc = "ABCD2";
        compte2.saldo = 3000.00;        
        comptes.add(compte2);
        
        Compte compte3 = new Compte();
        
        compte3.banc = "ING";
        compte3.oficina = "oficina3";
        compte3.numeroCompte = "2100200303020010";
        compte3.dc = "ABCD3";
        compte3.saldo = 10000;            
        comptes.add(compte3);
        
        
        Client client = new Client();
        
        client.llinatge1 = "Gómez";
        client.llinatge2 = "Rausano";
        client.nom = "Espe";
        client.comptes = comptes;
        
        client.realizaTransaccio(compte, 500.00);
        client.realizaTransaccio(compte3, -12000);
        
        for(Compte c : comptes){
            System.out.println(c.banc); 
        }
        
        client.mostraSaldo();
        
        
        
        
    }
    
}
