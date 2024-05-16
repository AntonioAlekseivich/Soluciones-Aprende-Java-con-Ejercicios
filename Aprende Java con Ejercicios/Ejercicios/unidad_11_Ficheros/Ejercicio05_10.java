package unidad_11_Ficheros;
import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio05_10 {
/*
Escribe un programa capaz de quitar los comentarios de un programa de Java.
Se utilizaría de la siguiente manera:
quita_commentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO
Por ejemplo:
quita_comentarios hola.java holav2.java
crea un fichero con nombre holav2.java que contiene el código de hola.java pero
sin los comentarios.
 */

    //Hecho por chatGpt
    public static final String NOMBRE_DIRECTORIO="./Ficheros de texto/";
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar al usuario el nombre del archivo de entrada
            System.out.print("Ingrese el nombre del archivo de entrada: ");
            String nombreArchivoEntrada = scanner.nextLine();

            // Solicitar al usuario el nombre del archivo de salida
            System.out.print("Ingrese el nombre del archivo de salida: ");
            String nombreArchivoSalida = scanner.nextLine();

            try (BufferedReader reader = new BufferedReader(new FileReader(Paths.get(NOMBRE_DIRECTORIO+nombreArchivoEntrada).toString()));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(Paths.get(NOMBRE_DIRECTORIO+nombreArchivoSalida).toString()))) {

                String linea;
                boolean enComentario = false;

                while ((linea = reader.readLine()) != null) {
                    String resultado = quitarComentarios(linea, enComentario);

                    // Determina si el comentario de bloque ha terminado en esta línea
                    if (resultado.endsWith("*/")) {
                        enComentario = false;
                    } else if (resultado.startsWith("/*")) {
                        enComentario = true;
                    }

                    // Si no estamos en un bloque de comentario, escribe la línea resultante
                    if (!enComentario && !resultado.isEmpty()) {
                        writer.write(resultado);
                        writer.newLine();
                    }
                }

                System.out.println("Comentarios eliminados y guardados en el archivo '" + nombreArchivoSalida + "'.");
            } catch (IOException e) {
                System.err.println("Error al procesar el archivo.");
                e.printStackTrace();
            }
        }

        private static String quitarComentarios(String linea, boolean enComentario) {
            StringBuilder resultado = new StringBuilder();
            int longitud = linea.length();
            for (int i = 0; i < longitud; i++) {
                if (!enComentario) {
                    if (i < longitud - 1 && linea.charAt(i) == '/' && linea.charAt(i + 1) == '/') {
                        break; // Comentario de línea, ignorar el resto de la línea
                    } else if (i < longitud - 1 && linea.charAt(i) == '/' && linea.charAt(i + 1) == '*') {
                        enComentario = true; // Inicio de comentario de bloque
                        i++; // Saltar el asterisco adicional en el comentario de bloque
                    } else {
                        resultado.append(linea.charAt(i)); // Carácter válido, agregar al resultado
                    }
                } else {
                    if (i < longitud - 1 && linea.charAt(i) == '*' && linea.charAt(i + 1) == '/') {
                        enComentario = false; // Fin de comentario de bloque
                        i++; // Saltar el asterisco adicional en el comentario de bloque
                    }
                }
            }

            return resultado.toString();
        }
    }




