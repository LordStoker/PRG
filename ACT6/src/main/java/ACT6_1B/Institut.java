/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT6_1B;

import java.util.ArrayList;

/**
 *
 * @author Tomas
 */
public class Institut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //MÓDULOS DAW
        Modul pgr = new Modul();
        pgr.idModul = "PGR";
        pgr.nom = "Programació";
        pgr.horesSetmanals = 8;
        
        Modul gbd = new Modul();
        gbd.idModul = "GBD";
        gbd.nom = "Base de datos";
        gbd.horesSetmanals = 8;
        
        Modul si = new Modul();
        si.idModul = "SI";
        si.nom = "Sistemas informáticos";
        si.horesSetmanals = 5;
        
        Modul ed = new Modul();
        ed.idModul = "ED";
        ed.nom = "Entornos de desarrollo";
        ed.horesSetmanals = 3;
        
        //Ciclo DAW
        
        Cicle daw = new Cicle();
        
        daw.idCicle = 1;
        daw.nom = "Desarrollo de aplicaciones web";
        daw.numAlumnes = 23;
        daw.moduls = new ArrayList<Modul>();
        
        daw.moduls.add(pgr);
        daw.moduls.add(gbd);
        daw.moduls.add(si);
        daw.moduls.add(ed);
        System.out.println(daw.verCiclo());
        
        
    }
    
}
