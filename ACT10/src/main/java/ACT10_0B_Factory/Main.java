/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT10_0B_Factory;

/**
 *
 * @author Tomas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Se crea el objeto figuraGeometrica para tener aceso al método CreateFiguraGeometrica a paritr de la clase que lo contiene
        FiguraGeometricaFactory figuraGeometrica = new FiguraGeometricaFactory();
        
        FiguraGeometrica cercle = figuraGeometrica.CreateFiguraGeometrica("Cercle", 5.0);
        FiguraGeometrica rectangle = figuraGeometrica.CreateFiguraGeometrica("Rectangle", 5.0, 2.0);
        
        System.out.println(cercle.calculaArea());
        System.out.println(rectangle.calculaArea());
    }
    
}
