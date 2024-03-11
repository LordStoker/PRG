/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT7_2;

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
        
        
        Compte compte = new Compte("La Caixa", "oficina", "2100200303020010","ABCD", 0.56 );
  
        comptes.add(compte);
        
        
        Compte compte2 = new Compte("BBVA", "oficina2", "2100200303020010", "ABCD2", 0.00);
       
        comptes.add(compte2);
        
        Compte compte3 = new Compte("ING","oficina3", "2100200303020010", "ABCD3",0 );
          
        comptes.add(compte3);
        
        
        Client client = new Client("Gómez","Rausano", "Espe");
        client.getComptes().add(compte);
        client.getComptes().add(compte2);
        client.getComptes().add(compte3);
        
            // Realitzar transaccions
            try {
                client.realizaTransaccio(compte,500.0);
                client.realizaTransaccio(compte,-200.0);
                client.realizaTransaccio(compte2,1000.0);
                client.realizaTransaccio(compte2,-500.0);
                client.realizaTransaccio(compte3,500.0);
                client.realizaTransaccio(compte3,-1500.0); // transacció no es realitzarà
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        
        
        
        
        
        
    }
    
}
