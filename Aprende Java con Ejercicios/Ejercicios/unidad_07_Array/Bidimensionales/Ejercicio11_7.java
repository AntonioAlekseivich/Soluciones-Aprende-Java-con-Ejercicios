package unidad_07_Array.Bidimensionales;

import unidad_07_Array.Methods;

/*
Realiza un programa que muestre por pantalla un array de 10 filas por 10
columnas relleno con números aleatorios entre 200 y 300. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal.
 */
public class Ejercicio11_7 {
    public static void main(String[] args) {
        int [][] array = Methods.arrayBidimensionalNumAleatorios(10,10,200,300);
        Methods.imprimirArrayBidimensional(array,10,10);
        System.out.println();

        Methods.mostrarDiagonalPrincipalMatriz(10,10,array);
        System.out.println();

        mostrarMaximoMinimoYMediaDeDiagonalPrincipalMatriz(10,10,array);
    }


    private static void mostrarMaximoMinimoYMediaDeDiagonalPrincipalMatriz(int x, int y, int[][]array){
       int maxima=200,minima=300,media=0,contador=0,sumatorio=0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(i==j){
                    if(maxima<array[i][j])
                        maxima=array[i][j];
                    if(minima>array[i][j])
                        minima=array[i][j];
                    contador++;
                    sumatorio+=array[i][j];
                }
            }
        }
        media=sumatorio/contador;

        System.out.println("Minima: "+minima+"\n"+
                "Maxima: "+maxima+"\n"+
                "Media: "+media+"\n");
    }
}
