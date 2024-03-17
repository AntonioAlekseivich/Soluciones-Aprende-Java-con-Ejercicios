package unidad_05_Bucles;

public class Ejercicio68_5 {
    public static void main(String[] args) {
        /*
        Escribe un programa que pida un número por teclado y que luego lo “disloque”
de tal forma que a cada dígito se le suma 1 si es par y se le resta 1 si
es impar. Usa long en lugar de int donde sea necesario para admitir números
largos.
         */
    Methods.soutPedirInt();
    long num = Methods.pedirLong();
    long numDislocated = Methods.dislocarNumero(num);

        System.out.println("Dislocando el "+num+" sale el "+numDislocated);
    }


}
