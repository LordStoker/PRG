/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT6_3;

/**
 *
 * @author tomas
 */
public class Elevator {
    public boolean doorOpen = false; //porta oberta o tancada
    public int currentFloor = 1; // pis actual, per defecte 1
    public static int TOP_FLOOR = 5; //planta màxima
    public static int BOTTOM_FLOOR = 1; //planta mínima
    
    public void openDoor(){
        doorOpen = true;
    }
    
    public void closeDoor(){
        doorOpen = false;
    }
    
    public void goUp(){
        
        if(currentFloor < TOP_FLOOR){
            if(doorOpen == false){
                currentFloor++;
            }
            else{
                System.out.println("Por favor, cierre la puerta.");
            }
        }
        else{
                System.out.println("No puedes subir más, ya te encuentras en la planta superior");
        }
    }
    
    public void goDown(){
        
        if(currentFloor > BOTTOM_FLOOR){
            if(doorOpen == false){
                currentFloor--;
            }
            else{
                System.out.println("Por favor, cierre la puerta.");
            }
        }
        else{
                System.out.println("No puedes bajar más, ya te encuentras en la planta inferior");
        }        
    }
}
