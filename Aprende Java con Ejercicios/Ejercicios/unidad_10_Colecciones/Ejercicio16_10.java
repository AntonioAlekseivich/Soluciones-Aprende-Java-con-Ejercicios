package unidad_10_Colecciones;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Ejercicio16_10 {
    /*
    Realiza un programa que sepa decir la capital de un país (en caso de conocer
la respuesta) y que, además, sea capaz de aprender nuevas capitales. En
principio, el programa solo conoce las capitales de España, Portugal y Francia.
Estos datos deberán estar almacenados en un diccionario. Los datos sobre
capitales que vaya aprendiendo el programa se deben almacenar en el mismo
diccionario. El usuario sale del programa escribiendo la palabra “salir”.
     */

        public static void main(String[] args) {
            //Hecho por chatGpt
            Map<String, String> capitales = new HashMap<>();
            capitales.put("españa", "madrid");
            capitales.put("portugal", "lisboa");
            capitales.put("francia", "parís");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Bienvenido al programa de capitales.");
            System.out.println("Para salir del programa, escribe 'salir'.");

            while (true) {
                System.out.print("Escribe el nombre de un país: ");
                String pais = scanner.nextLine().toLowerCase();

                if (pais.equals("salir")) {
                    break;
                }

                if (capitales.containsKey(pais)) {
                    System.out.println("La capital de " + pais + " es " + capitales.get(pais) + ".");
                } else {
                    System.out.println("Lo siento, no conozco la capital de " + pais + ".");
                    System.out.print("Por favor, escribe la capital de " + pais + ": ");
                    String capital = scanner.nextLine();
                    capitales.put(pais, capital);
                    System.out.println("¡Gracias! He aprendido que la capital de " + pais + " es " + capital + ".");
                }
            }

            System.out.println("¡Hasta luego!");
        }
    }
