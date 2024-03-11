/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT6_1A;

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
        try{
            //Creación de DAW
            Cicle daw = new Cicle();
            daw.idCicle = 1;
            daw.nom = "Desarrollo de aplicaciones web";
            daw.numAlumnes = 23;
            //Módulos de DAW
            Modul entornosDeDesarrollo = new Modul();
            entornosDeDesarrollo.idModul = "FH";
            entornosDeDesarrollo.nom = "Entornos de desarrollo";
            entornosDeDesarrollo.idCicle = 1;
            entornosDeDesarrollo.horesSetmanals = 3;
            
            Modul formacioIOrientacioLaboralDAW = new Modul();
            formacioIOrientacioLaboralDAW.idModul = "FOL";
            formacioIOrientacioLaboralDAW.nom = "Formació i orientació laboral";
            formacioIOrientacioLaboralDAW.idCicle = 1;
            formacioIOrientacioLaboralDAW.horesSetmanals = 3;
            
            Modul gestioDeBaseDeDades = new Modul();
            gestioDeBaseDeDades.idModul = "GBD";
            gestioDeBaseDeDades.nom = "Gestió de base de dades";
            gestioDeBaseDeDades.idCicle = 1;
            gestioDeBaseDeDades.horesSetmanals = 8;            

            Modul llenguatgeDeMarquesDAW = new Modul();
            llenguatgeDeMarquesDAW.idModul = "LLM";
            llenguatgeDeMarquesDAW.nom = "Llenguatge de marques";
            llenguatgeDeMarquesDAW.idCicle = 1;
            llenguatgeDeMarquesDAW.horesSetmanals = 4;

            Modul programacio = new Modul();
            programacio.idModul = "PRG";
            programacio.nom = "Programació";
            programacio.idCicle = 1;
            programacio.horesSetmanals = 8;

            Modul sistemesInformatics = new Modul();
            sistemesInformatics.idModul = "SI";
            sistemesInformatics.nom = "Sistemes informàtics";
            sistemesInformatics.idCicle = 1;
            sistemesInformatics.horesSetmanals = 5;            
            
                   
            

            //Creación de ASIX
            Cicle asix = new Cicle();
            asix.idCicle = 2;
            asix.nom = "Administración de sistemas y redes";
            asix.numAlumnes = 25;
            
            //Móduls ASIX
            Modul fonamentsDeHardware = new Modul();
            fonamentsDeHardware.idModul = "FH";
            fonamentsDeHardware.nom = "Fonaments de Hardware";
            fonamentsDeHardware.idCicle = 2;
            fonamentsDeHardware.horesSetmanals = 3;

            Modul gestioIBaseDeDades = new Modul();
            fonamentsDeHardware.idModul = "GBD";
            fonamentsDeHardware.nom = "Gestio de bases de dades";
            fonamentsDeHardware.idCicle = 2;
            fonamentsDeHardware.horesSetmanals = 8;

            Modul formacioIOrientacioLaboralASIX = new Modul();
            formacioIOrientacioLaboralASIX.idModul = "FOL";
            formacioIOrientacioLaboralASIX.nom = "Formació i orientació laboral";
            formacioIOrientacioLaboralASIX.idCicle = 3;
            formacioIOrientacioLaboralASIX.horesSetmanals = 3;

            Modul implantacioDeSistemesOperatius = new Modul();
            implantacioDeSistemesOperatius.idModul = "ISO";
            implantacioDeSistemesOperatius.nom = "Implantació de sistemes operatius";
            implantacioDeSistemesOperatius.idCicle = 2;
            implantacioDeSistemesOperatius.horesSetmanals = 7;

            Modul llenguatgeDeMarquesASIX = new Modul();
            llenguatgeDeMarquesDAW.idModul = "LLM";
            llenguatgeDeMarquesDAW.nom = "Llenguatge de marques";
            llenguatgeDeMarquesDAW.idCicle = 1;
            llenguatgeDeMarquesDAW.horesSetmanals = 4;

            Modul planificacioIAdministracioDeXarxes = new Modul();
            planificacioIAdministracioDeXarxes.idModul = "PAX";
            planificacioIAdministracioDeXarxes.nom = "Planificació i administració de xarxes";
            planificacioIAdministracioDeXarxes.idCicle = 2;
            planificacioIAdministracioDeXarxes.horesSetmanals = 5;            
            

            //Creación de SMX
            Cicle smx = new Cicle();
            smx.idCicle = 3;
            smx.nom = "Sistemas microinformáticos y redes";
            smx.numAlumnes = 27;
            //Módulos SMX
            Modul aplicacionsOfimatiques = new Modul();
            aplicacionsOfimatiques.idModul = "AO";
            aplicacionsOfimatiques.nom = "Aplicacions ofimàtiques";
            aplicacionsOfimatiques.idCicle = 3;
            aplicacionsOfimatiques.horesSetmanals = 8;

            Modul formacioIOrientacioLaboralSMX = new Modul();
            formacioIOrientacioLaboralSMX.idModul = "FOL";
            formacioIOrientacioLaboralSMX.nom = "Formació i orientació laboral";
            formacioIOrientacioLaboralSMX.idCicle = 3;
            formacioIOrientacioLaboralSMX.horesSetmanals = 3;

            Modul muntatgeIMantenimentdEquips = new Modul();
            muntatgeIMantenimentdEquips.idModul = "MME";
            muntatgeIMantenimentdEquips.nom = "Muntatge i manteniment d'equips";
            muntatgeIMantenimentdEquips.idCicle = 3;
            muntatgeIMantenimentdEquips.horesSetmanals = 7;

            Modul sistemesOperatiusMonoestacio = new Modul();
            sistemesOperatiusMonoestacio.idModul = "SOM";
            sistemesOperatiusMonoestacio.nom = "Sistemes operatius monoestació";
            sistemesOperatiusMonoestacio.idCicle = 3;
            sistemesOperatiusMonoestacio.horesSetmanals = 5;

            Modul xarxesLocals = new Modul();
            xarxesLocals.idModul = "XL";
            xarxesLocals.nom = "Xarxes locals";
            xarxesLocals.idCicle = 3;
            xarxesLocals.horesSetmanals = 7;
            
            System.out.println(daw.verCiclo());
            System.out.println(xarxesLocals.verCiclo());
        }
        catch(Exception e){
        System.out.println(e.getMessage());
        }
    }    
}
