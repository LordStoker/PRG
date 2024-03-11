/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT9_7A;

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
        Biblioteca biblioteca = new Biblioteca();

        // Afegir alguns llibres a la biblioteca
        biblioteca.afegeixLlibre(new Llibre("El Senyor dels Anells", "J.R.R. Tolkien", 1954, 25.0));
        biblioteca.afegeixLlibre(new Llibre("Cien años de soledad", "Gabriel García Márquez", 1967, 20.0));
        biblioteca.afegeixLlibre(new Llibre("1984", "George Orwell", 1949, 18.0));

        // Mostrar els llibres disponibles a la biblioteca
        System.out.println(biblioteca.toString());

        // Crear un client de la biblioteca
        Client client = new Client("Anna", "Martínez");

        // Prestar alguns llibres al client
        Llibre llibrePrestat1 = biblioteca.cercaLlibre("El Senyor dels Anells");
        Llibre llibrePrestat2 = biblioteca.cercaLlibre("Cien años de soledad");

        if (llibrePrestat1 != null) {
            client.prestaLlibre(llibrePrestat1);
        }

        if (llibrePrestat2 != null) {
            client.prestaLlibre(llibrePrestat2);
        }

        // Mostrar els llibres prestats pel client
        System.out.println("\nLlibres prestats per " + client.getNom() + " " + client.getCognom() + ":");
        for (Llibre llibre : client.getLlibresPrestats()) {
            System.out.println(llibre);
        }        
        
    }
    
}
