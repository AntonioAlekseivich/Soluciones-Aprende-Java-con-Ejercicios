package unidad_07_Array.Unidimensionales;
import unidad_07_Array.Methods;

import java.util.ArrayList;

/*
Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
ambos incluidos y que los almacene en un array. A continuación, el programa
debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
programa debe colocar de forma alterna y en orden los menores o iguales de
100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
mayor… Cuando se acaben los menores o los mayores, se completará con los
números que queden.
 */
public class Ejercicio18_7 {
    public static final int TAMANIO = 10;

    public static void main(String[] args) {

        int[] array = Methods.arrayConNumerosAleatorios(TAMANIO, 0, 200);

        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        Methods.imprimirArrayInt(array);

        int[] arrayResultante = new int[TAMANIO];

        ArrayList<Integer> indicesAsignados = new ArrayList<Integer>();

        boolean alternar = true;

        for (int i = 0; i < TAMANIO; i++) {//contador global
            if (alternar) {
                if (Methods.esPar(i)) {
                    for (int j = 0; j < array.length; j++) {//recorremos array original buscando menor
                        if (array[j] <= 100 && !indicesAsignados.contains(j)) {
                            indicesAsignados.add(j);
                            arrayResultante[i] = array[j];
                            break;
                        } else if (j == array.length - 1)//si no hay mayor, apagamos la alternatividad
                            alternar = false;
                    }

                } else {
                    for (int j = 0; j < array.length; j++) {//recorremos array original buscando mayor
                        if (array[j] > 100 && !indicesAsignados.contains(j)) {
                            indicesAsignados.add(j);
                            arrayResultante[i] = array[j];
                            break;
                        } else if (j == array.length - 1)//si no hay mayor, apagamos la alternatividad
                            alternar = false;
                    }
                }
            }
            if(!alternar) {
                for (int j = 0; j < array.length; j++) {
                    if (!indicesAsignados.contains(j)) {
                        arrayResultante[i] = array[j];
                        indicesAsignados.add(j);
break;
                    }
                }
            }
        }

        Methods.imprimirArrayInt(arrayResultante);
    }
}