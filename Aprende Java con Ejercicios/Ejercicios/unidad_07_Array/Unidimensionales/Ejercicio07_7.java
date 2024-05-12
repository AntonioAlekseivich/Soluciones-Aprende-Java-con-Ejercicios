package unidad_07_Array.Unidimensionales;
import java.util.Scanner;
public class Ejercicio07_7 {

	public static void main(String[] args) {
		/*Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
		muestre por pantalla separados por espacios. El programa pedirá entonces por
		teclado dos valores y a continuación cambiará todas las ocurrencias del primer
		valor por el segundo en la lista generada anteriormente. Los números que se
		han cambiado deben aparecer entrecomillados.*/

		Scanner s = new Scanner(System.in);
	int numero;
	int [] numeros = new int[100];
	int primerNumero;
	int segundoNumero;
	
	for (int i = 0; i < 100; i++) {//loop que genera 100 numeros entre 0 y 20
		numero=(int) (Math.random()*21);
		numeros [i] = numero;
		System.out.print(" "+numero+" ");
	}
	System.out.println("\nEscribe un numero entero del 0 al 20.");//pedimos 2 nums
	primerNumero = s.nextInt();
	System.out.println("Escribe otro.");
	segundoNumero = s.nextInt();
	
	for (int i=0; i<100; i++) {//cambiamos todos los nums iguales al primerNum por el segundoNum e imprimimos
		if (primerNumero == numeros [i]) {
			numeros[i] = segundoNumero;
			System.out.print("\""+numeros[i]+"\"");
		}  else {
			System.out.print(" "+numeros[i]+" ");//si no son iguales, los imprimimos tal cual
		}//importante hacerlo en 1 loop, si se hace en 2 se entrecomillan tambn los valores iguales al segundoNum que no se cambian.
	}
	


	}
}
