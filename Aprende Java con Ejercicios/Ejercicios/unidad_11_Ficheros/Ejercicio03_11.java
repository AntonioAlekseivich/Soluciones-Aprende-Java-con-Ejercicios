package unidad_11_Ficheros;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio03_11 {
/*
Escribe un programa que guarde en un fichero el contenido de otros dos
ficheros, de tal forma que en el fichero resultante aparezcan las líneas de los
primeros dos ficheros mezcladas, es decir, la primera línea será del primer
fichero, la segunda será del segundo fichero, la tercera será la siguiente del
primer fichero, etc.
Los nombres de los dos ficheros origen y el nombre del fichero destino se deben
pasar como argumentos en la línea de comandos.
Hay que tener en cuenta que los ficheros de donde se van cogiendo las líneas
pueden tener tamaños diferentes.
 */

    //Hecho por chatGpt
    //En el primer prompt, pasaba los nombres a traves de el metodo. Esto lo he modificado rapido con una prompt

    public static final String NOMBRE_DIRECTORIO="./Ficheros de texto/";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario los nombres de los archivos origen y destino
        System.out.print("Introduce el nombre del primer archivo: ");
        String nombreArchivo1 = scanner.nextLine();

        System.out.print("Introduce el nombre del segundo archivo: ");
        String nombreArchivo2 = scanner.nextLine();

        System.out.print("Introduce el nombre del archivo destino: ");
        String nombreArchivoDestino = scanner.nextLine();

        scanner.close();

        try (BufferedReader reader1 = new BufferedReader(new FileReader( Paths.get(NOMBRE_DIRECTORIO+nombreArchivo1).toString()));
             BufferedReader reader2 = new BufferedReader(new FileReader(Paths.get(NOMBRE_DIRECTORIO+nombreArchivo2).toString()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(Paths.get(NOMBRE_DIRECTORIO+nombreArchivoDestino).toString()))) {

            String linea1 = reader1.readLine();
            String linea2 = reader2.readLine();

            while (linea1 != null || linea2 != null) {
                if (linea1 != null) {
                    writer.write(linea1);
                    writer.newLine();
                    linea1 = reader1.readLine();
                }
                if (linea2 != null) {
                    writer.write(linea2);
                    writer.newLine();
                    linea2 = reader2.readLine();
                }
            }

            System.out.println("Se han mezclado los archivos correctamente.");
        } catch (IOException e) {
            System.err.println("Error al procesar los archivos.");
            e.printStackTrace();
        }
    }


}