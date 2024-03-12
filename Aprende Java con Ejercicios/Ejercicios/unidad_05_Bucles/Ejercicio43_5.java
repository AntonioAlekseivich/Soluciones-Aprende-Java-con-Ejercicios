package unidad_05_Bucles;

public class Ejercicio43_5 {
    public static void main(String[] args) {
       /*
        Escribe un programa que permita partir un número introducido por teclado en
        dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
        el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
                el número introducido tiene dos dígitos como mínimo y la posición en la que
        se parte el número está entre 2 y la longitud del número. No se permite en
        este ejercicio el uso de funciones de manejo de String (por ej. para extraer
        subcadenas dentro de una cadena).
        */

        Methods.soutPedirInt();
        int num = Methods.pedirInt();
        System.out.println("Introduzca la posición a partir de la cual quiere partir el número:");
        int posicion = Methods.pedirInt();
        String sNum = "" +num;
        String primerNum="";
        String segundoNum="";

        for (int i = 0; i < sNum.length(); i++) {
            if(i<posicion-1)
            primerNum += sNum.charAt(i);
            else
                segundoNum += sNum.charAt(i);
        }
        System.out.println("Los numeros partidos son el "+primerNum+" y el "+segundoNum);

        }


}
