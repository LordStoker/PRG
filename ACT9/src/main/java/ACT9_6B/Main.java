/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT9_6B;

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
        ArrayList<Producte> productes = new ArrayList<>();
        
        productes.add(new Telefon("iPhone", 1200.0, 15.0, 8, 5, "Snapdragon", 16, 128));
        productes.add(new Portatil("Dell XPS", 1500.0, 18.0, 12, 15, "Intel i5",16, 512));
        productes.add(new Televisor("Snapdragon", 800.0, 30.0, 36, 55, "Samsung 4K",16, 256));
        productes.add(new Gelera('A', "Edesa no Frost", 500.0, 150.0, 24));
        productes.add(new Rentavaixelles('B', "Electrolux", 450.0, 200.0, 24));
        productes.add(new Rentadora('C', "AEG", 375.0, 175.0, 24,8));
        Persona client = new Persona("Pere", "Gómez", productes);

        System.out.println(client.toString());        
    }
    
}
