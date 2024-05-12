package unidad_07_Array.Unidimensionales;
import unidad_07_Array.Methods;

/*
Escribe un programa que rellene un array de 20 elementos con números enteros
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
programa mostrará el array y preguntará si el usuario quiere resaltar los
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
escribiendo los números que se quieren resaltar entre corchetes.
 */
public class Ejercicio16_7 {
    public static void main(String[] args) {
        int [] array = new int [20];
        for (int i = 0; i < array.length; i++) {
            array[i]=Methods.numAleatorioEnRango(0,400);
        }
        Methods.imprimirArrayInt(array);

        System.out.println("¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7):");

        int input = Methods.inputBetween2Num(1,2);
        if(input==1)
            Methods.resaltarMultiplosEnArray(5,array);
        else
            Methods.resaltarMultiplosEnArray(7,array);
    }

}


