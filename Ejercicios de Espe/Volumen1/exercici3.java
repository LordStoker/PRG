package Volumen1;
import java.util.Scanner;

public class exercici3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los segundos ");
        float segundos = scanner.nextFloat();
        float minutos = 0;
        float horas = 0;


        System.out.print(segundos + "segundos en horas son: ");
        horas = segundos / 3600;
        System.out.println(horas);
        System.out.print(segundos + "segundos en minutos son: ");
        minutos = (segundos % 3600) / 60;
        System.out.println(minutos);
        System.out.print(segundos + "segundos en segundos son: ");
        segundos = segundos % 60;
        System.out.print(segundos);
    }
}
