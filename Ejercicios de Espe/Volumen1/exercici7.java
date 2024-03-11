package Volumen1;

public class exercici7 {
    public static void main (String [] args){
        int a = 7;
        int b = 9;
        int c = 8;
        if(a > b){
            System.out.println("El núm menor es b " + b);
            if (a > c){
                System.out.println(a + " a es el número mayor");
            }
            else{
                System.out.println(c + " c es el número mayor");
            }
        }
        else if (b > c){
            System.out.println("El número menor es a " + a);
            System.out.println(b + " b es el número mayor");
        }
        else{
            System.out.println(c + " c es el número mayor");
        }
    }
}
