package unidad_08_Funciones;

import unidad_07_Array.Methods;

/*
Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga
lo que se especifica en los comentarios (puedes incluirla en tu propia biblioteca
de rutinas):
public static int[] filtraPrimos(int x[]) // Devuelve un array con todos los
// números primos que se encuentren
// en otro array que se pasa como
// parámetro.
// Obviamente el tamaño del array
// que se devuelve será menor o
// igual al que se pasa como
// parámetro.
Utiliza esta función en un programa para comprobar que funcionan bien. Para
que el ejercicio resulte más fácil, las repeticiones de primos se conservan; es
decir, si en el array x el número 13 se repite 3 veces, en el array devuelto
también estará repetido 3 veces. Si no existe ningún número primo en x, se
devuelve un array con el número -1 como único elemento.
 */
public class Ejercicio36_08 {

    public static int[] filtraPrimos(int x[]) {
        int counter = 0;
        for (int i = 0; i < x.length; i++) {
            if (Methods.esPrimo(x[i]))
                counter++;
        }
        int[] array = new int[counter];
        int counterAux = 0;
        for (int i = 0; i < x.length; i++) {
            if (Methods.esPrimo(x[i])) {
                array[counterAux] = x[i];
                counterAux++;
            }
        }
        return array;
    }
}
