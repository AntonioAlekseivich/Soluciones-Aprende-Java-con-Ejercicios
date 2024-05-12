package unidad_08_Funciones;

import unidad_07_Array.Methods;

/*
Define la función mezcla con la siguiente cabecera:
public static int[] mezcla(int[] a, int[] b)
Esta función toma dos arrays como parámetros y devuelve un array que es
el resultado de mezclar los números de ambos de forma alterna, se coge un
número de a, luego de b, luego de a, etc. Los arrays a y b pueden tener
longitudes diferentes; por tanto, si se terminan los números de un array se
terminan de coger todos los que quedan del otro.
 */
public class Ejercicio50_08 {
    public static void main(String[] args) {
        int[] a = Methods.arrayConNumerosAleatorios(10, 0, 50);
        Methods.imprimirArrayInt(a);
        int[] b = Methods.arrayConNumerosAleatorios(20, 0, 50);
        Methods.imprimirArrayInt(b);

        int[] mezcla = mezcla(a, b);
        Methods.imprimirArrayInt(mezcla);
    }

    public static int[] mezcla(int[] a, int[] b) {
        int[] array = new int[a.length + b.length];
        int counterA = 0, counterB = 0;
        boolean asignado=true;
        for (int i = 0; i < array.length; i++) {
            asignado=false;
            if (counterA < a.length && counterB < b.length ) {
                if (i % 2 == 0) {
                    array[i] = a[counterA];
                    counterA++;
                    asignado=true;
                } else {
                    array[i] = b[counterB];
                    counterB++;
                    asignado=true;
                }
            }
            if (counterA == a.length && !asignado) {
                array[i] = b[counterB];
                counterB++;

            } else if(!asignado){
                array[i] = a[counterA];
                counterA++;
            }

        }
        return array;
    }
}
