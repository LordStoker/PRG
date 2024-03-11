/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT9_4B;

import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ConcessionariAuto concessionariA = new ConcessionariAuto();
        ConcessionariMoto concessionariM = new ConcessionariMoto();
        
        crearAutos(concessionariA);
        crearMotos(concessionariM);
        
        System.out.println(concessionariA.toString());
        System.out.println(concessionariM.toString());
        System.out.println("Ingressos del Concesionari de Autos: " + concessionariA.calculaIngressos());
        System.out.println("Ingressos del Concesionari de Motos: " + concessionariM.calculaIngressos());

    }
          
    private static void crearAutos(ConcessionariAuto concessionariAuto){
    
        concessionariAuto.setVehicle(new Camio("Fiat", "Fiat2", 30_000, 15_000));
        concessionariAuto.setVehicle(new Automobil("Honda", "Honda", 30_000, 5, 2000));        
        concessionariAuto.setVehicle(new Automobil("Toyota", "Auros", 30_000, 5, 30));
    }
    
    private static void crearMotos(ConcessionariMoto concessionariMoto){
        concessionariMoto.setMotocicleta(new Motocicleta("Kawasaki", "H2R", 30_000, 1000, "supersport"));
        concessionariMoto.setMotocicleta(new Motocicleta("Yamaha", "Yamahamodel", 30_000, 1000, "supersport"));
        concessionariMoto.setMotocicleta(new Motocicleta("Kawasaki", "H2R", 30_000, 1000, "supersport"));
        
        
    }
    
}
