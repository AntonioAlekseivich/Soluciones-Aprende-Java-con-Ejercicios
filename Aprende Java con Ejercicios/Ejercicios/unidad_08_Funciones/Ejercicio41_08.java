package unidad_08_Funciones;

import unidad_07_Array.Methods;

/*
Realiza un programa que pinte un triángulo relleno tal como se muestra en
los ejemplos. El usuario debe introducir la altura de la figura. Este ejercicio
ya se realizó en el tema de bucles, ahora se trata de usar una función para
que la implementación sea más sencilla. Por ejemplo, se puede crear una
función linea(char caracter, int repeticiones) que pinte una línea con el carácter
especificado.
 */
public class Ejercicio41_08 {
    public static void main(String[] args) {
        System.out.println("Introduzca la altura de la figura: ");
        int altura = Methods.pedirInt();
        trianguloRelleno('*',altura);
    }
    public static void trianguloRelleno(char caracter, int altura){

        for (int i = altura; i > 0; i--) {
            linea(caracter,i);
        }


    }
    public static void linea (char caracter, int repeticiones){
        for (int i = 0; i < repeticiones; i++) {
            System.out.print(caracter);
        }
        System.out.println();
    }
}
