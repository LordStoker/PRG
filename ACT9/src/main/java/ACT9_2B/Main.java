/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT9_2B;

import ACT9_2A.*;
import ACT9_1.*;
import java.util.ArrayList;

/**
 *
 * @author Tomas
 */

public class Main {


    public static void main(String[] args) {
        
        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Telefon> telefonos = new ArrayList<>();
        
        carregaPersonas(personas);
        
        carregaTelefonos(telefonos, personas);
        
        encenDispositius(telefonos);
        
        validaDispositius(telefonos, personas);
        validaPersonas(telefonos,personas);
        
        apagaDispositius(telefonos);
    }
    

        
        private static void validaDispositius(ArrayList<Telefon> telefonos, ArrayList<Persona> personas){
            for(Persona p : personas){
                for(Telefon t : telefonos){
                    System.out.println("\t" + t.marca + " " + t.validaPatrons(p) + ": " + p.getNom());
                }
                System.out.println("\n");
            }
        }
        
        
        private static void validaPersonas(ArrayList<Telefon> telefonos, ArrayList<Persona> personas){
            for(Persona p : personas){
                for(Telefon t : telefonos){
                    System.out.println("\t" + p.getNom() + ": " + p.validaPatrons(t) + ": " + t.marca);
                }
                System.out.println("\n");
            }
        }        
        public static void carregaPersonas(ArrayList<Persona> personas){
            Persona persona1;
            Persona persona2;
            Persona persona3;
            persona1 = new Persona("Pedro");
            persona1.setPatrons(new String[] {"1234", null, null, null});
            persona2 = new Persona("Jorge");
            persona2.setPatrons(new String[] {null, "Teclat2", null, null});
            persona3 = new Persona("Armaldo");
            persona2.setPatrons(new String[] {null, null, "Emprempta3", null});

            personas.add(persona1);
            personas.add(persona2);
            personas.add(persona3);            
        }
        
        public static void carregaTelefonos(ArrayList<Telefon> telefonos, ArrayList<Persona> personas){
            Telefon android1 = new Android("Samsung", personas.get(0));
            android1.setPatrons(new String[] {"1234", null, null, null});
            Telefon iphone1 = new Iphone8("Apple", personas.get(1));
            iphone1.setPatrons(new String[] {null, "Teclat2", null, null});
            Telefon iphone2 = new Iphone10("Apple", personas.get(0));
            iphone2.setPatrons(new String[] {null, null, "Emprempta3", null});

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

    
    

