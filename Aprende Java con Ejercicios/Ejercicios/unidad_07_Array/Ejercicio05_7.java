package unidad_07_Array;

import java.util.Scanner;

public class Ejercicio05_7 {

	public static void main(String[] args) {
		/*Escribe un programa que pida 10 números por teclado y que luego muestre los
		números introducidos junto con las palabras “máximo” y “mínimo” al lado del
		máximo y del mínimo respectivamente.*/

		
		Scanner s = new Scanner(System.in);
		
		int [] numeros = new int [10];//creamos el array
		int atribucionArray = 0;//el numero que indica a que casilla del array atribuir el valor
		
		int minimo = 2147483647;
		int maximo = 0;
		
for (int i = 1; i<11; i++) {//loop del 1 al 10
	
	System.out.println("Introduzca el numero nº "+i);
	
	numeros[atribucionArray] = s.nextInt();//atribuimos el valor al array
	
	if (numeros[atribucionArray] >= maximo) {//comprobamos los maximos y minimos
		maximo = numeros[atribucionArray];
	} 
	if (numeros[atribucionArray] <= minimo) {
		minimo = numeros[atribucionArray];
	}
	atribucionArray++;
}

for (int i = 0; i < 10; i++) {//imprimimos el array contando desde 9 hacia atras.
	System.out.println(numeros[i]);
	
		}
System.out.println("minimo: "+minimo+" maximo: "+maximo);
	}
}
