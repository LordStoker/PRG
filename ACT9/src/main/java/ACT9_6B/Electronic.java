/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_6B;

/**
 *
 * @author tomas
 */
public abstract class Electronic extends Producte {
    protected int midaPantalla;
    protected String procesador;
    protected int ram;
    protected int hdd;

    public Electronic(String nom, double preu, double consumEnergetic, int garantiaMesos, int midaPantalla, String processador, int ram, int hdd) {
        super(nom, preu, consumEnergetic, garantiaMesos);
        this.midaPantalla = midaPantalla;
        this.procesador = procesador;
        this.ram = ram;
        this.hdd = hdd;
    }
    
    public double calculaDescompte(){
        return 0;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", mida pantalla: " + this.midaPantalla + 
                ", procesador: " + this.procesador + ", ram: " + this.ram +
                ", hdd: " + this.hdd;
    }
    
    
    
}
