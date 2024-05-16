package unidad_10_Colecciones;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Ejercicio20_10 {
    /*
Amplía el programa anterior de tal forma que sea capaz de aprender palabras y
sinónimos. Cuando una palabra no tiene sinónimos, es decir, cuando aparece la
palabra en español con su traducción y esa traducción no la tiene ninguna otra
palabra española, se le preguntará al usuario si quiere añadir uno (un sinónimo)
y, en caso afirmativo, se pedirá la palabra y se añadirá al diccionario. Se puede
dar la circunstancia de que el usuario introduzca una palabra en español que
no está en el diccionario; en tal caso, se mostrará el consiguiente mensaje y
se dará la posibilidad al usuario de añadir la entrada correspondiente en el
diccionario pidiendo, claro está, la palabra en inglés.
     */
//Hecho por chatGpt
        private static Map<String, Set<String>> diccionario = new HashMap<>();

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
                        if (quiereAgregarSinonimo(scanner)) {
                            agregarSinonimo(palabra, scanner);
                        }
                    }
                } else {
                    System.out.println("No conozco esa palabra.");
                    if (quiereAgregarPalabra(scanner)) {
                        agregarPalabra(palabra, scanner);
                    }
                }
            }

            System.out.println("¡Hasta luego!");
        }

        private static boolean quiereAgregarSinonimo(Scanner scanner) {
            System.out.print("¿Quieres añadir un sinónimo para esta palabra? (s/n): ");
            String respuesta = scanner.nextLine().toLowerCase();
            return respuesta.equals("s");
        }

        private static void agregarSinonimo(String palabra, Scanner scanner) {
            System.out.print("Introduce un sinónimo para '" + palabra + "': ");
            String sinonimo = scanner.nextLine().toLowerCase();
            Set<String> sinonimos = new HashSet<>();
            sinonimos.add(sinonimo);
            diccionario.put(palabra, sinonimos);
            System.out.println("Sinónimo añadido correctamente.");
        }

        private static boolean quiereAgregarPalabra(Scanner scanner) {
            System.out.print("¿Quieres añadir esta palabra al diccionario? (s/n): ");
            String respuesta = scanner.nextLine().toLowerCase();
            return respuesta.equals("s");
        }

        private static void agregarPalabra(String palabra, Scanner scanner) {
            System.out.print("Introduce la traducción en inglés de '" + palabra + "': ");
            String traduccion = scanner.nextLine().toLowerCase();
            Set<String> sinonimos = new HashSet<>();
            sinonimos.add(traduccion);
            diccionario.put(palabra, sinonimos);
            System.out.println("Palabra añadida correctamente al diccionario.");
        }
    }


