package unidad_05_Bucles;

public class Ejercicio31_5 {
    public static void main(String[] args) {

        int altura=Methods.pedirInt();
        for (int i = 0; i < altura; i++) {
            System.out.println("*");
        }
        for (int i = 0; i <= (altura/2); i++) {
            System.out.print("* ");
        }
    }
}
