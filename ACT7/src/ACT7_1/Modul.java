/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT7_1;

/**
 *
 * @author Tomas
 */
public class Modul {
    private int idModul;
    private String nom;
    private int horesSetmanals;
    private static int comptadorModuls = 1;
    
    private Modul(){
        
    }
//Método constructor
    public Modul(String nom, int horesSetmanals) {
        this.idModul = getComptadorModuls();
        this.nom = nom;
        this.horesSetmanals = horesSetmanals;
    }
    
    //Método para motrar info del módulo.
    public String mostrarModul(){
        String info;
        
        info = "ID Modul: " + idModul + " Nom: " + nom + " hores setmanals: " + horesSetmanals;
        
        return info;
        
    }
    
//Setters y getters
    public int getIdModul() {
        return idModul;
    }

    public void setIdModul(int idModul) {
        this.idModul = idModul;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHoresSetmanals() {
        return horesSetmanals;
    }

    public void setHoresSetmanals(int horesSetmanals) {
        this.horesSetmanals = horesSetmanals;
    }

    public static int getComptadorModuls() {
        return comptadorModuls++;
    }

    public static void setComptadorModuls(int comptadorModuls) {
        Modul.comptadorModuls = comptadorModuls;
    }
    
    
    
}
