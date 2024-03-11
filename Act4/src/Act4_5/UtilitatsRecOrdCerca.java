/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Act4_5;

import Act4_3.UtilitatsConsola;

/**
 *
 * @author Tomas
 */
public class UtilitatsRecOrdCerca {
    
    
       public static double calcularPotencia(int base, double exponent) {
            if (exponent == 1) {
                return base;
            } else {
                return (base * calcularPotencia(base, exponent -1));
            }
       }
       
       public static double calculaFactorial(int num){
           if(num==1){
               return num;
           }
           else
               System.out.println(num + " X " + (num-1));
               return num * calculaFactorial(num-1);               
       }
       
       public static int calculaSuma(int num){
           if(num == 0){
               return num;
           }
           else{
               System.out.println(num + " + " + (num-1));
               return num + calculaSuma(num-1);
           }
       }
       
       public static double calculaMCD(int num1, int num2){
           if (num2 == 0){
               return num1;
           }
           else{
               return calculaMCD(num2, num1%num2);
           }
           
                          
}
       
       public static int calculaFibonacci(int fibo){ //5-> 4+3.... 
           
           if(fibo <=1){
               return fibo;
           }
           else             
               return calculaFibonacci(fibo -1) + calculaFibonacci(fibo-2);
       }
       
       
       public static boolean ordenaArray3(int[] array){
           boolean posible = true;
           int swap;
           if(array.length ==3){
               if(array[0]>array[1]){
                   swap = array[1];
                   array[1] = array[0];
                   array[0] = swap;
               }
               if(array[0] > array[2]){
                   swap = array[2];
                   array[2] = array[0];
                   array[0] = swap;
               }
               if(array[1] > array[2]){
                   swap = array[2];
                   array[2] = array[1];
                   array[1] = swap;
                }
           }
           else{
               posible = false;               
           }
           return posible;           
       }
       
       public static int[] ordenaArrayBimbolla(int[] array){
         
           int swap;
           
           for(int i = 1; i < array.length-1; i++){
               for(int j = 0; j < array.length-1; j++){
                   if(array[j] > array[j+1]){
                       swap = array[j+1];
                       array[j+1] = array[j];
                       array[j] = swap;
                   }
               }
           }
           
           return array;           
       }
       
       
       public static int[] ordenaArrayBimbollaInvertido(int[] array){
           
           int swap;
           
           for(int i = array.length-2; i > 0; i--){
               for (int j = array.length-1; j > 0; j--){
                   if (array[j] < array[j-1]){
                       swap = array[j];
                       array[j] = array[j-1];
                       array[j-1] = swap;
                   }
                   
               }
           }
           return array;           
       }
       
       public static int CercaArray (int[] array, int num){
           int min = 0;
           int max = array.length-1;           
           int guess;
           do{
                guess = (min+max)/2;
                if(array[guess] == num){
                    //System.out.println("El número " + num + " se encuentra en la posición " + guess);
                    return guess;
                }
                else if(array[guess] > num){
                    max = guess-1;
                }
                else{
                    min = guess+1;
                }       
           } while(min <= max);
           return -1;
       }
       
       public static int CercaArrayRecursiu (int[] array, int num, int min, int max){
           //Primer caso base: El num no está en el array
           if(min > max){
               return -1;
           }
           int guess = (min+max)/2;
           //Segundo caso base, se encuentra el num en la posición checkeada
           if(array[guess] == num){
               return guess;
           }
           //Sigue buscando dependiendo de si con el que se compara es menor o mayor
           else if(array[guess] > num){
               return CercaArrayRecursiu(array, num, min, guess-1);
           }
           else{
               return CercaArrayRecursiu(array, num, guess+1, max);
           }
       }
}      

