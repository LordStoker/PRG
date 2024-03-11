package Volumen1;
import java.util.Scanner;

public class exercici2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número");
        float num1 = 0;
        float num = scanner.nextInt();
        num1 = (num * 1000)/3600;
        System.out.println(num + "km/h son " + num1 + "m/s" );
        scanner.close();
    }
}
