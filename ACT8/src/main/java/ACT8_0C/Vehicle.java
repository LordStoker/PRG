/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT8_0C;

/**
 *
 * @author Tomas
 */
public class Vehicle {
    private String marca;
    private String model;
    
    public Vehicle(String marca, String model){
        this.marca = marca;
        this.model = model;
    }
    
    
    public void accesoAArrancar(){ //Método para poder accede al método arranca en private.
        arranca();
    }
    
    private void arranca(){
        System.out.println("El vehicle " + marca + " arranca.");
    }
    
    public void frena(){
        System.out.println("El vehicle " + marca + " frena.");
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModel(){
        return model;
    }
    
    public void setModel(String model){
        this.model = model;
    }
}
