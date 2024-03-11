/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT8_3;

/**
 *
 * @author Tomas
 */
public class EmpleatPerComptePropia extends Empleat {
    protected int horesTreballades;
    
    public EmpleatPerComptePropia(String nom, String llinatge1, double souBase, int horesTreballades){
        super(nom, llinatge1, souBase);
        this.horesTreballades = horesTreballades;
    }
    
    @Override    
    public String toString(){
        return super.toString() + " hores treballades: " + horesTreballades; 
    }

    
    public double calcularSalari(){
        return super.souBase * horesTreballades;
    }
    
}
