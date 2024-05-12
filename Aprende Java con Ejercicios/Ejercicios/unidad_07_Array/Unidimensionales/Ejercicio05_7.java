package unidad_07_Array.Unidimensionales;

import java.util.Scanner;

public class Ejercicio05_7 {

	public static void main(String[] args) {
		/*Escribe un programa que pida 10 números por teclado y que luego muestre los
		números introducidos junto con las palabras “máximo” y “mínimo” al lado del
		máximo y del mínimo respectivamente.*/

		
		Scanner s = new Scanner(System.in);
		
		int [] numeros = new int [10];//creamos el array
	
		int minimo = 0;
		int maximo = 0;
		
for (int i = 0; i<10; i++) {//loop del 1 al 10
	
	System.out.println("Introduzca el numero nº "+i);
	
	numeros[i] = s.nextInt();//atribuimos el valor al array
	
	if (numeros[i] >= maximo) {//comprobamos los maximos y minimos
		maximo = numeros[i];
	} 
	if (numeros[i] <= minimo) {
		minimo = numeros[i];
	}

}

for (int i = 0; i < 10; i++) {//imprimimos el array contando desde 9 hacia atras.
	System.out.println(numeros[i]);
	
		}
System.out.println("minimo: "+minimo+" maximo: "+maximo);
	}
}
