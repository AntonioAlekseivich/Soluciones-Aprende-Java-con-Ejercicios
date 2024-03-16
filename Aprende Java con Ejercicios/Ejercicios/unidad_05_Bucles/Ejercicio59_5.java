package unidad_05_Bucles;

public class Ejercicio59_5 {
    /*
    Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe
introducir la altura. En esa altura va incluida la estrella y el tronco. Suponemos
que el usuario introduce una altura mayor o igual a 4.
     */

    public static void main(String[] args) {

        System.out.println("Por favor introduzca la altura del arbol: ");

        int altura = Methods.pedirInt();
// Imprime la estrella
        System.out.println(" ".repeat(altura - 1) + "*");
        System.out.println(" ".repeat(altura - 1) + "^");
        for (int i = 0; i < altura - 1; i++) {


            //imprime el cuerpo
            System.out.println(" ".repeat(altura - i - 1) + "^" + " ".repeat(2 * i) + "^");
        }

        // Imprimir la base del árbol
        System.out.println("^".repeat(altura * 2));

        // Imprimir el tronco del árbol
        System.out.println(" ".repeat(altura - 1) + "Y");
    }
}







