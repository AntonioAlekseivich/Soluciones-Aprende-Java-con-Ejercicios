package unidad_08_Funciones;

import unidad_07_Array.Methods;

/*
Realiza un programa que pinte un triángulo relleno tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para
pintar las líneas.
 */
public class Ejercicio43_08 {
    public static void main(String[] args) {
        trianguloDerecha('*', 8);
    }

    public static void trianguloDerecha(char caracter, int altura) {
        for (int i = 0; i < altura; i++) {
            Figuras.linea(' ', i); // Print spaces before asterisks
            Figuras.linea('*', altura - i); // Print asterisks
            System.out.println(); // Move to the next line
        }
        }
    }

