package unidad_08_Funciones;

import unidad_07_Array.Methods;

/*
Realiza un programa que pinte un valle tal como se muestra en los ejemplos. El
usuario debe introducir la altura de la figura. Podemos suponer que el usuario
introduce una altura mayor o igual a 3.
 */
public class Ejercicio45_08 {
    public static void main(String[] args) {
        System.out.println("Introduzca la altura de la figura: ");
        int altura = Methods.pedirInt();
        valle('*',altura);
    }

        public static void valle(char caracter, int altura) {
            for (int i = altura; i > 0; i--) {
                // Print the line for the first triangle (faces right)
                Figuras.linea(caracter, altura - i);

                Figuras.linea(' ', i-1);//empty spaces
                Figuras.linea(' ', i-1);

                // Print the line for the second triangle (faces left)
                Figuras.linea(caracter, altura - i);

                System.out.println(); // Move to the next line
            }
        }
    }



