package Volumen1;

public class exercici10 {
    public static void main (String [] args){
        int a = 10;
        int b = 13;
        int c = 12;
        if((a > b) && (a > c)){
            System.out.println("El número mayor es a " + a);
            if (b > c){
                System.out.println("El número menor es c " + c);
            }
            else{
                System.out.println("El número menor es b " + b);
            }  
        }
        else if(b > c){
            System.out.println("El número mayor de los tres es b " + b);
            if (a > c){
                System.out.println("El número menor es c " + c);
            }
            else{
                System.out.println("El número menor es a " + a);
            }  
        }
        else{
            System.out.println("El número mayor de los tres es c " + c);
            if (a > b){
                System.out.println("El número menor de los tres es b " + b);
            }
            else{
                System.out.println("El número menor de los tres es a " + a);
            }
        }
    }
}
