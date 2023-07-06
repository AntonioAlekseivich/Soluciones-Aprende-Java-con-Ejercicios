package unidad_04_SentenciaCondicional_IfSwitch;
import java.util.Scanner;

/*Escribe un programa que pinte una pirámide rellena con un carácter introducido
por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
hacia la derecha.*/

public class Ejercicio15_4 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String caracter;
		int direccion;
		System.out.println("Introduzca un caracter:");
		caracter = s.next();
		System.out.println("Introduzca una direccion");
		direccion = s.nextInt();
	}
	public static String piramide(String caracter, int direccion) {
		/*@Param String caracter;
		 * 				 Int direccion;
		 * @Output String piramide;
		 */
		if( direccion == 1) {
			String piramide = "";
		}
	}
}
