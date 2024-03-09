package unidad_05_Bucles;

public class Ejercicio39_5 {
    public static void main(String[] args) {
       /* Escribe un programa que pida un número entero positivo por teclado y que
        muestre a continuación los números desde el 1 al número introducido junto
        con su factorial.
    */
        Methods.soutPedirInt();
        int num = Methods.pedirInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(i+"! = " +Methods.factorial(i));
        }
    }

}
