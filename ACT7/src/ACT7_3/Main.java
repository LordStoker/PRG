/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT7_3;

/**
 *
 * @author tomas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     Elevator privElevator = new Elevator();  
     try{ 
     privElevator.openDoor();
     privElevator.closeDoor();
     privElevator.goDown();
     privElevator.goUp();
     privElevator.goUp();
     privElevator.openDoor();
     privElevator.closeDoor();
     privElevator.goDown();
     privElevator.openDoor();
     privElevator.goDown();
     privElevator.closeDoor();
     privElevator.goDown();
     privElevator.goDown();
     }
     catch(Exception e){
         System.out.println(e.getMessage());
     }

    }
    
}
