package unidad_10_Colecciones;
import java.util.HashMap;
import java.util.Scanner;
public class Ejercicio10_10 {
//Hecho por chatGpt


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

            // Pedir una palabra en español
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese una palabra en español: ");
            String palabraEspañol = scanner.nextLine().toLowerCase();

            // Buscar la traducción en el diccionario
            String traduccion = diccionario.get(palabraEspañol);
            if (traduccion != null) {
                System.out.println("La traducción al inglés es: " + traduccion);
            } else {
                System.out.println("La palabra no está en el diccionario.");

        }
    }

}
