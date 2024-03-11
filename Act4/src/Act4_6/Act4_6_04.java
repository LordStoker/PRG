
package Act4_6;

import Act4_1.UtilitatsArrays;
import Act4_2.UtilitatsMatrius;
import Act4_3.UtilitatsConsola;
import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public class Act4_6_04 {
    static int SIMBOL_BUIT = 0;
    static int SIMBOL_CUC = 1;
    static int SIMBOL_CAPCUC = 2;
    static int SIMBOL_FULLES = 99;
    static int MEDIDATABLA;
    static int NFULLES ;
    static int [][] tabla;
    static ArrayList<int[]> cuc = new ArrayList<>();  
    static int accio;
    static int fulles[];
    static int puntuacion;

    public static void main(String[] args) {
        
        final int MEDIDATABLA = UtilitatsConsola.llegirSencer("Mida del tablero: "); 
        final int NFULLES = UtilitatsConsola.llegirSencer("Introduce el número de hojas: ");    
        tabla = UtilitatsMatrius.generaMatriu(MEDIDATABLA, 0, 0); 
        
//LE DECIMOS DONDE ESTÁ EL GUSANO DENTRO LA MATRIZ(TABLA)
        emplenaTauler(tabla, cuc, NFULLES);
//Bucle mostrando la matriz(tabla) Coge un valor por pantalla que usa en el método de cambiar posición.
        do{
   
        mostrarMatriu(tabla);
        puntuacion = cuc.size();
        accio = UtilitatsConsola.llegirSencer("PUNTUACION = " + puntuacion + " " + "ACCIONES: 8: ARRIBA, 2: ABAJO, 4: IZQUIERDA, 6: DERECHA 0:SALIR ");
        if((accio ==2) | (accio ==4) | (accio ==6) | (accio ==8)){         
        cambiaPosicio(tabla, cuc, accio);
        }
        if(SIMBOL_CUC == SIMBOL_BUIT-1){
            System.out.println("You lose");
            accio = 0;
        }
        else if(cuc.size() == (MEDIDATABLA*MEDIDATABLA)-NFULLES){
            System.out.println("You win");
            accio = 0;
        }
        
        }while(accio != 0);
    }
    
     //GUARDAMOS LA FILA Y LA COLUMNA DEL ÚLTIMO Y EL PRIMER ELEMENTO DE CUC, SEGUN LA ACCIÓN SUMAMOS, RESTAMOS O DA LA VUELTA EN FUNCIÓN DE SU POSICIÓN ACTUAL
    public static void cambiaPosicio (int[][] tabla, ArrayList<int[]> cuc, int accio){
        int tamaño = tabla.length;
        int[] posCucCap = {cuc.get(cuc.size()-1)[0], cuc.get(cuc.size()-1)[1]};
        int[] posCucCua = {cuc.get(0)[0], cuc.get(0)[1]};
        
        
        tabla[posCucCap[0]] [posCucCap[1]] = SIMBOL_CUC;
        switch (accio){
            case 8:
                posCucCap[0] = posCucCap[0] == 0 ? tamaño -1 : posCucCap[0]-1;
                break;
            case 2:
                posCucCap[0] = posCucCap[0] == tamaño-1 ? 0 : posCucCap[0]+1;
                break;
            case 4:
                posCucCap[1] = posCucCap[1] == 0 ? tamaño-1 : posCucCap[1]-1;
                break;
            case 6:
                posCucCap[1] = posCucCap[1] == tamaño-1 ? 0 : posCucCap[1]+1;         
                break;            
        }
//AÑADIMOS LA NUEVA COORDENADA SEGÚN LA ACCIÓN, SI HAY HOJA, SOLO AÑADISMO, SINO HAY HOJA AÑADIMOS Y BORRAMOS LA PRIMERA(COLA)        
        if(tabla[posCucCap[0]][posCucCap[1]] == SIMBOL_FULLES){
            cuc.add(posCucCap);
            tabla[posCucCap[0]][posCucCap[1]] = SIMBOL_CAPCUC;
            
            añadirHoja(tabla);            
        }
        else if ((tabla[posCucCap[0]] [posCucCap[1]]) == SIMBOL_BUIT){
            cuc.add(posCucCap);
            tabla[posCucCap[0]][posCucCap[1]] = SIMBOL_CAPCUC;
            cuc.remove(0);
            tabla[posCucCua[0]][posCucCua[1]] = SIMBOL_BUIT;            
        }
        else{
            SIMBOL_CUC = SIMBOL_BUIT-1;
        }

        
    }
        
    //LE INDICAMOS A LA MATRIZ DE TABLA EN QUÉ ÍNDICES ESTÁ EL GUSANO Y LAS N HOJAS. COMRPOBAMOS QUE NO SE SOBRESCRIBA EL GUSANO CON LAS HOJAS NI OTRAS HOJAS.
    public static void emplenaTauler (int[][] tabla, ArrayList<int[]> cuc, int NFULLES){
        final int MIN = 0, MAX=tabla.length-1;
        int [] cucPos = UtilitatsArrays.generaArray(2, MIN, MAX);        
        cuc.add(cucPos);        
        tabla[cucPos[0]][cucPos[1]] = SIMBOL_CAPCUC;
        
        int i = 0;        
        while(i < NFULLES){
            añadirHoja(tabla);
            i++;
        }
    }
    //MÉTODO PARA AÑADIR NUEVA HOJA SI EL GUSANO SE COME UNA, COMPROBANDO LA POSICIÓN NO SEA NI UN GUSANO NI OTRA HOJA
    public static void añadirHoja (int [][] tabla){
        fulles = UtilitatsArrays.generaArray(2, 0, tabla.length-1);
        boolean huecoVacio = false;        
        while(!huecoVacio){
            if(tabla[fulles[0]][fulles[1]] == SIMBOL_BUIT){
                tabla[fulles[0]][fulles[1]] = SIMBOL_FULLES;
                huecoVacio = true;
            }
            else
                fulles = UtilitatsArrays.generaArray(2, 0, tabla.length-1);                        
        }
    }
    
    public static void mostrarMatriu(int[][] tabla){
        String symbol = "";
        for(int i= 0; i < tabla.length; i++){
            System.out.print("| ");
            for(int j = 0; j < tabla[i].length; j++){
                if(tabla[i][j] == SIMBOL_BUIT){
                    symbol = " ";
                }
                else if(tabla[i][j]==SIMBOL_CUC){
                    symbol = ".";
                }
                else if(tabla[i][j] == SIMBOL_FULLES){
                    symbol = "*";
                }
                else if(tabla[i][j] == SIMBOL_CAPCUC){
                    symbol = "O";
                }
                System.out.print(symbol);
            }
            System.out.println("  |");
        }
    }
}
