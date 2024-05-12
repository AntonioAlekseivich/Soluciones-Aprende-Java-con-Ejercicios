package unidad_07_Array.Bidimensionales;

import unidad_07_Array.Methods;

import java.util.concurrent.TimeUnit;

/*
Modifica el programa anterior de tal forma que las sumas parciales y la suma
total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
que el ordenador se queda “pensando” antes de mostrar los números.
 */
public class Ejercicio4_7 {
    public static void main(String[] args) throws InterruptedException {
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

            TimeUnit.SECONDS.sleep(1);

            System.out.print("| Sum row: "+sumatorioFila);
            sumaTotal+=sumatorioFila;
            System.out.println();
        }

        System.out.print("Sum cols: ");

        TimeUnit.SECONDS.sleep(1);

        for (int i = 0; i < sumatorioColumna.length; i++) {
            System.out.print(sumatorioColumna[i]+" ");
        }

        TimeUnit.SECONDS.sleep(1);
        System.out.println("| Total: "+sumaTotal);

    }
    }

