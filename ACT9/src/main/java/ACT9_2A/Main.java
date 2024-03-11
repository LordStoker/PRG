/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT9_2A;

import ACT9_1.*;
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
        
        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Telefon> telefonos = new ArrayList<>();
        
        carregaPersonas(personas);
        
        carregaTelefonos(telefonos, personas);
        
        encenDispositius(telefonos);
        
        validaDispositius(telefonos, personas);
        
        apagaDispositius(telefonos);
    }
    

        
        private static void validaDispositius(ArrayList<Telefon> telefonos, ArrayList<Persona> personas){
            for(Persona p : personas){
                for(Telefon t : telefonos){
                    System.out.println("\t" + p.getNom() + " " + t.validaPatrons(p) + " ");
                }
                System.out.println("\n");
            }
        }
        
        public static void carregaPersonas(ArrayList<Persona> personas){
            
            Persona persona1 = new Persona("Pedro", "1234", null, null, "00001");
            Persona persona2 = new Persona("Jorge", "12345", "08631", null, null);
            Persona persona3 = new Persona("Armaldo", null, null, "tactil", "narizudo");

            personas.add(persona1);
            personas.add(persona2);
            personas.add(persona3);            
        }
        
        public static void carregaTelefonos(ArrayList<Telefon> telefonos, ArrayList<Persona> personas){
            Telefon android1 = new Android("Samsung", personas.get(0),  "1234", null, null);
            Telefon iphone1 = new Iphone8("Apple", personas.get(1), null, "08769");
            Telefon iphone2 = new Iphone10("Apple", personas.get(2),"12345", null, "ojitos");

            telefonos.add(android1);
            telefonos.add(iphone1);
            telefonos.add(iphone2);
            
        }
        
        public static void encenDispositius(ArrayList<Telefon> telefonos){
            for(Telefon t : telefonos){
                t.on();
            }
        }
        public static void apagaDispositius(ArrayList<Telefon> telefonos){
            for(Telefon t : telefonos){
                t.off();
            }
        }
    }

    
    

