package unidad_07_Array.Unidimensionales;

import unidad_07_Array.Methods;

/*
Escribe un programa que rellene un array de 15 elementos con números enteros
comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
array “cincuerizado”, según el siguiente criterio: si el número que hay en una
posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
siguiente múltiplo de 5 que exista a partir de él.
 */
public class Ejercicio21_7 {
    public static void main(String[] args) {
        int [] array = Methods.arrayConNumerosAleatorios(15,0,500);
        System.out.println("Array original:");
        Methods.imprimirArrayInt(array);

        for (int i = 0; i < array.length; i++) {
            if (!(array[i]%5==0)){
                for (int j = i; j < array.length; j++) {
                    if (array[j]%5==0){
                        array[i]=array[j];
                        break;
                    }
                }
            }
        }
        System.out.println("Array cincuerizado: ");
        Methods.imprimirArrayInt(array);
    }
}
