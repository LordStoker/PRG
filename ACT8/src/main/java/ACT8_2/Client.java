/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT8_2;


import java.util.ArrayList;

/**
 *
 * @author Tomas
 */
public class Client {
    
    private String llinatge1;
    private String llinatge2;
    private String nom;
    private ArrayList <Compte> comptes;
    
    
    Client(String llinatge1, String llinatge2, String nom){
        this.llinatge1 = llinatge1;
        this.llinatge2 = llinatge2;
        this.nom = nom;
        this.comptes = new ArrayList<>();
    }
    
    
    public void realizaTransaccio (Compte compte, double quantitat){
        if(quantitat > 0){
            compte.ingresa(quantitat);
        }
    
        else if (quantitat < 0){
            compte.reintegra(Math.abs(quantitat));
        }
    }
    public String toString(){
        String text;
        text = "Client " + nom + " " + llinatge1 + " " + llinatge2;
        text += "\namb SALDO:\n";
        for(Compte cCuenta : comptes){
            text = text + " El saldo de la cuenta " +  cCuenta.getNumeroCompte() + "es de " + cCuenta.getSaldo() + "€.";
        }
        return text;        
    }

    public String getLlinatge(){
        return llinatge1;
    }
    public void setLlinatge(String llinatge1){
        this.llinatge1 = llinatge1;
    }
    public String getllinatge2(){
        return llinatge2;
    }
    
    public void setLlinatge2(String llinatge2){
        this.llinatge2 = llinatge2;
    }
    
    public String getNom(){
        return nom;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }

    public ArrayList<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(ArrayList<Compte> comptes) {
        this.comptes = comptes;
    }
    
    

    
    
    
    
    
}
    

    

