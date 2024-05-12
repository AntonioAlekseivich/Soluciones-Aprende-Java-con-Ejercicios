package unidad_08_Funciones;

import unidad_07_Array.Methods;

/*
Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga
lo que se especifica en los comentarios (puedes incluirla en tu propia biblioteca
de rutinas):
public int[] filtraCon7(int x[]) // Devuelve un array con todos los números
// que contienen el 7 (por ej. 7, 27, 782)
// que se encuentren en otro array que se
// pasa como parámetro. El tamaño del array
// que se devuelve será menor o igual al
// que se pasa como parámetro.
Utiliza esta función en un programa para comprobar que funcionan bien. Para
que el ejercicio resulte más fácil, las repeticiones de números que contienen
7 se conservan; es decir, si en el array x el número 875 se repite 3 veces, en
el array devuelto también estará repetido 3 veces. Si no existe ningún número
que contiene 7 en el array x, se devuelve un array con el número -1 como único
elemento.
 */
public class Ejercicio40_08 {
    public static void main(String[] args) {
        int [] arrayOriginal = {12,7,12,15,72,12674,12,7,87};
        int [] arrayDe7 = filtraCon7(arrayOriginal);

        Methods.imprimirArrayInt(arrayDe7);
    }

    public static int[] filtraCon7(int x[]) {
        int counter=0,counterAux=0;
        for (int i = 0; i < x.length; i++) {
            if(Methods.longContieneDigito(x[i],7))
                counter++;
        }
        int [] arrayDe7 = new int[counter];
        for (int i = 0; i < x.length; i++) {
            if(Methods.longContieneDigito(x[i],7)) {
                arrayDe7[counterAux] = x[i];
                counterAux++;
            }
        }
    return arrayDe7;
    }

}
