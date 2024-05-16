package unidad_11_Ficheros;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class Ejercicio01_11 {
/*
Escribe un programa que guarde en un fichero con nombre primos.dat los
números primos que hay entre 1 y 500.
 */
    //Hecho por chatGpt

    //En este ejercicio y los siguientes pedia los parametros como argumentos en el metodo. Por medio de un
    //Un prompt lo he modificado para pedirlos por escaner
    //Ademas he especificado la ruta relativa en la que se encuentran los archivos
    public static final String NOMBRE_DIRECTORIO="./Ficheros de texto/";
        public static void main(String[] args) {
            // Ruta del archivo donde se guardarán los números primos
            String nombreArchivo = "primos.dat";

            String rutaCompleta = Paths.get(NOMBRE_DIRECTORIO+nombreArchivo).toString();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaCompleta))) {
                for (int num = 2; num <= 100; num++) {
                    if (esPrimo(num)) {
                        // Escribir el número primo en el archivo
                        writer.write(Integer.toString(num));
                        writer.newLine(); // Saltar a la siguiente línea
                    }
                }
                System.out.println("Se han guardado los números primos en el archivo '" + nombreArchivo + "'.");
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo.");
                e.printStackTrace();
            }
        }

        // Función para verificar si un número es primo
        private static boolean esPrimo(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }


}
