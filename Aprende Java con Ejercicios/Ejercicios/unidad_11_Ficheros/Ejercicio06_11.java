package unidad_11_Ficheros;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio06_10 {
    /*
    Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
fichero. Tanto el nombre del fichero como la palabra se deben pasar como
argumentos en la línea de comandos.
     */
    //Hecho por chatGpt

    public static final String NOMBRE_DIRECTORIO="./Ficheros de texto/";

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar al usuario el nombre del archivo
            System.out.print("Ingrese el nombre del archivo: ");
            String nombreDelFichero = scanner.nextLine();

            // Solicitar al usuario la palabra a contar
            System.out.print("Ingrese la palabra a contar: ");
            String palabra = scanner.nextLine();

            int ocurrencias = 0;

            try (BufferedReader br = new BufferedReader(new FileReader(nombreDelFichero))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    ocurrencias += contarOcurrencias(linea, palabra);
                }
            } catch (IOException e) {
                System.err.println("Error al leer el archivo: " + e.getMessage());
            }

            System.out.println("La palabra '" + palabra + "' aparece " + ocurrencias + " veces en el fichero " + nombreDelFichero);
        }

        private static int contarOcurrencias(String linea, String palabra) {
            int index = 0;
            int count = 0;
            while ((index = linea.indexOf(palabra, index)) != -1) {
                count++;
                index += palabra.length();
            }
            return count;
        }
    }




