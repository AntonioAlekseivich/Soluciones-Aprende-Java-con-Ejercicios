package c.lecturaDeDatosDesdeTeclado;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Kb*0.001=Mb

Scanner s = new Scanner(System.in);		
		
double kb;
double mb;

System.out.println("Introduzca los Kb.");
kb = s.nextDouble();

mb = kb*0.001;

System.out.printf("Eso equivale a %f Mb.",mb);
	}

}
