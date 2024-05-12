package unidad_08_Funciones;

import unidad_07_Array.Methods;

/*
Realiza un programa que rellene un array con 10 números aleatorios comprendidos
entre 2 y 100 (ambos incluidos) y que los muestre por pantalla. A
continuación, el programa indicará para cada uno de ellos si es un número
primo y/o un capicúa de la forma que muestra el ejemplo.
 */
public class Ejercicio51_08 {
    public static void main(String[] args) {
    int [] array = Methods.arrayConNumerosAleatorios(10,2,100);
        System.out.println("Array generado: ");
    Methods.imprimirArrayInt(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print("El "+array[i]+" ");
            if(Methods.esPrimo(array[i]))
                System.out.print("es primo y ");
            else
                System.out.print("no es primo y ");
            if(Methods.esCapicua(array[i]))
                System.out.print("es capcicua.");
            else
                System.out.print("no es capicua.");
            System.out.println();
        }
    }

}
