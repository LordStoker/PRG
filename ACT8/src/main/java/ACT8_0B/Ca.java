/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT8_0B;

/**
 *
 * @author Tomas
 */
public class Ca extends Mamifer {
    private String tipusCa;
    
    public Ca(String tipusAnimal, String tipusMamifer, String tipusCa){
        super(tipusAnimal, tipusMamifer);
        this.tipusCa = tipusCa;
    }
    
    public void lladra(){
        System.out.println("El ca lladra...");
    }
    
}
