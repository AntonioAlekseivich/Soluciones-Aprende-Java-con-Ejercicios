package unidad_05_Bucles;

import java.util.Scanner;

public class Ejercicio17_5 {

	public static void main(String[] args) {
		/*Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).*/


		
		System.out.println("Introduzca un numero entero:");
		int num = inputAtLeast(0);
		int counter = num;
		for (int i = 0; i <100; i++) {
			counter++;
			num+=counter;
			System.out.println(num);
		}
	}
	/**Valida que un valor sea como minimo un num introducido.
	 * valor limite incluido
	 * 
	 * @param: int min: valor inicial
	 * @return:int input: Valor por encima del param.
	 */
	public static int inputAtLeast(int min) {
		
		Scanner s = new Scanner(System.in);

		int input = 0;
		do {

			input = s.nextInt();
			if (input < min) {
				System.out.println("valor no valido");
			}
		} while ((input<min));
		return input;
	}
}
