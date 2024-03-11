/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_7A;

import java.util.ArrayList;

/**
 *
 * @author Tomas
 */
public class Client {
    private String nom;
    private String cognom;
    private ArrayList<Llibre> llibresPrestats;

    public Client(String nom, String cognom, ArrayList<Llibre> llibresPrestats) {
        this.nom = nom;
        this.cognom = cognom;
        this.llibresPrestats = llibresPrestats;
    }
    public Client(String nom, String cognom) {
        this.nom = nom;
        this.cognom = cognom;

    }
    
    public void prestaLlibre(Llibre llibre){
        llibresPrestats.add(llibre);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public ArrayList<Llibre> getLlibresPrestats() {
        return llibresPrestats;
    }

    public void setLlibresPrestats(ArrayList<Llibre> llibresPrestats) {
        this.llibresPrestats = llibresPrestats;
    }
    
    
}
