/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT6_2A;

/**
 *
 * @author Tomas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Compte compte = new Compte();
        
        compte.banc = "La Caixa";
        compte.oficina = "oficina";
        compte.numeroCompte = "2100200303020010";
        compte.dc = "ABCD";
        compte.saldo = 72978.56;
        
        
        Client client = new Client();
        
        client.llinatge1 = "Gómez";
        client.llinatge2 = "Rausano";
        client.nom = "Espe";
        client.compte = compte;
        
        client.realizaTransaccio(500);
        
        
        System.out.println(client.compte.banc); 
            
        
        
        
        
    }
    
}
