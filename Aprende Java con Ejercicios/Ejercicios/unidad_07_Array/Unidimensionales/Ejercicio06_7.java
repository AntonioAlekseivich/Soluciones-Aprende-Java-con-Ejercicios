package unidad_07_Array.Unidimensionales;

import java.util.Scanner;

public class Ejercicio06_7 {

	public static void main(String[] args) {
		/*Escribe un programa que lea 15 números por teclado y que los almacene en un
		array. Rota los elementos de ese array, es decir, el elemento de la posición 0
		debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
		la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
		del array*/

		Scanner s = new Scanner(System.in);

		int [] numeros = new int [15];//creamos el array
		int atribucionArray = 0;//el numero que indica a que casilla del array atribuir el valor
		int casillaExtra;//una casilla extra para poder desplazar todos los numeros

		for (int i = 1; i<16; i++) {//loop del 1 al 15 para pedir los numeros
			System.out.println("Introduzca el numero nº "+i);

			numeros[atribucionArray] = s.nextInt();//atribuimos el valor al array

			atribucionArray++;
		}

		casillaExtra = numeros[14];//guardamos el valor del ultimo array

		System.out.println();//salto de linea

		atribucionArray=13;
		
		for (int i = 14; i>0; i--) {//loop del 0 al 14; rotamos los valores

			numeros[i] = numeros[i-1];//rotamos del 14 al 1


			}
		
		numeros[0] = casillaExtra;//atribuimos el valor del array 0

		System.out.println();//salto de linea

		for (int i = 0; i<15; i++) {//loop del 0 al 14; imprimimos el array
			System.out.println("Array "+i+"="+numeros[i]);
		}

	}
}


