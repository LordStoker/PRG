/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ACT9_2A;

import ACT9_1.*;

/**
 *
 * @author Tomas
 */
public interface ValidadorDispositius {
    
    public abstract void setPatrons(String patroCodiPin, String patroTeclat, String patroEmprempta, String patroRostre);
    public abstract boolean validaPatrons(Object o);
    
}
