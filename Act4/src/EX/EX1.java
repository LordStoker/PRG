package EX;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Tomas
 */


import java.util.ArrayList;

public class EX1 {

    static ArrayList<String> historial = new ArrayList();
    static int index;

    public static void main(String[] args) {
       // Inicialitzaci� de l'historial de navegaci�
        historial.add("www.paginaInicial.com"); // historial[0]
        historial.add("www.primeraPagina.com"); // historial[1]
        historial.add("www.segonaPagina.com");  // historial[2]
        historial.add("www.terceraPagina.com"); // historial[3]
        historial.add("www.quartaPagina.com");  // historial[4]
        historial.add("www.paginaFinal.com");   // historial[5]
        index = historial.size() - 1;

        // Simulaci� 
        retrocedir(historial);      // retrocedir 1 posici� --> historial[4]
        retrocedir(historial,10); // retrocedir 10 posicions (o b� fins a l'inici) --> historial[0]
        avancar(historial);         // avan�ar 1 posici� --> historial[1]
        avancar(historial,2);     // avan�ar 2 posicions --> historial[3]
        
        System.out.println(visitarPagina(historial));       // visitar actual --> "www.terceraPagina.com"
        System.out.println(visitarPagina(historial,100)); // visitar posici� 100 (o b� fins el final) --> "www.paginaFinal.com"
        System.out.println(visitarPagina(historial));       // visitar actual--> "www.paginaFinal.com"

    }
    
    private static String visitarPagina(ArrayList<String> historial) {
        String web = historial.get(index);
        
        return web;
    }

    private static String visitarPagina(ArrayList<String> historial, int i) {
        index = Math.min(historial.size()-1, i);
        String web = historial.get(index);
        
        return web;
    }
    
    private static void retrocedir(ArrayList<String> historial) {
        retrocedir(historial,1);
    }
    
    private static void retrocedir(ArrayList<String> historial, int i) {
        if (!(historial.isEmpty())) {
            index = Math.max(0, index-i);
        }
    }
    
    private static void avancar(ArrayList<String> historial) {
        avancar(historial,1);
    } 
    
    private static void avancar(ArrayList<String> historial, int i) {
        if (!(historial.isEmpty())) {
            index = Math.min(historial.size()-1, index+i);
        }
    }

    private static void mostrarHistorial(ArrayList<String> historial) {
        for (String h : historial) {
            System.out.println(h);
        }
    }

}