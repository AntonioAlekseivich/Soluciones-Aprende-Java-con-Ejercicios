package unidad_06_NumerosAleatorios;
/*
Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor.

 */
public class Ejercicio13_5 {
    public static void main(String[] args) {
        int dado1=0;
        int dado2=0;
        do{
            dado1=Methods.numAleatorioEnRango(1,6);
            dado2=Methods.numAleatorioEnRango(1,6);
            System.out.println("Dado 1: "+dado1);
            System.out.println("Dado 2: "+dado2);
        } while (dado1!=dado2);
    }
}
