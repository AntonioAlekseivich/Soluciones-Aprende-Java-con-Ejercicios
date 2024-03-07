package unidad_05_Bucles;
import java.util.Scanner;

public class Ejercicio20_5 {
    public static void main (String[] args){
        //Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
        Scanner scanner = new Scanner(System.in);

        // Pedir la altura de la pirámide
        System.out.print("Introduce la altura de la piramide: ");
        int altura = scanner.nextInt();

        // Pedir el carácter con el que se va a pintar la pirámide
        System.out.print("Introduce el caracter de la piramide: ");
        char caracter = scanner.next().charAt(0);

        int contadorCaracter=1;
        int anchura=altura*2;
//Pintamos la piramide
        for (int i = 0; i < altura; i++) {//recorremos la altura

            for (int j = 0; j < anchura/2; j++) {//recorremos la primera mitad
                System.out.print(" ");
            }

            for (int j = 0; j < contadorCaracter; j++) {//pintamos caracter
                if(j==0||j==contadorCaracter-1)
                    System.out.print(caracter);
                else
                    System.out.print(" ");
            }
            contadorCaracter+= 2;//agregamos un caracter

            System.out.println();//Salto de linea
            anchura-=2;//restamos a la anchura
        }
        anchura=altura*2+1;//reestablecemos la anchura
        for (int i = 0; i < anchura; i++) {//Imprimimos la parte de abajo
            System.out.print(caracter);
        }
    }



}
