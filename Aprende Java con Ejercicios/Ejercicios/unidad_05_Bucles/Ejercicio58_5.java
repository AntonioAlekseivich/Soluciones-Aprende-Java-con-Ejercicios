package unidad_05_Bucles;

public class Ejercicio58_5 {
    /*
    Realiza un programa que calcule la media de los dígitos que contiene un número
entero introducido por teclado.
     */
    public static void main(String[] args) {
    Methods.soutPedirInt();
    int num = Methods.pedirInt();
    String sNum = ""+num;

    int contador=0, sumatorio=0;
    double media=0;
        for (int i = 0; i < sNum.length(); i++) {
            sumatorio+=Character.getNumericValue(sNum.charAt(i));
            contador++;
        }
        media=(double)sumatorio/contador;

        System.out.println("La media de sus numeros es: "+media);
    }
}
