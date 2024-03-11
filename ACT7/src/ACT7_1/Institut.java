/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT7_1;

import java.util.ArrayList;

/**
 *
 * @author Tomas
 */
public class Institut {
    private String idInstitut;
    private String nom;
    private ArrayList<Cicle> cicles;
    
    private Institut(){
        
    }
    //Constructor
    public Institut(String idInstitut, String nom) {
        this.idInstitut = idInstitut;
        this.nom = nom;
        this.cicles = new ArrayList<>();
    }
    
    //Método para agregar ciclos al instituto
    public void afegeixCicle(Cicle cicle){
        
        this.cicles.add(cicle);
    }
    //Método para sacar el instituto, sus ciclos y el módulo de cada ciclo.
    public String mostraInstitut(){
        String info = "{";
        
        info = info + "Id Institut: " + idInstitut + " nom: " + nom + "\n";
        for (Cicle c : cicles){
            info = info + " idCicle: " + c.getIdCicle() + " nom: " + c.getNom() + " num alumnes: " + c.getNumAlumnes() + " Moduls: " + "\n" + "[";
            for(Modul m : c.getModuls()){
                info = info + "Id Cicle: " + m.getIdModul() + " Nom: " + m.getNom() + " hores setmanals: " + m.getHoresSetmanals() + "]" + "\n";
            }
        }
        info = info + "}";
        return info;
    }
    
    //Setters y Getters
    public String getIdInstitut() {
        return idInstitut;
    }

    public void setIdInstitut(String idInstitut) {
        this.idInstitut = idInstitut;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Cicle> getCicles() {
        return cicles;
    }

    public void setCicles(ArrayList<Cicle> cicles) {
        this.cicles = cicles;
    }
    
    
    
}
