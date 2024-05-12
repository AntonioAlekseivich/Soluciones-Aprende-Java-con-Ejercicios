package unidad_07_Array.Bidimensionales;

import unidad_07_Array.Methods;

import java.lang.reflect.Member;

/*
Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo.
 */
public class Ejercicio5_7 {
    public static void main(String[] args) {

        int [][] array = Methods.arrayBidimensionalNumAleatorios(6,10,0,1000);

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
