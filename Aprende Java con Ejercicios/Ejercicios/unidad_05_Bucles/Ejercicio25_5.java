package unidad_05_Bucles;

import java.util.Scanner;

public class Ejercicio25_5 {
    public static void main(String[] args) {
        /*
        Realiza un programa que pida un número por teclado y que luego muestre ese
        número al revés.
        */
        Scanner sInt = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int n= sInt.nextInt();

        String num = ""+ n;
        String numInvertido="";

        for (int i = num.length(); i > 0; i--) {
            numInvertido+=num.charAt(i-1);

        }
        System.out.println(num);
        System.out.println(numInvertido);
    }
}
