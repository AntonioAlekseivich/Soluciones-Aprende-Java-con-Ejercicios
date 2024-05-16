package unidad_11_Ficheros;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class Ejercicio02_11 {
/*
Realiza un programa que lea el fichero creado en el ejercicio anterior y que
muestre los números por pantalla.
 */
    //Hecho por chatGpt

    public static final String NOMBRE_DIRECTORIO="./Ficheros de texto/";
        public static void main(String[] args) {
            // Ruta del archivo que contiene los números primos
            String nombreArchivo = "primos.dat";
            String rutaCompleta = Paths.get(NOMBRE_DIRECTORIO+nombreArchivo).toString();
            try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
                String linea;
                System.out.println("Números primos en el archivo '" + nombreArchivo + "':");
                while ((linea = reader.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo.");
                e.printStackTrace();
            }
        }


}
