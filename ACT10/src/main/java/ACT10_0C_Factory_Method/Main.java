/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT10_0C_Factory_Method;

/**
 *
 * @author Tomas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FiguraGeometrica cercle = new CercleFactory().CreateFiguraGeometrica(5.0);
        FiguraGeometrica rectangle = new RectangleFactory().CreateFiguraGeometrica(5.0, 2.0);
        
        System.out.println(rectangle.calculaArea());
        System.out.println(cercle.calculaArea());
    }
    
}
