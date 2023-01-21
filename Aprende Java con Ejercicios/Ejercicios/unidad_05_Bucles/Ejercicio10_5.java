package unidad_05_Bucles;
import java.util.Scanner;

public class Ejercicio10_5 {

	public static void main(String[] args) {
		/* Escribe un programa que calcule la media de un conjunto de números positivos
		introducidos por teclado. A priori, el programa no sabe cuántos números se
		introducirán. El usuario indicará que ha terminado de introducir los datos
		cuando meta un número negativo.*/
		
//input: numeroNuevo
//output: media

Scanner s = new Scanner(System.in);

int numBase = 0;
int numNuevo = 0;
int media;
int counter = 0;

System.out.println("Introduce numeros enteros, cuando introduzcas un numero negativo te dire la media de los numeros introducidos hasta ese momento.");


		 while (numNuevo>=0){//comprobamos que el numero introducido sea positivo
			System.out.println("Numero:");
			numNuevo = s.nextInt();
		numBase = numBase + numNuevo;//sumamos el numero
		counter ++;//añadimos 1 al contador
	}//el bucle se repite hasta un numero negativo
		 
		media = numBase / counter;//calculamos la media
		System.out.println("La media de los numeros introducidos es de "+media);
	}

}
