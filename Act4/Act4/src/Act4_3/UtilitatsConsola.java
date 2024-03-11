/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Act4_3;

import java.util.Scanner;


/**
 *
 * @author Tomas
 */
public class UtilitatsConsola {
    /**
     * Llegeix un sencer del scanner.
     *
     * @param prompt El missatge que mostra al'usuari indicant quina dada ha
     *               d'escriure.
     * @return El sencer escrit per l'usuari
     */
    public static int llegirSencer(String prompt) {
        Scanner scanner = new Scanner(System.in);
        int sencer = 0;
        
        System.out.print(prompt);
        sencer = scanner.nextInt();
		//scanner.close();
        return sencer;
    }

    /**
     * Llegeix una cadena del scanner.
     *
     * @param prompt El missatge que mostra al'usuari indicant quina dada ha
     *               d'escriure.
     * @return La cadena escrita per l'usuari
     */
    public static String llegirCadena(String prompt) {
        Scanner scanner = new Scanner(System.in);
        String cadena;


        System.out.print(prompt);
        cadena = scanner.nextLine();
		//scanner.close();
        return cadena;
    }

    /**
     * Llegeix un real del scanner. 
     *
     * @param prompt El missatge que mostra al'usuari indicant quina dada ha
     *               d'escriure.
     * @return El real escrit per l'usuari
     */
    public static double llegirDouble(String prompt) {
        Scanner scanner = new Scanner(System.in);
        double real = 0;

        System.out.print(prompt);
        real = scanner.nextDouble();
		//scanner.close();
        return real;
    }   
    
       /**
     * Mostra el menu per pantalla i demana a l'usuari l'opció a executar fins
     * que l'usuari en pitja una de correcta.
     *
     * @param titol    El titol del menu
     * @param opcions  La llista d'opcions, sense numero
     * @param pregunta La pregunta que es fa a l'usuari
     * @return L'opció vàlida elegida per l'usuari.
     */
    public static int gestionarMenu(String titol, String[] opcions, String pregunta) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        int i = 0;
        System.out.println(titol);
        do{
            System.out.println(pregunta);
            opcion = scanner.nextInt();
            if (opcion < 0 || opcion > opcions.length -1){
                System.out.println("La opción escogida no es válida");
            }
            else{
                System.out.println(opcions[opcion]);                
                i++;
            }            
        }
        while(i <= opcions.length -1);
        return opcion;   
    }
    

    
}
