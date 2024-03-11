
package Act4_4;
import Act4_1.UtilitatsArrays;
import Act4_2.UtilitatsMatrius;
import java.util.ArrayList;
import Act4_3.UtilitatsConsola;
/**
 *
 * @author Tomas
 */
public class Act4_4_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> alumnes = new ArrayList<>();
        ArrayList<ArrayList<Integer>> notes = new ArrayList<>();
        ArrayList<Integer>notaAlumno = new ArrayList<>();
        ArrayList<Integer>notasAlumno = new ArrayList<>();        
        int nota = 0;
        String alumno = "";
        float media = 0;
        int contador = 0;
        int sumaNotas = 0;
             
        //Rellenamos alumnos y sus notas. 
        while(true){
            alumno = UtilitatsArrays.llegirCadena("Introduce el nombre del alumno (sortir para salir): ");            
            if (alumno.equalsIgnoreCase("sortir")){
                break;
            }
            else{
                    alumnes.add(alumno);
                    }
           do{ 
                nota = UtilitatsConsola.llegirSencer("Introduce la nota: (-1 para salir)");
                if (nota == -1){
                    break;
                }
                else{
                    notaAlumno.add(nota);
                }             
            }while(true);
           notes.add(notaAlumno);        
        }
        
        //Imprimimos las notas y la media de cada alumno.            
        for (int i = 0; i < alumnes.size(); i++){
            System.out.print("[");
            String separador = " ";
            System.out.print(alumnes.get(i) + ":");
            notasAlumno = notes.get(i); 
            for(int j = 0; j < notasAlumno.get(i); j++){
                System.out.print(separador + notasAlumno.get(j));
                sumaNotas = sumaNotas + notasAlumno.get(j);
                contador++;
                separador = ", ";
            }
            System.out.println(" ");
            media = sumaNotas / contador;
            contador = 0;
            System.out.print("Mitjana= " + media);
            System.out.println();
            
        }
    }
}
