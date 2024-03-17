package unidad_05_Bucles;

public class Ejercicio65_5 {
    /*Escribe un programa que pinte por pantalla la letra A. El usuario debe introducir
la altura total y la fila en la que debe aparecer el palito horizontal (contando
desde el vértice). La altura mínima es de 3 pisos. La fila donde va el palito
horizontal debe ser mayor que 1 y menor que la altura total. Si el usuario
introduce algún dato incorrecto, el programa debe mostrar un mensaje de error.
     */
    public static void main(String[] args) {
        System.out.println("Introduzca la altura de la A (un número mayor o igual a 3):");
        int altura = Methods.pedirNumMinimo(3);
        System.out.println("Introduzca la fila del palito horizontal (entre 2 y 6):");
        int palito = Methods.inputBetween2Num(2, 6);

        int izquierda = (altura / 2)*2;
        int derecha = (altura / 2)*2;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura*2; j++) {
                if (j == izquierda || j == derecha || (i==palito-1 && j>=izquierda && j<=derecha))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            izquierda--;
            derecha++;
            System.out.println();

        }

    }
}
