package unidad_05_Bucles;

public class Ejercicio57_5 {
    /*
    Realiza un programa que pinte un triángulo hueco tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura.
     */
    public static void main(String[] args) {
        System.out.println("Introduzca la altura de la figura: ");
        int altura= Methods.pedirInt();
        int espacio=0;
        for (int i = altura; i > 0; i--) {
            for (int j = 0; j < espacio; j++) {
                System.out.print(" ");
            }
            espacio++;
            for (int j = 0; j < i; j++) {
                if(j==0||j==i-1||i==altura)
                    System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
