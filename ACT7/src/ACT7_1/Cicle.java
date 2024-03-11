/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT7_1;

import java.util.ArrayList;

/**
 *
 * @author Tomas
 * Clase que almacena Ciclos
 */
public class Cicle {
    
    private int idCicle;
    private String nom;
    private int numAlumnes;
    private ArrayList<Modul> moduls;
    private static int comptadorCicles = 1;
    
    private Cicle(){
        
    }
    //Método constructor
    public Cicle(String nom, int numAlumnes) {
        this.idCicle = getComptadorCicles();
        this.nom = nom;
        this.numAlumnes = numAlumnes;
        this.moduls = new ArrayList<>();
    }
    
    //Método para mostrar cicle.
    public String mostrarCicle(){
        String info = "{";
        
        info = info + "Id Cicle: " + idCicle + " Nom: " + nom + " número alumenes: " + numAlumnes  + "\n";
      
        for(Modul moduls : moduls){
            info = info + "[" + " idModul " + moduls.getIdModul() + " Nom: " + moduls.getNom() + " hores setmanals: " + moduls.getHoresSetmanals() + "\n";
        }
        info = info + "]" + "}";
        return info;
        
    }
    
    //Método para añdir módulos al ciclo.
    public void afegeixModul(Modul modul){
        this.moduls.add(modul);
    }
    //Setters and Getters
    public int getComptadorCicles() {
        return comptadorCicles++;
    }

    public void setComptadorCicles(int comptadorCicles) {
        this.comptadorCicles = comptadorCicles;
    }

    public int getIdCicle() {
        return idCicle;
    }

    public void setIdCicle(int idCicle) {
        this.idCicle = idCicle;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumAlumnes() {
        return numAlumnes;
    }

    public void setNumAlumnes(int numAlumnes) {
        this.numAlumnes = numAlumnes;
    }

    public ArrayList<Modul> getModuls() {
        return moduls;
    }

    public void setModuls(ArrayList<Modul> moduls) {
        this.moduls = moduls;
    }
    
    
    
    
    
}
