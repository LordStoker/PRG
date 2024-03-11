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
public class Biblioteca {
    private ArrayList<Llibre> llibres;

    public Biblioteca(ArrayList<Llibre> llibres) {
        this.llibres = llibres;
    }
    public Biblioteca(){
        
    }
    
    public void afegeixLlibre(Llibre llibre){
        llibres.add(llibre);
    }
    
    public Llibre cercaLlibre(String titol){
        for(Llibre l : llibres){
            if(l.getTitol().equals(titol)){
                return l;
            }
        }
        return null;
    }
    
    @Override
    public String toString(){
        String text = "";
        for(Llibre l : llibres){
            text += "Autor: " + l.getAutor() + ", Titol: " + l.getTitol() + ", Preu: " + l.getPreu() + ", Any Publicació: " + l.getAnyPublicacio() 
                    + "\n" + "---------------------------------------------";
        }
        return text;
    }
    
}
