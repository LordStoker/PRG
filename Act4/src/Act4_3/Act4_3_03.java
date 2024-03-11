/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Act4_3;

import Act4_1.UtilitatsArrays;

/**
 *
 * @author Tomas
 */
public class Act4_3_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String titol = "Menú";
        String[] opcions = {"ajustes", "salir", "inicio"};
        String pregunta = "¿Qué opción quieres?:";
        
        int opcion = UtilitatsConsola.gestionarMenu(titol, opcions, pregunta);
        
        
        
        // TODO code application logic here
    }    
}
