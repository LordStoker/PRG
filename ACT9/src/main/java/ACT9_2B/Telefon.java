/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT9_2B;




/**
 *
 * @author Tomas
 */
public abstract class Telefon extends ValidadorDispositius implements DispositiuElectronic  {
    
    protected String marca;
    protected Persona persona;
    protected boolean onOff;
    
    
    //Constructor
    public Telefon(String marca, Persona persona, boolean onOff){
        super(new String[]{null, null, null, null});
        this.marca = marca;
        this.persona = persona;
        this.onOff = onOff;
    }
    
    @Override
    public boolean validaPatrons(Object o) {
        Persona persona = (Persona) o;
        
        if (this.getOnOff()) {
            if (persona.getPatroCodiPin() != null) 
                return persona.getPatroCodiPin().equals(super.getPatroCodiPin());
            if (persona.getPatroTeclat() != null) 
                return persona.getPatroTeclat().equals(super.getPatroTeclat());
            if (persona.getPatroEmprempta() != null) 
                return persona.getPatroEmprempta().equals(super.getPatroEmprempta());
            if (persona.getPatroRostre() != null) 
                return persona.getPatroRostre().equals(super.getPatroRostre());
            return false;
        } else {
            System.out.println("Telèfon no encès");
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Marca: " + this.marca;
       
    }
    
    @Override
    public void on(){
        if(!this.onOff){
            this.onOff = true;
        }
    }
    @Override
    public void off(){
        if(this.onOff){
            this.onOff = false;
        }
    }
    
    @Override
    public boolean equals (Object o){
        Telefon t = (Telefon) o;
        return t.marca.equals(this.marca) && t.persona.equals(this.persona);
    }
    //Setters y Getters
    public boolean getOnOff(){
        return onOff;
    }
    
    public void setOnOff(boolean onOff){
        this.onOff = onOff;
    }

    
    
}
