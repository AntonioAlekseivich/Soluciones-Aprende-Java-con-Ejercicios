package unidad_08_Funciones;

import unidad_07_Array.Methods;

/*
Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga
lo que se especifica en los comentarios (puedes incluirla en tu propia biblioteca
de rutinas):
public int[] filtraCapicuas(int x[]) // Devuelve un array con todos los números
// capicúa que se encuentren en otro array
// que se pasa como parámetro.
// Obviamente el tamaño del array que se
// devuelve será menor o igual al que se
// pasa como parámetro.
Utiliza esta función en un programa para comprobar que funcionan bien. Para
que el ejercicio resulte más fácil, las repeticiones de números capicúa se
conservan; es decir, si en el array x el número 505 se repite 3 veces, en el
array devuelto también estará repetido 3 veces. Si no existe ningún número
capicúa en x, se devuelve un array con el número -1 como único elemento.
 */
public class Ejercicio38_08 {
    public static void main(String[] args) {
        int []x= {232,232,123,302,321,123,808,989,232,1234,14};
        int [] capicua= filtraCapicuas(x);
        Methods.imprimirArrayInt(capicua);

        }

    public static int[] filtraCapicuas(int x[]) {
        int counter = -1,arrayLength=1;


        for (int i = 0; i < x.length; i++) {//Contamos los capicua

            if (Methods.esCapicua(x[i])) {
                counter++;

            }
        }



        arrayLength+=counter;
        int[] array = new int[arrayLength];

        if (counter >= 0) {
            int counterAux = 0;
            for (int i = 0; i < x.length; i++) {

                if (Methods.esCapicua(x[i])) {
                    array[counterAux] = x[i];
                    counterAux++;

                }
            }
        }
        else
            array[0]=-1;

        return array;
    }
}
