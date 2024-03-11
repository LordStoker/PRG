/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT8_0B;

/**
 *
 * @author Tomas
 */
public class Mamifer extends Animal {
    protected String tipusMamifer;
    
    public Mamifer (String tipusAnimal, String tipusMamifer){
        super(tipusAnimal);
        this.tipusMamifer = tipusMamifer;
    }
    
    public void alimenta(){
        System.out.println("Un mamífer amamanta les cries");
    }
    
}
