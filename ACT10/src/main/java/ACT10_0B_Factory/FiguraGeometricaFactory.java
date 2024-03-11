/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT10_0B_Factory;

/**
 *
 * @author Tomas
 */
public class FiguraGeometricaFactory {
    
    public FiguraGeometrica CreateFiguraGeometrica(String tipus, double ... param){ //double ... permite la definición de parámetros de longitud variable
        if(tipus.equalsIgnoreCase("Cercle")){
            return new Cercle(param[0]);
        }
        else if (tipus.equalsIgnoreCase("Rectangle")){
            return new Rectangle(param[0], param[1]);
        }
        else{
            return null;
        }
    }
    
}
