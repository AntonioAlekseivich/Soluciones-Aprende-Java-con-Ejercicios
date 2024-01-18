package unidad_05_Bucles;
import java.util.Scanner;

public class Ejercicio11_5 {

	public static void main(String[] args) {
		// Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
		//los 5 primeros números enteros a partir de uno que se introduce por teclado.
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca un numero:");
int n = s.nextInt();

for (int i = 5; i>0;i--) {
	System.out.println("Numero: "+n+" Cuadrado:"+n*n+" Cubo: "+n*n*n);
	n++;
}

	}

}
