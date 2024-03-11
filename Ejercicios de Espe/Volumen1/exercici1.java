package Volumen1;

import java.util.Scanner;

public class exercici1 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el radio de la circunferencia: ");
        double radio = scanner.nextFloat();
        double longitud = 0;

        longitud = 2 * Math.PI * radio;
        System.out.println("La longitud de la circunferencia es " + longitud);

    }
    
}
