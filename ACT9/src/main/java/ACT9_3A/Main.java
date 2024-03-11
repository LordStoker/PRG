/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT9_3A;

/**
 *
 * @author tomas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
            PublicacioBase[] publicacions = {new Llibre("Lo que el viento se llevó", 1768, "Jose Antonio", 30),
            new Llibre("Lo que el viento se llevó", 1768, "Jose Antonio", 31),
            new Llibre("Lo que el viento se llevó", 1768, "Jose Antonio", 32),
            new Llibre("Lo que el viento se llevó", 1768, "Jose Antonio", 33),
            new Revista("Lo que el viento no se llevó", 2020, 39, 10.99),
            new Revista("Lo que el viento no se llevó", 2020, 39, 11.99),
            new Revista("Lo que el viento no se llevó", 2020, 39, 12.99)};
            
            for(PublicacioBase pB : publicacions){
                System.out.println(pB.toString() + pB.calculaPreu());
            }

    }
    
}
