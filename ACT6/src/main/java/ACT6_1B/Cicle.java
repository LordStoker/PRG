/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT6_1B;

import ACT6_1A.*;
import java.util.ArrayList;

/**
 *
 * @author Tomas
 */
public class Cicle {
    public int idCicle;
    public String nom;
    public int numAlumnes;
    public ArrayList<Modul> moduls;    
    
    public String verCiclo(){
        String datos;
        
        datos = "IDCicle: " + idCicle + ", Nom: " + nom + ", nombre d'alumnes: " + numAlumnes + " Módulos:{";
        for(Modul modul : moduls){
            datos = datos + modul.idModul + ", " + modul.nom + ", ";
        }
        datos = datos + "}";
        
        return datos;
        
    }
    
}
