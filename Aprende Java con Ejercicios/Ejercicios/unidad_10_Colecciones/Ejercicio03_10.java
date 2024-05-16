package unidad_10_Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio03_10 {
   /* Escribe un programa que ordene 10 números enteros introducidos por teclado
    y almacenados en un objeto de la clase ArrayList.*/

    public static void main(String[] args) {
        //Hecho por chatGpt
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        // Pedir al usuario que ingrese 10 números enteros
        System.out.println("Introduce 10 números enteros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        // Ordenar los números en orden ascendente
        Collections.sort(numeros);

        // Mostrar los números ordenados
        System.out.println("\nNúmeros ordenados:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }}

