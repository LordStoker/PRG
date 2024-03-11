/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_3A;

/**
 *
 * @author tomas
 */
public abstract class PublicacioBase implements Publicacio {
    protected String titol;
    protected int anyPublicacio;
    
    public PublicacioBase (String titol, int anyPublicacio){
        this.titol = titol;
        this.anyPublicacio = anyPublicacio;
    }
    
    @Override
    public String toString(){
        return "Titol: " + this.titol + ", any publicació: " + this.anyPublicacio;
    }
    
}
