package unidad_10_Colecciones;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio02_10 {
    /*Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
    ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
    números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
    y 20 elementos ambos inclusive.*/
    public static void main(String[] args) {
        //Hecho por chatGpt
        // Crear un ArrayList para almacenar los valores aleatorios
        ArrayList<Integer> numeros = new ArrayList<>();

        // Generar un tamaño aleatorio entre 10 y 20
        Random rand = new Random();
        int tamaño = rand.nextInt(11) + 10;

        // Introducir valores aleatorios en el ArrayList
        for (int i = 0; i < tamaño; i++) {
            int valor = rand.nextInt(101); // Generar valor aleatorio entre 0 y 100
            numeros.add(valor);
        }

        // Calcular la suma, la media, el máximo y el mínimo
        int suma = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        for (int numero : numeros) {
            suma += numero;
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
        }
        double media = (double) suma / numeros.size();

        // Mostrar los resultados
        System.out.println("Valores aleatorios: " + numeros);
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }

}
