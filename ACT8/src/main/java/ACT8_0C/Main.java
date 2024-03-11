/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT8_0C;

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
        Cotxe cotxe = new Cotxe("Opel", "Corsa");
        Moto moto = new Moto("Yamaha", "SRX");
        
        cotxe.accesoAArrancar(); //Acceso a método privado desde un método public
        cotxe.condueix();
        cotxe.frena();
        
        System.out.println();
        
        moto.acelera();
        moto.accesoAArrancar(); //Acceso a método privado desde un método public
        moto.frena();
    }
    
}
