package unidad_07_Array.Bidimensionales;
/*
Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha.
 */

import unidad_07_Array.Methods;

public class Ejercicio2_7 {
    public static void main(String[] args) {
        int cols=5,rows=4;
        int num [][] = new int [rows][cols];
        int sumatorioFila=0,sumaTotal=0;

        int [] sumatorioColumna= new int[5];
        for (int i = 0; i < sumatorioColumna.length; i++) {
            sumatorioColumna[i]=0;
        }

        for (int i = 0; i <rows; i++) {//Inicializa la matriz
            for (int j = 0; j <cols; j++) {
                    Methods.soutPedirInt();
                    num[i][j] = Methods.pedirInt();
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
