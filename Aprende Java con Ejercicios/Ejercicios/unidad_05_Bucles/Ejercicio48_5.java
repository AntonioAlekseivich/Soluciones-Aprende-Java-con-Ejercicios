package unidad_05_Bucles;

public class Ejercicio48_5 {
    /*
    Realiza un programa que diga los dígitos que aparecen y los que no aparecen
en un número entero introducido por teclado. El orden es el que se muestra en
los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números
largos.
     */
    public static void main(String[] args) {
        Methods.soutPedirInt();
        long num = Methods.pedirLong();
        String aparece = "", noAparece = "";


        for (int i = 0; i < 10; i++) {//recorremos los digitos
            if (Methods.longContieneDigito(num, i)) {
                aparece += i+ " ";
            } else {
                noAparece += i+" ";
            }
        }
        System.out.println("Dígitos que aparecen en el número:"+ aparece);
        System.out.println("Dígitos que no aparecen:"+ noAparece);
    }
}
