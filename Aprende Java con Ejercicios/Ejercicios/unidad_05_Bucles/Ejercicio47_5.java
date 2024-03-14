package unidad_05_Bucles;

public class Ejercicio47_5 {
    /*
    Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han
    encargado realizar un programa que pinte un 8 por pantalla usando la letra
    M. Se pide al usuario la altura, que debe ser un número entero impar mayor
    o igual que 5. Si el número introducido no es correcto, el programa deberá
    mostrar un mensaje de error. A continuación se muestran algunos ejemplos.
    La anchura de la figura siempre será de 6 caracteres.
    */

    public static void main (String[] args) {
        System.out.println("Por favor, introduzca la altura (número impar mayor o igual a 5):");
        int altura=Methods.pedirNumImparMayorOIgualAUnNumero(5);
        final int ANCHURA=6;
        final char LETRA='M';
        for (int i = 0; i < altura; i++) {
            if(i==0||i==altura/2||i==altura-1){//Lineas horizontales
                for (int j = 0; j < ANCHURA; j++) {
                    System.out.print(LETRA);
                }
                System.out.println();//salto de linea
            } else {
                for (int j = 0; j < ANCHURA; j++) {//Partes huecas
                    if(j==0|j==ANCHURA-1){
                        System.out.print(LETRA);
                    } else{
                        System.out.print(" ");
                    }
                }
                System.out.println();//salto de linea
            }
        }

    }
}
