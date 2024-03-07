package unidad_05_Bucles;

import java.util.Scanner;

public class Ejercicio23_5 {
    public static void main (String[] args){
        /*Escribe un programa que permita ir introduciendo una serie indeterminada
        de números mientras su suma no supere el valor 10000. Cuando esto último
        ocurra, se debe mostrar el total acumulado, el contador de los números
        introducidos y la media*/
        Scanner sInt = new Scanner(System.in);
        int sumatorio=0;
        int contador=0;

        while(sumatorio<10000){
            System.out.println("Introduzca un numero");
            int n = sInt.nextInt();
            sumatorio+=n;
        contador++;

        }
        System.out.println(
                "Total acumulado:" +sumatorio+ "\n" +
                        "Contador de numeros:"+contador+"\n" +
                        "Media:" + ((double)sumatorio/contador)
        );
    }
}
