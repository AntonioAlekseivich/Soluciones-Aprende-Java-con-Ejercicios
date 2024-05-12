package unidad_08_Funciones;

import unidad_07_Array.Methods;

/*
Implementa una función con nombre corteza que sea capaz de extraer la capa
exterior de un array bidimensional. Esta capa se extrae en forma de array de
una dimensión. La extracción de números comienza en la esquina superior
izquierda y continúa en el sentido de las agujas del reloj. Se debe entregar
tanto el código de la función como el código de prueba que la usa. La cabecera
de la función es la siguiente:
public static int[] corteza(int[][] n)
 */
public class Ejercicio56_08 {
    public static void main(String[] args) {
        int [][] n = Methods.arrayBidimensionalNumAleatorios(4,6,10,100);
        Methods.imprimirArrayBidimensional(n,4,6);
        System.out.println();
        Methods.imprimirArrayInt(corteza(n));
    }
    public static int[] corteza(int[][] n){
        int [] c = new int [(n.length*2+n[0].length*2)-4];
        int counter=0;
        for (int i = 0; i < n[0].length; i++) {
            c[counter]=n[0][i];
            counter++;
        }
        for (int i = 1; i < n.length; i++) {
            c[counter]=n[i][n[0].length-1];
            counter++;
        }
        for (int i = n[0].length-2; i >= 0 ; i--) {
            c[counter]=n[n.length-1][i];
            counter++;
        }
        for (int i = n.length-2; i > 0; i--) {
            c[counter]=n[i][0];
            counter++;
        }
        return c;
    }
}
