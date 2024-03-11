/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_0J;

/**
 *
 * @author Tomas
 */
abstract public class ClasseAbstracta {
    
    int a1;
    
    public ClasseAbstracta(int a1){
        this.a1 = a1;
    }
    
    //Método abstracto para implementar en subclasse
    public abstract void metodeAbstracte();
    
    //Método concreto en la clase abstracta
    public void metodeConcret(){
        System.out.println("Métode concret en Classe Abstracta");
    }
}
