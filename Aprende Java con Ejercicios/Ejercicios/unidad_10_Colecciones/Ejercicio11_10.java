package unidad_10_Colecciones;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
public class Ejercicio11_10 {



        public static void main(String[] args) {
            HashMap<String, String> diccionario = new HashMap<>();
            // Agregar palabras al diccionario
            diccionario.put("casa", "house");
            diccionario.put("perro", "dog");
            diccionario.put("gato", "cat");
            diccionario.put("libro", "book");
            diccionario.put("mesa", "table");
            diccionario.put("computadora", "computer");
            diccionario.put("coche", "car");
            diccionario.put("jugar", "play");
            diccionario.put("agua", "water");
            diccionario.put("sol", "sun");
            diccionario.put("luna", "moon");
            diccionario.put("amarillo", "yellow");
            diccionario.put("azul", "blue");
            diccionario.put("rojo", "red");
            diccionario.put("verde", "green");
            diccionario.put("manzana", "apple");
            diccionario.put("banana", "banana");
            diccionario.put("naranja", "orange");
            diccionario.put("amigo", "friend");
            diccionario.put("amor", "love");

            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            int respuestasCorrectas = 0;
            int respuestasIncorrectas = 0;

            System.out.println("Adivina la traducción al inglés de las siguientes palabras:");
            for (int i = 0; i < 5; i++) {
                // Escoger una palabra al azar
                String palabraEspañol = (String) diccionario.keySet().toArray()[random.nextInt(diccionario.size())];
                String traduccionCorrecta = diccionario.get(palabraEspañol);

                System.out.print("Traducción de \"" + palabraEspañol + "\": ");
                String respuestaUsuario = scanner.nextLine();

                if (respuestaUsuario.equalsIgnoreCase(traduccionCorrecta)) {
                    System.out.println("¡Correcto!");
                    respuestasCorrectas++;
                } else {
                    System.out.println("Incorrecto. La traducción correcta es \"" + traduccionCorrecta + "\".");
                    respuestasIncorrectas++;
                }
            }

            System.out.println("\nResumen:");
            System.out.println("Respuestas correctas: " + respuestasCorrectas);
            System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
        }
    }


