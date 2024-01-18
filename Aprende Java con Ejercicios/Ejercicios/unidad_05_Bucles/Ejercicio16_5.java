package unidad_05_Bucles;
import java.util.Scanner;

public class Ejercicio16_5 {

	public static void main(String[] args) {
		/*Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.*/
		Scanner s = new Scanner (System.in);
		System.out.println("Introduzca un num");
		int num = s.nextInt();
		boolean primo=true;
		for(int i= 2; i< num; i++) {
			if(num%i==0) {
				primo=false;
			}
		}
		if(primo) {
			System.out.println("Es primo");
		} else {
			System.out.println("No primo");
		}
		

	}

}
