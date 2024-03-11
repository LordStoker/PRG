/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT8_0F;

/**
 *
 * @author Tomas
 */
public abstract class ElectronicDevice {
    
    protected String a;
    
    public abstract void turnOn();
    
    public abstract void turnOff();
    
    @Override
    
    public String toString(){
        return a;
    }
    
}
