/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT6_1B;

import ACT6_1A.*;

/**
 *
 * @author Tomas
 */
public class Modul {
    
    public String idModul;
    public String nom;
    public int horesSetmanals;
    
    public String verCiclo(){
        String datos;
        
        datos = "IdModul: " + idModul + ", nom: " + nom  + ", hores setmanals: " + horesSetmanals;
        
        return datos;
        
    }
    
}
