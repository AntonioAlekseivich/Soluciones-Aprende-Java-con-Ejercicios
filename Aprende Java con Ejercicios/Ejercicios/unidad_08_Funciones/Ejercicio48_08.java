package unidad_08_Funciones;
/*
Define la función concatena con la siguiente cabecera:
public static int[] concatena(int[] a, int[] b)
Esta función toma dos arrays como parámetros y devuelve un array que es el
resultado de concatenar ambos. Por ej. si a = { 8, 9, 0 } y b = { 1, 2, 3 },
concatena(a, b) devuelve { 8, 9, 0, 1, 2, 3 }.
 */
public class Ejercicio48_08 {
    public static int [] concatena(int [] a, int[] b){
        int [] array = new int [a.length+b.length];
        int counter=0;
        for (int i = 0; i < a.length; i++) {
            array[counter]=a[i];
            counter++;
        }
        for (int i = 0; i < a.length; i++) {
            array[counter]=b[i];
            counter++;
        }
        return array;
    }
}
