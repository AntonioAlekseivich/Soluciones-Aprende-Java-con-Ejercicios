package unidad_07_Array.Bidimensionales;

import unidad_07_Array.Methods;

/*
Realiza un programa que muestre por pantalla un array de 9 filas por 9
columnas relleno con números aleatorios entre 500 y 900. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal.
 */
public class Ejercicio12_7 {
    public static void main(String[] args) {
        int [][] array = Methods.arrayBidimensionalNumAleatorios(9,9,500,900);

        Methods.imprimirArrayBidimensional(array,9,9);

        Methods.mostrarDiagonalSecundariaMatriz(9,9,array);

        mostrarMaximoMinimoYMediaDeDiagonalSecundariaMatriz(9,9,array);
    }
    private static void mostrarMaximoMinimoYMediaDeDiagonalSecundariaMatriz(int x, int y, int[][]array){
        int contadorDiagonal=x-1;
        int maxima=500,minima=900,media=0,contador=0,sumatorio=0;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(j==contadorDiagonal){
                    if(maxima<array[i][j])
                        maxima=array[i][j];
                    if(minima>array[i][j])
                        minima=array[i][j];
                    contador++;
                    sumatorio+=array[i][j];
                }
            }
            contadorDiagonal--;
        }

        media=sumatorio/contador;

        System.out.println("Minima: "+minima+"\n"+
                "Maxima: "+maxima+"\n"+
                "Media: "+media+"\n");
    }
}
