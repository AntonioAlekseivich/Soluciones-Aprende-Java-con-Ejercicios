package unidad_08_Funciones;

import unidad_07_Array.Methods;

/*
Realiza un programa que pinte un triángulo hueco tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para
pintar las líneas.
 */
public class Ejercicio44_08 {
    public static void main(String[] args) {
        System.out.println("Introduzca la altura de la figura: ");
        int altura = Methods.pedirInt();
        trianguloDerechaHueco('*',altura);
    }
    public static void trianguloDerechaHueco(char caracter, int altura) {
        for (int i = 0; i < altura; i++) {
            Figuras.linea(' ', i); // Print spaces before asterisks
            if(i==0)
                Figuras.linea('*', altura - i);
            else
            Figuras.lineaHueca('*', altura - i); // Print asterisks
            System.out.println(); // Move to the next line
        }
    }
}
