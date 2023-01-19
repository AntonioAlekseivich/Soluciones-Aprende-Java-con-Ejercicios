package sentenciaCondiciona_If_Switch;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Amplía el programa anterior para que diga la nota
		// del boletín (insuficiente,
		// suficiente, bien, notable o sobresaliente).

		// copiamos el codigo del ejercicio anterior

		Scanner s = new Scanner(System.in);
		double nota1;
		double nota2;
		double nota3;

		double media;

		// while para comprobar que el input de la nota es un numero valido
		while (true) {

			// pedimos las notas
			System.out.println("¿Qué nota has sacado en el primer examen?");
			nota1 = s.nextInt();

			// comprobamos que la nota introducida sea valida
			if (nota1 >= 0 && nota1 <= 10) {
				break;
			} else {
				System.out.println("Nota no valida, debe ser entre 0 y 10");
				continue;
			}
		}

		// segundo while
		while (true) {

			// pedimos la segunda nota
			System.out.println("¿En el segundo?");
			nota2 = s.nextInt();

			if (nota2 >= 0 && nota2 <= 10) {
				break;
			} else {
				System.out.println("Nota no valida, debe ser entre 0 y 10");
				continue;
			}
		}

		// tercer while
		while (true) {
			System.out.println("¿Y en el tercero?");
			nota3 = s.nextInt();

			// pedimos la tercera nota
			if (nota3 >= 0 && nota3 <= 10) {
				break;
			} else {
				System.out.println("Nota no valida, debe ser entre 0 y 10");
				continue;
			}
		}

		// calculamos la media
		media = (nota1 + nota2 + nota3) / 3;
		System.out.printf("La media de las 3 notas es de %.2f.\n", media);

		//if else if para decir la nota del boletin en funcion 
		//de la nota medias
		if(media<5){
			System.out.println("Has suspendido...");
		}else if(media>=5 && media<6) {
			System.out.println("Tienes un suficiente.");
		}else if(media>=6 && media<7) {
			System.out.println("Tienes un bien.");
		}else if(media>=7 && media<9) {
			System.out.println("Tienes un notable");
		}else if(media>=9 && media<10) {
			System.out.println("Tienes un notable alto.¡Casi llegas al sobresaliente!");
		}else{
			System.out.println("¡Has sacado un sobresaliente!!");
		}
	}

}
