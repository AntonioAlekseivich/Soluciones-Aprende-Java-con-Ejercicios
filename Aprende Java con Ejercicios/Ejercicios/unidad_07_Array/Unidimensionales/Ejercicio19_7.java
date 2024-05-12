package unidad_07_Array.Unidimensionales;
/*Realiza un programa que sea capaz de insertar un número en una posición
concreta de un array. En primer lugar, el programa generará un array de 12
números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
el programa preguntará por el número que se quiere insertar y por la posición
donde será insertado. Los números del array se desplazan a la derecha para
dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
siempre se perderá.

 */

import unidad_07_Array.Methods;

public class Ejercicio19_7 {
    public static void main(String[] args) {
        int[] array = Methods.arrayConNumerosAleatorios(12, 0, 200);
        Methods.imprimirArrayInt(array);

        System.out.println("Introduzca el número que quiere insertar:");
        int num = Methods.pedirInt();

        System.out.println("Introduzca la posición donde lo quiere insertar (0 – 11):");
        int posicion = Methods.inputBetween2Num(0, 11);

        for (int i = array.length-1; i > posicion; i--) {
                array[i]=array[i-1];
        }
        array[posicion]=num;

        Methods.imprimirArrayInt(array);
    }
}
