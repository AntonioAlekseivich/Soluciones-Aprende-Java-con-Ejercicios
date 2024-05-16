package unidad_09_ProgramacionOrientadaAObjetos.Arrays.Ejercicio02_09;

import java.util.Random;

public class main {
    //ChatGpt hizo medio metodo. Pero genero mal el constructor y no supo inicializar un color aleatorio sin asistencia

    //Ademas hubo que dirigirlo para crear el toString primero y despues solo iterar en foreach para imprimir los objetos
    public static void main(String[] args) {
        // Crear un array de cuatro gatos
        Gato[] gatos = new Gato[4];
        Random random = new Random();
        String[] colores = {"Rojo", "Verde", "Azul", "Amarillo", "Blanco", "Negro"};
        // Introducir los datos de cada gato mediante un bucle
        for (int i = 0; i < gatos.length; i++) {
            String color = colores[random.nextInt(colores.length)];
            gatos[i] = new Gato("Gato", random.nextInt(15), color);

        }

        // Iterar y imprimir cada objeto del array
        for (Gato gato : gatos) {
            System.out.println(gato);
        }
    }
}
