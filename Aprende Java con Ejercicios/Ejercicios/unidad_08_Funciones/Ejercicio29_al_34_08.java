package unidad_08_Funciones;

import unidad_07_Array.Methods;
import unidad_08_Funciones.Ejercicio20_al_28_08;

/*
Crea una biblioteca de funciones para arrays bidimensionales (de dos dimensiones)
de números enteros que contenga las siguientes funciones:
 */
public class Ejercicio29_al_34_08 {

    public static int[][] generaArrayBiInt(int x, int y, int menor, int mayor) {
        int[][] array = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = Methods.numAleatorioEnRango(menor, mayor);
            }
        }
        return array;
    }

    public static int[] filaDeArrayBiInt(int[][] array, int i) {
        int[] arrayAux = new int[array.length];

        for (int j = 0; j < arrayAux.length; j++) {
            arrayAux[j] = array[i][j];
        }
        return arrayAux;
    }

    public static int[] columnaDeArrayBiInt(int[][] array, int j) {
        int[] arrayAux = new int[array.length];
        for (int i = 0; i < arrayAux.length; i++) {
            arrayAux[i] = array[i][j];
        }
        return arrayAux;
    }

    public static int[] coordenadasEnArrayBiInt(int[][] array, int num) {
        int[] arrayAux = {-1, -1};
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (!found)
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] == num) {
                        arrayAux[0] = i;
                        arrayAux[1] = j;
                        found = true;
                        break;
                    }
                }
        }
        return arrayAux;
    }

    public static boolean esPuntoDeSilla(int[][] array, int num) {
        int[] fil = filaDeArrayBiInt(array, num);
        int[] col = columnaDeArrayBiInt(array, num);
        boolean puntoDeSilla = false;

        if (Ejercicio20_al_28_08.maximoArrayInt(col) == num && Ejercicio20_al_28_08.minimoArrayInt(fil) == num)
            puntoDeSilla = true;

        return puntoDeSilla;
    }


    public static void main(String[] args){
        int [][] a=Methods.arrayBidimensionalNumAleatorios(5,6,10,100);
        Methods.imprimirArrayBidimensional(a,5,6);
        System.out.println();
        Methods.imprimirArrayInt(diagonal(a,3,2,"neso"));


    }
    public static int[] diagonal(int[][] array, int fila, int columna, String direccion) {

        int[] diagonal = new int[array.length];

        if (direccion.equals("nose")) {
            for (int i = 0; i < array.length; i++) {
                diagonal[i] = array[fila + i][columna + i];
            }
        } else if (direccion.equals("neso")) {
            for (int i = 0; i < array.length; i++) {
                diagonal[i] = array[fila + i][columna - i];
            }
        }

        return diagonal;
    }
}
