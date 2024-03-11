/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT9_5A;

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
        // TODO code application logic here

        ArrayList<ProducteBancari> productesBancaris = new ArrayList<>();
        ArrayList<Tarjeta> tarjetas = new ArrayList<>();
        Tarjeta tarjeta = new Debit ("1234", 9, 600, 2000, 200);
        tarjetas.add(tarjeta);
        tarjeta = new Credit ("1234", 9, 600, 2000, -3000);
        tarjetas.add(tarjeta);

        
        
        
        
        CompteEstalvis compteEstalvis = new CompteEstalvis("0001-0001-0001", "CompteEstalvis1", 0, 0, 1000, tarjetas);
        productesBancaris.add(compteEstalvis);
        Deposit deposit = new Deposit("0001-0001-0002", "Deposit1", 100, 2.5, 10);
        productesBancaris.add(deposit);
        Hipoteca hipoteca = new Hipoteca("0001-0001-0003", "Hipoteca1", 100, 5, 1, 10);
        productesBancaris.add(hipoteca);        
        
        Persona persona = new Persona("Joana Moragues", 27, productesBancaris );
        
        System.out.println(persona.toString() + "\n Total Remuneració: " + persona.calculaRemuneracioTotal());
    }
    
}
