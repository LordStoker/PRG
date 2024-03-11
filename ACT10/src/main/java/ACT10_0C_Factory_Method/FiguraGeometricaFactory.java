/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT10_0C_Factory_Method;

/**
 *
 * @author Tomas
 */
public abstract class FiguraGeometricaFactory {
    //FiguraGeometricaFactory pasa a ser una clase abstracta
    //CercleFactory, RectangleFactoriy se extienden de FiguraGeometricaFactory
    public abstract FiguraGeometrica CreateFiguraGeometrica(double ... param);
}
