package unidad_03_LecturaDeDatosDesdeTeclado;

import java.util.Scanner;

public class Ejercicio03_3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double euro;
		int peseta;
		
System.out.println("Introduzca la cantidad en pesetas:");

		peseta = s.nextInt();
		euro = (double) (peseta/166.386);
		

System.out.printf(peseta+" pesetas son %.2f euros.",euro);
	}

}
