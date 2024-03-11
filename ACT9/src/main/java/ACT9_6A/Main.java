/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT9_6A;

/**
 *
 * @author Tomas
 */
public class Main {

    public static void main(String[] args) {
        
        Telefon telefon = new Telefon("Iphone10", 800, 80, 7, 6);
        Portatil portatil = new Portatil("Dell", 2300, 27, 24, 16);
        Televisor televisor = new Televisor("LQ", 4500, 49, 36, 49);
        
        Persona persona = new Persona("Francisco", "Franco", telefon, portatil, televisor);
        
        System.out.println(persona.toString());
    }
    
}
