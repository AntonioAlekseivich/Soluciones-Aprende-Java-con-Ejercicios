package unidad_05_Bucles;

import java.util.Scanner;

public class Ejercicio26_5 {
    public static void main(String[] args) {
        /*
        Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido.
         */
        Scanner sInt = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int n= sInt.nextInt();
        System.out.println("Introduzca un digito");
        int d=sInt.nextInt();

        String num= ""+n;
        String dig= ""+d;
        String pos="posiciones: ";
        for (int i = 0; i < num.length(); i++) {
            if(String.valueOf(num.charAt(i)).equals(dig)){
                pos += (i+1)+" ";
            }
        }

        System.out.println(
                num+"\n"+dig+"\n"+pos

        );
    }
}
