package unidad_05_Bucles;

import java.util.Scanner;

public class Ejercicio21_5 {
    public static void main (String[] args){
        /*Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo
         */
         Scanner sInt = new Scanner(System.in);
    int numeroIntroducido=1, contadorNormal=0, contadorImpar=0, sumatorioImpar=0,mediaImpar=0,parMayor=0;


    while(numeroIntroducido>0){
        System.out.println("Introduzca un numero positivo, o un numero negativo para terminar el programa.");
        numeroIntroducido=sInt.nextInt();
        if(numeroIntroducido>0) {

            contadorNormal++;

            if (numeroIntroducido % 2 != 0) {
                contadorImpar++;
                sumatorioImpar += numeroIntroducido;
                mediaImpar = sumatorioImpar / contadorImpar;
            } else {
                if (parMayor < numeroIntroducido) {
                    parMayor = numeroIntroducido;
                }
            }
        }
    }

        System.out.println(
               "Cantidad de numeros: "+contadorNormal+"\n"+
                        "Media de los impares: "+mediaImpar+"\n"+
                        "Par mayor: "+parMayor
        );
    }
}
