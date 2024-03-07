package unidad_05_Bucles;

import javax.swing.*;

public class Ejercicio27_5 {
    /*
    Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado.
     */
    public static void main(String[] args) {
        int n = Methods.pedirInt();
        int counter=0,sumatorio=0;

        for (int i = 1 ; i < n; i++) {
            int multiplo=i*3;
            counter++;
            sumatorio+=multiplo;
            System.out.println("Contador: "+counter);
            System.out.println("Multiplo: "+ multiplo);
            System.out.println("Sumatorio: "+sumatorio);
        }
    }
}
