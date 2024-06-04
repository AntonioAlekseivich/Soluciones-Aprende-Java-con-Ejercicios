package unidad_11_Ficheros;
import java.io.*;
import java.nio.file.Paths;
import java.util.*;
public class Ejercicio04_10 {
    /*
    Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
contenidas en un fichero de texto. El nombre del fichero que contiene las
palabras se debe pasar como argumento en la línea de comandos. El nombre
del fichero resultado debe ser el mismo que el original añadiendo la coletilla
sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
línea.
     */

//Hecho por chatGpt

    public static final String NOMBRE_DIRECTORIO="./Ficheros de texto/";

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar al usuario el nombre del archivo de entrada
            System.out.print("Ingrese el nombre del archivo de entrada: ");
            String nombreArchivo = scanner.nextLine();

            // Generar el nombre del archivo de salida añadiendo "_sort" al nombre del archivo original
            String nombreArchivoSalida = nombreArchivo.replace(".dat", "_sort.dat");


            // Leer las palabras del archivo y almacenarlas en un ArrayList
            List<String> palabras = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(Paths.get(NOMBRE_DIRECTORIO+nombreArchivo).toString()))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    palabras.add(linea);
                }
            } catch (IOException e) {
                System.err.println("Error al leer el archivo.");
                e.printStackTrace();
                return;
            }

            // Ordenar las palabras alfabéticamente
            Collections.sort(palabras);

            // Escribir las palabras ordenadas en el nuevo archivo
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(Paths.get(NOMBRE_DIRECTORIO+nombreArchivoSalida).toString()))) {
                for (String palabra : palabras) {
                    writer.write(palabra);
                    writer.newLine();
                }
                System.out.println("Palabras ordenadas y guardadas en el archivo '" + nombreArchivoSalida + "'.");
            } catch (IOException e) {
                System.err.println("Error al escribir en el archivo de salida.");
                e.printStackTrace();
            }
        }
    }


