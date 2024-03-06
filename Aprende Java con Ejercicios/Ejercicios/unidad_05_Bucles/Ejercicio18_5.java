package unidad_05_Bucles;
import java.util.Scanner;

public class Ejercicio18_5 {

	public static void main(String[] args) {
		/*Escribe un programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en
7.
		 */
		Scanner s = new Scanner (System.in);
		int num1,num2;
		boolean valido = false;

		do {
			System.out.println("Introduzca un numero");
			num1=s.nextInt();

			System.out.println("Introduzca otro numero");
			num2=s.nextInt();

			if(num1==num2) {
				System.out.println("Valor no valido");

			}else {
				valido=true;
			}

		}while(!valido);

		if(num1<num2) {
		for(int i = num1; i<num2;i+=7){
			System.out.println(i);
			}
		} else {
			for(int i = num2; i<num1;i+=7){
				System.out.println(i);
				}
		}
		
				}
}


