package unidad_07_Array.Bidimensionales;

import unidad_07_Array.Methods;

/*
Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999).
 */
public class Ejercicio3_7 {

    public static void main(String[] args) {

        int cols=5,rows=4;
        int num [][] = new int [rows][cols];
        int sumatorioFila=0,sumaTotal=0;

        int [] sumatorioColumna= new int[5];
        for (int i = 0; i < sumatorioColumna.length; i++) {
            sumatorioColumna[i]=0;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                num[i][j] = Methods.numAleatorioEnRango(100,900);
            }
        }

        for (int i = 0; i < rows; i++) {//Suma e imprime
            System.out.print("Row "+i+": ");
            sumatorioFila=0;
            for (int j = 0; j < cols; j++) {
                System.out.print(num[i][j]+" ");

                sumatorioFila+=num[i][j];

                sumatorioColumna[j]+=num[i][j];
            }
            System.out.print("| Sum row: "+sumatorioFila);
            sumaTotal+=sumatorioFila;
            System.out.println();
        }
        System.out.print("Sum cols: ");
        for (int i = 0; i < sumatorioColumna.length; i++) {
            System.out.print(sumatorioColumna[i]+" ");
        }

        System.out.println("| Total: "+sumaTotal);

    }
}

