package unidad_07_Array.Bidimensionales;
/*
Modifica el programa anterior de tal forma que no se repita ningún número en
el array.
 */

import unidad_07_Array.Methods;

public class Ejercicio6_7 {
    public static void main(String[] args) {

        int [][] array = Methods.arrayBidimensionalNumAleatoriosSinRepe(6,10,0,1000);

        int maximo=0,minimo=1000;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                if(minimo>array[i][j])
                    minimo=array[i][j];
                if(maximo<array[i][j])
                    maximo=array[i][j];
            }
        }
        Methods.imprimirArrayBidimensional(array,6,10);
        System.out.println("Maximo: "+maximo);
        System.out.println("Minimo: "+minimo);
    }
}
