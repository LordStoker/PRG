package Volumen1;

public class exercici5 {
    public static void main (String [] args){
        int horasTrabajo = 140;
        int precio = 8;
        int contador = 0;
        int salario = 0;

        while(contador <=140){
            if (contador > 50){
                salario = salario + precio * 2;
                contador++;
            }
            else{
                salario = salario + precio;
                contador++;
            }
            
        }
        
        System.out.println("Como el trabajador esta semana ha hecho 140 horas y a partir de las 50 ha hecho 90 horas extra, su salario total es de " + salario + " euros");

    }
    
}
