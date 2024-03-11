/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT10_0C_Factory_Method;

/**
 *
 * @author Tomas
 */
public class RectangleFactory extends FiguraGeometricaFactory {
    
    @Override
    public FiguraGeometrica CreateFiguraGeometrica(double ... param){
        return new Rectangle(param[0], param[1]);
    }
    
}
