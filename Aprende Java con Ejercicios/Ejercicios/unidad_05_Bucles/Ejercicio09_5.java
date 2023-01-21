package unidad_05_Bucles;
import java.util.Scanner;

public class Ejercicio09_5 {

	public static void main(String[] args) {
		/* Realiza un programa que nos diga cuántos dígitos tiene un número introducido
		por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
		la salvedad de que el anterior estaba limitado a números de 5 dígitos como
		máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
		esta manera, la única limitación en el número de dígitos la establece el tipo de
		dato que se utilice (int o long).*/

Scanner s = new Scanner(System.in);
int numero;
int counter = 0;
int division;

System.out.println("Introduzca un numero");
numero = s.nextInt();//pedimos el numero

division = numero;//la variable numero sera la devuelta en la respuesta, por eso no la cambiamos
				//creamos division para poder contar las cifras

while(division >= 1) {//dividimos entre 10 hasta que sea menor que 1
		division = division / 10;
		
		counter ++;//por cada iteracion sumamos 1
		}
	
	if (numero>=10){//si hay varias cifras la respuesta es plural
	System.out.println(numero+" tiene "+counter+" cifras.");
	} else {//si solo hay 1, singular
		System.out.println(numero+" tiene "+counter+" cifra.");
		}
	}
}
