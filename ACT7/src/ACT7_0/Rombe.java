/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT7_0;

/**
 *
 * @author Tomas
 */
public class Rombe {
    
    private double base;
    private double diagonal1;
    private double diagonal2;
    
    
    public double calcularPerimetro(){
        return 4 * base;
    }
    
    private Rombe(){}
    
    public double calcularArea(){
        return (diagonal1 * diagonal2) /2;
    }

    public Rombe(double base, double diagonal1, double diagonal2) {
        this.base = base;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }
    
}
