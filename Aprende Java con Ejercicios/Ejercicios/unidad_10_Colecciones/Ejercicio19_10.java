package unidad_10_Colecciones;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio19_10 {
    /*

Realiza un buscador de sinónimos. Utiliza el diccionario español-inglés que se
proporciona a continuación. El programa preguntará una palabra y dará una
lista de sinónimos (palabras que tienen el mismo significado). Por ejemplo, si
se introduce la palabra “caliente”, el programa dará como resultado: ardiente,
candente, abrasador. ¿Cómo sabe el programa cuáles son los sinónimos de
“caliente”? Muy fácil, en el diccionario debe existir la entrada (“caliente”,
“hot”), por tanto solo tendrá que buscar las palabras en español que también
signifiquen “hot”; esta información estará en las entradas (“ardiente”, “hot”) y
(“abrasador”, “hot”). Cuando una palabra existe en el diccionario pero no tiene
sinónimos, debe mostrar el mensaje “No conozco sinónimos de esa palabra”.
Si una palabra no está en el diccionario se mostrará el mensaje “No conozco
esa palabra”. El usuario sale del programa escribiendo la palabra “salir”.

     */

    //Hecho por chatGpt

        private static Map<String, Set<String>> diccionario = new HashMap<>();

        static {
            diccionario.put("caliente", Set.of("hot", "warm"));
            diccionario.put("frío", Set.of("cold", "chilly"));
            // Agrega más palabras y sinónimos al diccionario aquí
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bienvenido al buscador de sinónimos.");
            System.out.println("Para salir del programa, escribe 'salir'.");

            while (true) {
                System.out.print("Introduce una palabra en español: ");
                String palabra = scanner.nextLine().toLowerCase();

                if (palabra.equals("salir")) {
                    break;
                }

                if (diccionario.containsKey(palabra)) {
                    Set<String> sinonimos = diccionario.get(palabra);
                    if (!sinonimos.isEmpty()) {
                        System.out.println("Sinónimos de '" + palabra + "': " + sinonimos);
                    } else {
                        System.out.println("No conozco sinónimos de esa palabra.");
                    }
                } else {
                    System.out.println("No conozco esa palabra.");
                }
            }

            System.out.println("¡Hasta luego!");
        }


}
