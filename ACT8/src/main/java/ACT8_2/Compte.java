/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT8_2;



/**
 *
 * @author Tomas
 */
public class Compte {
    private String banc;
    private String oficina;
    private String dc; 
    private String numeroCompte;
    private double saldo;

    public Compte(String banc, String oficina, String dc, String numeroCompte, double saldo) {
        this.banc = banc;
        this.oficina = oficina;
        this.dc = dc;
        this.numeroCompte = numeroCompte;
        this.saldo = saldo;
    }
    
    @Override
    public boolean equals (Object o){
        Compte c = (Compte) o;
        return c.banc.equals(this.banc) &&
                c.oficina.equals(this.oficina) &&
                c.dc.equals(this.dc) &&
                c.numeroCompte.equals(this.numeroCompte) &&
                c.saldo == this.saldo;
    }
    public void ingresa (double quantitat){
        saldo = saldo + quantitat;
        System.out.println("Se ha ingresado la cantidad de " + quantitat + "€ a la cuenta " + numeroCompte
                +  " Saldo total de: " + saldo);
    }
    
    public void reintegra(double quantitat){
        if (quantitat > saldo){
            System.err.print("No hay saldo suficiente");
        }
        else{
            saldo = saldo - quantitat;
            System.out.println("Se ha descontado la cantidad de " + quantitat + "€ a la cuenta " + numeroCompte
            +  " Saldo total de: " + saldo);
        }
        
    }

    public String getBanc() {
        return banc;
    }

    public void setBanc(String banc) {
        this.banc = banc;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
