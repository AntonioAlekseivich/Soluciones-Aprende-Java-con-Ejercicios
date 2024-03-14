package unidad_05_Bucles;

public class Ejercicio53_5 {
    /*
    Realiza un programa que pinte un triángulo relleno tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura.
     */
    public static void main(String[] args) {
        System.out.println("Introduzca la altura de la figura:");
        int num = Methods.pedirInt();
        for (int i = num; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
