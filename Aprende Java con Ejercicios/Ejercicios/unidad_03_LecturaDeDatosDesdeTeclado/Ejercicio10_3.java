package unidad_03_LecturaDeDatosDesdeTeclado;

import java.util.Scanner;

public class Ejercicio10_3 {

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
