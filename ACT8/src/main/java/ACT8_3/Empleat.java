/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT8_3;

/**
 *
 * @author Tomas
 */
public abstract class Empleat {
    
    protected String nom;
    protected String llinatge1;
    protected double souBase;
    
    public Empleat(String nom, String llinatge1, double souBase){
        this.nom = nom;
        this.llinatge1 =llinatge1;
        this.souBase = souBase;
    }
    
    protected abstract double calcularSalari();
    
    @Override
    public String toString(){
        return "Empleat: " + nom + " "+  llinatge1 + " amb sou: " + souBase;
    }
    
    @Override
    public boolean equals (Object o){
        Empleat e = (Empleat) o;
        return e.nom.equalsIgnoreCase(this.nom) &&
                e.llinatge1.equalsIgnoreCase(this.llinatge1) &&
                e.souBase == this.souBase;
    }
    
}
