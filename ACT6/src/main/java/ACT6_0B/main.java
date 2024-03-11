/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT6_0B;

import ACT6_0.*;

/**
 *
 * @author Tomas
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here      
        try{
        Cercle c = new Cercle();
        c.radi = 32;
        double areac;
        double perimetroc;
        
        
        areac = c.calcularArea();
        perimetroc = c.calcularPerimetro();
        
        System.out.println("El área del círculo es " + areac + " y el perimetro es " + perimetroc);
        
        
        
        Quadrat cuadrado = new Quadrat();        
        cuadrado.lado = 7;
        double areaq;
        double perimetroq;
        
        areaq = cuadrado.calcularArea();
        perimetroq = cuadrado.calcularPerimetro();
        
        System.out.println("El área del cuadrado es " + areaq + " y el perimetro es " + perimetroq);        
    
        
        TriangleEquilater tE = new TriangleEquilater();
        tE.base = 8;
        tE.altura = 3;
        double areatE;
        double perimetrotE;
        
        areatE = tE.calcularArea();
        perimetrotE = tE.calcularPerimetro();
        System.out.println("El área del triángulo equilátero es " + areatE + " y el perimetro es " + perimetrotE);        

        
        
        Rectangle r = new Rectangle();
        r.base = 4;
        r.lado = 9;
        double areaR;
        double perimetroR;
        
        areaR = r.calcularArea();
        perimetroR = r.calcularPerimetro();
        System.out.println("El área del rectángulo es " + areaR + " y el perimetro es " + perimetroR);        

        

        
        
        
        Rombe rombo = new Rombe();
        rombo.base = 7;
        rombo.diagonal1 = 5;
        rombo.diagonal2 = 7;
        double areaRombe;
        double perimetroRombe;
        
        areaRombe = rombo.calcularArea();
        perimetroRombe = rombo.calcularPerimetro();
        
        System.out.println("El área del rombo es " + areaRombe + " y el perimetro es " + perimetroRombe);        
        
        Pentagon p = new Pentagon();
        
        p.base = 9;
        p.apotema = 4;
        double areaP;
        double perimetroP;
        
        areaP = p.calcularArea();
        perimetroP = p.calcularPerimetro();
        System.out.println("El área del pentágono es " + areaP + " y el perimetro es " + perimetroP);        
        
        
        
        
        
        }
        
        catch(Exception e){
        e.getMessage();
        }
        
    }
}
