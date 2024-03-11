/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT9_0I;

/**
 *
 * @author Tomas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee e1 = new Employee("Pérez");
        Manager m1 = new Manager("Sanchez", "Sistemes");
        Employee e2 = new Manager("Vives", "Informatica");
        Employee e3 = (Employee)e2;
        //Employee e4 = (Manager) e1;
        
        System.out.println(e1.getDetails());
        System.out.println(m1.getDetails());
        System.out.println(e2.getDetails());
        System.out.println(e3.getDetails());
        //System.out.println(e4.getDetails());
    }
    
}
