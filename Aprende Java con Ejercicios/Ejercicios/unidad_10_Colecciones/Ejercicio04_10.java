package unidad_10_Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio04_10 {
   /* Realiza un programa equivalente al anterior pero en esta ocasión, el programa
    debe ordenar palabras en lugar de números.*/
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       ArrayList<String> palabras = new ArrayList<>();

       // Pedir al usuario que ingrese 10 palabras
       System.out.println("Introduce 10 palabras:");

       for (int i = 0; i < 10; i++) {
           System.out.print("Palabra " + (i + 1) + ": ");
           String palabra = scanner.nextLine();
           palabras.add(palabra);
       }

       // Ordenar las palabras en orden alfabético
       Collections.sort(palabras);

       // Mostrar las palabras ordenadas
       System.out.println("\nPalabras ordenadas:");
       for (String palabra : palabras) {
           System.out.println(palabra);
       }
   }

}
