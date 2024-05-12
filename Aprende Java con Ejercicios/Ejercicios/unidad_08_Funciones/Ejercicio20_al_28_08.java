package unidad_08_Funciones;

import unidad_07_Array.Methods;

/*
Crea una biblioteca de funciones para arrays (de una dimensión) de números
enteros que contenga las siguientes funciones:
 */
public class Ejercicio20_al_28_08 {

    public static int[] generaArrayInt(int tamanio, int menor, int mayor) {
        int[] array = new int[tamanio];
        for (int i = 0; i < array.length; i++) {
            array[i] = Methods.numAleatorioEnRango(menor, mayor);
        }
        return array;

    }

    public static int minimoArrayInt(int[] array) {
        int minimo = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minimo > array[i])
                minimo = array[i];
        }
        return minimo;
    }

    public static int maximoArrayInt(int[] array) {
        int maximo = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maximo > array[i])
                maximo = array[i];
        }
        return maximo;
    }

    public static int mediaArrayInt(int[] array) {
        int media = 0, sumatorio = 0, counter = 0;

        for (int i = 0; i < array.length; i++) {
            sumatorio += array[i];
            counter++;
        }
        media = sumatorio / counter;
        return media;
    }

    public static boolean estaEnArrayInt(int num, int[] array) {
        boolean encontrado = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                encontrado = true;
                break;
            }
        }
        return encontrado;
    }

    public static int posicionEnArray(int num, int[] array) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void volteaArrayInt(int [] array){
        int inicio = 0;
        int fin = array.length - 1;
        while (inicio < fin) {
            // Intercambia los elementos en las posiciones inicio y fin
            int temp = array[inicio];
            array[inicio] = array[fin];
            array[fin] = temp;
            // Avanza al siguiente par de elementos
            inicio++;
            fin--;
        }
    }

    public static void rotarArrayHaciaLaDerecha(int[] array, int num) {
        for (int i = 0; i < num; i++) {

            int intAux = array[array.length-1];
            for (int j = array.length-1; j >0; j--) {
                array[j] = array[j -1];
            }
            array[0] = intAux;
        }
    }
    public static void rotarArrayHaciaLaIzquierda(int[] array, int num) {
        for (int i = 0; i < num; i++) {

            int intAux = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = intAux;
        }
    }

}

