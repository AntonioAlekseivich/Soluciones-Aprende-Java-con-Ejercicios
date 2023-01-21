package unidad_05_Bucles;
import java.util.Scanner;
public class Apuntes {

	public static void main(String[] args) {
		
		/**
		 * Bucle do-while que termina cuando se introduce por teclado un
		 * número impar
		 * @author Luis José Sánchez
		 */
		
		/*Después de pedir
		un número, haz que el programa diga ¿Quiere continuar? (s/n). Si el usuario introduce
		una s o una S, el programa deberá continuar pidiendo números
		*/
		Scanner s = new Scanner(System.in);
		int numero;
		String check = "s";
		while (!check.equals("n")){
			System.out.print("Dime un número: ");
			numero = s.nextInt();
			s.nextLine();
			if (numero % 2 == 0) {// comprueba si el número introducido es par
				System.out.println("Qué bonito es el " + numero);
			} else {
				System.out.println("No me gustan los números impares, adiós.");
			}
			
			 while(true){
				 
			System.out.println("¿Quieres continuar?(s/n)");
			check = s.nextLine().toLowerCase();
			if (check.equals("s") || check.equals("n")) {
	            break;
			 }
	        System.out.println("Por favor introduce s o n");
			 }
		}
	}
}





