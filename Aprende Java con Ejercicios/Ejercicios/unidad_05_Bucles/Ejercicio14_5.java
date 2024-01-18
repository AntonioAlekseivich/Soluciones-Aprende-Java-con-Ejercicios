package unidad_05_Bucles;
import java.util.Scanner;

public class Ejercicio14_5 {

	public static void main(String[] args) {
		/*Escribe un programa que pida una base y un exponente (entero positivo) y que
calcule la potencia.*/
	Scanner s = new Scanner(System.in);
	System.out.println("Introduzca base");
	int base = s.nextInt();
	System.out.println("Introduzca exponente");
	int exponente = s.nextInt();
	
System.out.println(Math.pow(base, exponente));

}
}
