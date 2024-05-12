package unidad_08_Funciones;

import unidad_07_Array.Methods;

/*
Implementa una función con nombre nEsimo que busque el número que hay
dentro de un array bidimensional en la posición n-ésima contando de izquierda
a derecha y de arriba abajo, como si se estuviera leyendo. El primer elemento
es el 0. Si la posición donde se busca no existe en el array, la función debe
devolver -1. Se debe entregar tanto el código de la función como el código de
prueba que la usa. La cabecera de la función es la siguiente:
 */
public class Ejercicio53_08 {
    public static void main(String[] args) {
        int [][]array = Methods.arrayBidimensionalNumAleatorios(6,4,0,100);
       Methods.imprimirArrayBidimensional(array,6,4);
        System.out.println();
       System.out.println(nEsimo(array,3));
        System.out.println(nEsimo(array,0));
        System.out.println(nEsimo(array,23));
        System.out.println(nEsimo(array,24));
        System.out.println(nEsimo(array,100));
    }
    public static int nEsimo(int[][] n, int posicion){
        int num = -1;
        int counter=0;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if(counter==posicion) {
                    num = n[i][j];
                    break;
                }
                counter++;
            }
            if(num!=-1)
                break;
        }
        return num;
    }
}
