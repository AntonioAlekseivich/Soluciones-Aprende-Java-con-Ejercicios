package unidad_07_Array.Unidimensionales;
import unidad_07_Array.Methods;


/*
Escribe un programa que muestre por pantalla un array de 10 números enteros
generados al azar entre 0 y 100. A continuación, el programa debe pedir un
número al usuario. Se debe comprobar que el número introducido por teclado
se encuentra dentro del array, en caso contrario se mostrará un mensaje por
pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
correctamente. A continuación, el programa rotará el array hacia la derecha
las veces que haga falta hasta que el número introducido quede situado en la
posición 0 del array. Por último, se mostrará el array rotado por pantalla.
 */
public class Ejercicio17_7 {
    public static void main(String[] args) {
        int [] array = new int [10];
        boolean numEnArray=false;
    int num=0;

        for (int i = 0; i < array.length; i++) {
            array[i] = Methods.numAleatorioEnRango(0, 100);
        }

        Methods.imprimirArrayInt(array);

        do {
            System.out.println("Introduzca un numero del 0 al 100.");
            num=Methods.inputBetween2Num(0,100);

            numEnArray=Methods.numEnArray(num,array);

            if(!numEnArray)
                System.out.println("Ese numero no se encuentra en el array.");
        } while(!numEnArray);

        do{
            Methods.rotarArrayHaciaLaDerecha(array);
        }while (array[0]!=num);

        Methods.imprimirArrayInt(array);
    }
}
