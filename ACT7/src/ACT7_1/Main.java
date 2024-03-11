/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT7_1;

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
     //Modulos DAW  
     try{
        Modul prg = new Modul("Programació", 8);
        Modul gbd = new Modul("Base de dades", 8);
        Modul llm = new Modul("Llenguatge de marques", 4);
        Modul si = new Modul("Sistemas Informáticos", 5);
        Modul ed = new Modul("Entornos de desarrollo", 3);

        //Módulos ASIX
        Modul fh = new Modul("Fonaments de Hardware", 3);
        Modul asixGbd = new Modul("Base da dades", 8);
        Modul fol = new Modul("Formació i orientació laboral", 3);
        Modul iso = new Modul("Implantació de sistemes operatius", 7);
        Modul asixLlm = new Modul("Llenguatge de Marques", 4);

        //Módulos SMX
        Modul ao = new Modul ("Aplicaciones ofimátiques", 8);
        Modul smxFol = new Modul ("Formació i orientació laboral", 3);
        Modul som = new Modul ("Sistemes operatius monoestació", 5);
        Modul mme = new Modul ("Muntatge i manteniment d'equips", 7);
        Modul xl = new Modul ("Xarxes locals", 5);


        //Ciclo DAW
        Cicle daw = new Cicle ("Desenvolupament d'Aplicaciones Web", 25);
        daw.afegeixModul(prg);
        daw.afegeixModul(gbd);
        daw.afegeixModul(llm);
        daw.afegeixModul(si);
        daw.afegeixModul(ed);

        //Ciclo ASIX

        Cicle asix = new Cicle("Administració de Sistemes i xarxes", 32);
        asix.afegeixModul(fh);
        asix.afegeixModul(asixGbd);
        asix.afegeixModul(fol);
        asix.afegeixModul(iso);
        asix.afegeixModul(asixLlm);

        //Ciclo SMX
        Cicle smx = new Cicle("Sistemes microinformàtics i xarxes", 27);

        smx.afegeixModul(ao);
        smx.afegeixModul(smxFol);
        smx.afegeixModul(som);
        smx.afegeixModul(mme);
        smx.afegeixModul(xl);

        //Creamos el instituto y le añadimos los ciclos.
        Institut eD = new Institut("01", "Emili Darder");

        eD.afegeixCicle(smx);
        eD.afegeixCicle(asix);
        eD.afegeixCicle(daw);

        System.out.println(ao.mostrarModul());
        System.out.println(daw.mostrarCicle());
        System.out.println(eD.mostraInstitut());
        
       
        }
    catch(Exception e){
    e.printStackTrace();
}
     
     
        
    }
    
}
