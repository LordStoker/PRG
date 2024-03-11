/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT6_2A;

/**
 *
 * @author Tomas
 */
public class Client {
    
    public String llinatge1;
    public String llinatge2;
    public String nom;
    public Compte compte;
    
    
    public void realizaTransaccio (double quantitat){
        if(quantitat > 0){
            compte.ingresa(quantitat);
        }
        else if (quantitat < 0){
            compte.reintegra(quantitat);
        }
        
    }
    
}
