package unidad_09_ProgramacionOrientadaAObjetos.Arrays.Ejercicio01_09;

import unidad_09_ProgramacionOrientadaAObjetos.Arrays.Ejercicio02_09.Gato;

import java.util.Random;
import java.util.Scanner;

public class main {
    //Chatgpt cambio el metodo
    public static void main(String[] args) {
        // Crear un array de cuatro gatos
        unidad_09_ProgramacionOrientadaAObjetos.Arrays.Ejercicio02_09.Gato[] gatos = new unidad_09_ProgramacionOrientadaAObjetos.Arrays.Ejercicio02_09.Gato[4];
        Random random = new Random();
        String[] colores = {"Rojo", "Verde", "Azul", "Amarillo", "Blanco", "Negro"};
        Scanner scanner = new Scanner(System.in);

        // Introducir los datos de cada gato mediante un bucle
        for (int i = 0; i < gatos.length; i++) {
            System.out.println("Introduce el nombre del gato " + (i+1) + ":");
            String nombre = scanner.nextLine();
            System.out.println("Introduce la edad del gato " + (i+1) + ":");
            int edad = Integer.parseInt(scanner.nextLine());
            String color = colores[random.nextInt(colores.length)];
            gatos[i] = new Gato(nombre, edad, color);
        }

        // Iterar y imprimir cada objeto del array
        for (Gato gato : gatos) {
            System.out.println(gato);
        }
    }
}
