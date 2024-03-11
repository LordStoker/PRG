/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT9_1;

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
        
        Persona persona1 = new Persona("Pedro", "1234", null, null, "00001");
        Persona persona2 = new Persona("Jorge", "12345", "08631", null, null);
        Persona persona3 = new Persona("Armaldo", null, null, "tactil", "narizudo");
        
        Android android1 = new Android("Samsung", persona2, "1234", null, null);
        Iphone8 iphone1 = new Iphone8("Apple", persona2, null, "08769");
        Iphone10 iphone2 = new Iphone10("Apple", persona3, "12345", null, "ojitos");
        
        
        
        System.out.println(android1.validaPatrons(persona1));
        System.out.println(android1.validaPatrons(persona2));
        System.out.println(iphone2.validaPatrons(persona1));
        System.out.println(android1.validaPatrons(persona3));
        System.out.println(iphone2.validaPatrons(persona2));
        System.out.println(android1.validaPatrons(persona1));
        
        
        
    }
    
}
