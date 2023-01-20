package unidad_03_LecturaDeDatosDesdeTeclado;

import java.util.Scanner;

public class Ejercicio11_3 {

	public static void main(String[] args) {
		// de Mb a Kb
		Scanner s = new Scanner(System.in);		
		
		double kb;
		double mb;

		System.out.println("Introduzca los Mb.");
		mb = s.nextDouble();

		kb = mb/0.001;

		System.out.printf("Eso equivale a %f Kb.",kb);

	}

}
