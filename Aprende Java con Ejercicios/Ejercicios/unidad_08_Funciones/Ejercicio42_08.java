package unidad_08_Funciones;

import unidad_07_Array.Methods;

/*
Realiza un programa que pinte un triángulo hueco tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para
pintar las líneas.
 */
public class Ejercicio42_08 {
    public static void main(String[] args) {
        System.out.println("Introduzca la altura de la figura: ");
        int altura = Methods.pedirInt();
        trianguloHueco('*',altura);
    }
    public static void trianguloHueco(char caracter, int altura){
        for (int i = altura; i > 0; i--) {
            if(i==0||i==altura)
                linea(caracter,i);
            else
                lineaHueca(caracter,i);
        }
    }
    public static void lineaHueca(char caracter, int repeticiones){
        for (int i = 0; i < repeticiones; i++) {
            if(i==0||i==repeticiones-1)
            System.out.print(caracter);
            else
                System.out.print(" ");
        }
        System.out.println();
    }
    public static void linea (char caracter, int repeticiones){
        for (int i = 0; i < repeticiones; i++) {
            System.out.print(caracter);
        }
        System.out.println();
    }
}
