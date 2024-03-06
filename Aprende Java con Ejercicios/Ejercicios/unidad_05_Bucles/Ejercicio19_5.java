package unidad_05_Bucles;
import java.util.Scanner;
public class Ejercicio19_5 {

	public static void main(String[] args) {
		/*Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.
		 */
		/*
		 * Scanner sInt = new Scanner(System.in);
		 *
		Scanner sString = new Scanner(System.in);
		
		
		System.out.println("Introduzca la altura");
		int altura=sInt.nextInt();
		
		System.out.println("Introduzca un caracter");
		String s = sString.next();
		char caracter=s.charAt(0);
		*/
		 Scanner scanner = new Scanner(System.in);

	        // Pedir la altura de la pirámide
	        System.out.print("Introduce la altura de la pirámide: ");
	        int altura = scanner.nextInt();

	        // Pedir el carácter con el que se va a pintar la pirámide
	        System.out.print("Introduce el carácter de la pirámide: ");
	        char caracter = scanner.next().charAt(0);

	        // Imprimir la pirámide
	        for (int i = 1; i <= altura; i++) {
	            // Espacios en blanco antes de los caracteres
	            for (int j = 1; j <= altura - i; j++) {
	                System.out.print(" ");
	            }

	            // Caracteres de la pirámide
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print(caracter);
	            }

	            // Salto de línea después de cada fila
	            System.out.println();
	        }

	        scanner.close();
	    }
		
	
		public static String piramideChunga(int altura, char caracter) {
			String piramide="";
			int counter=1;//contador para las iteraciones de la piramide
			
			for (int i = altura; i <0; i--) {//recorremos la altura
				
			}
			return piramide;
		}
	
}

