/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_0I;

/**
 *
 * @author Tomas
 */
public class Manager extends Employee {
    
    public String deptName;
    
    public Manager(String name, String deptName){
        super(name);
        this.deptName = deptName;
    }
    
    public String getDeptName(){
        return this.deptName;
    }
    
    public String getDetails(){
        return super.getName() + " " + this.deptName;
    }
    
}
