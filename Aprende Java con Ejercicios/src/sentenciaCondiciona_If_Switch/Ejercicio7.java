package sentenciaCondiciona_If_Switch;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		//Realiza un programa que calcule la media de tres notas.

		//declaramos las variables
Scanner s = new Scanner(System.in);
int nota1;
int nota2;
int nota3;

int media;

System.out.println("¿Qué nota has sacado en el primer examen?");
nota1 = s.nextInt();

System.out.println("¿En el segundo?");
nota2 = s.nextInt();

System.out.println("¿Y en el tercero?");
nota3 = s.nextInt();

media = (nota1+nota2+nota3)/3;
System.out.println("La media de las 3 notas es de "+media+".");
	}

}
