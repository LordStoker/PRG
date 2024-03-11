/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ACT9_0K;

/**
 *
 * @author Tomas
 */
public interface Interficie {
    int a1 = 0;
    
    public void metodeAbstracte();
    
    default void metodePerDefecte(){
        System.out.println("Métode per defecte en la interfície");
    }
    
}
