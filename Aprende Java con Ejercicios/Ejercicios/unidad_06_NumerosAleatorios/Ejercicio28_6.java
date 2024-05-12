package unidad_06_NumerosAleatorios;

/*
Realiza un programa que sea capaz de recolocar los números de un array de
fuera hacia adentro. En primer lugar, el programa pedirá al usuario el tamaño
del array. A continuación generará un array con ese tamaño con números
enteros aleatorios entre 0 y 200 ambos incluidos. Seguidamente el programa
irá colocando desde fuera hacia adentro los números de tal forma que el
primero se coloca en la primera posición, el segundo en la última, el tercero
en la segunda, el cuarto en la penúltima, el quinto en la tercera, en sexto en la
antepenúltima, etc. Se debe mostrar por pantalla tanto el array original como
el array resultado.
 */
public class Ejercicio28_6 {
    public static void main(String[] args) {
        System.out.println("Introduzca el tamaño del array:");
        int tamanio = Methods.pedirInt();
        int original[] = new int[tamanio];
        int resultante[] = new int[tamanio];
        int posicionIzquierda = 0, posicionDerecha = tamanio-1;

        for (int i = 0; i < original.length; i++) {
            original[i] = Methods.numAleatorioEnRango(0, 200);
        }

        System.out.println("Array original: ");
        Methods.imprimirArrayInt(original);

        for (int i = 0; i < original.length; i++) {
            if (Methods.esPar(i)) {
                resultante[posicionDerecha] = original[i];
                posicionDerecha--;
            } else {
                resultante[posicionIzquierda] = original[i];
                posicionIzquierda++;
            }
        }
        System.out.println("Array resultante: ");
        Methods.imprimirArrayInt(resultante);
    }
}
