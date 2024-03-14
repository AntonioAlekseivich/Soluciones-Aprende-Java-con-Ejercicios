package unidad_05_Bucles;

public class Ejercicio54_4 {
    /*
    Realiza un programa que pinte un triángulo hueco tal como se muestra en los
    ejemplos. El usuario debe introducir la altura de la figura.
     */

    public static void main(String[] args) {
        System.out.println("Introduzca la altura de la figura:");
        int num = Methods.pedirInt();
        for (int i = num; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                if(j==0|j==i-1||i==num)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }


}
