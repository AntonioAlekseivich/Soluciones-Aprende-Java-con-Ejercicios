package unidad_07_Array;
import java.util.Scanner;

public class Ejercicio03_7 {

	public static void main(String[] args) {
		/*Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa.*/
		
		Scanner s = new Scanner(System.in);
		
		int [] numeros = new int [10];//creamos el array
		int atribucionArray = 0;//el numero que indica a que casilla del array atribuir el valor
		
for (int i = 1; i<11; i++) {//loop del 1 al 10
	
	System.out.println("Introduzca el numero nº "+i);
	
	numeros[atribucionArray] = s.nextInt();//atribuimos el valor al array
	atribucionArray++;
}

for (int i = 9; i > -1; i--) {//imprimimos el array contando desde 9 hacia atras.
	System.out.println(numeros[i]);
}
	}

}
