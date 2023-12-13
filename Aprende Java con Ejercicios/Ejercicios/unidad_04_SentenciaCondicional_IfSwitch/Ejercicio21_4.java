package unidad_04_SentenciaCondicional_IfSwitch;
import java.util.Scanner;
public class Ejercicio21_4 {

	public static void main(String[] args) {
		/* Calcula la nota de un trimestre de la asignatura Programación. El programa
		pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
		Si la media de los dos controles da un número mayor o igual a 5, el alumno
		está aprobado y se mostrará la media. En caso de que la media sea un número
		menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
		se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
		ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
		de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
		la nota media anterior.*/
		Scanner sInt = new Scanner(System.in);
		Scanner sString = new Scanner(System.in);
		int examen1, examen2;
		double media;
		String recuperacion;
		System.out.println("Introduzca la nota del primer examen.");
		examen1=sInt.nextInt();
		
		System.out.println("Introduzca la nota del segundo examen.");
		examen2=sInt.nextInt();

		media=((double)examen1+examen2)/2;
	
		if (media>=5) {
			System.out.println("Tu nota de Programacion es "+media);
		} else {
			System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto):");
			recuperacion = sString.nextLine();
			if (recuperacion.equals("apto")) {
				System.out.println("Tu nota de Programación es 5");
			} else if (recuperacion.equals("no apto")) {
				System.out.println("Tu nota de Programación es "+media);
			}
		
		}
	}

}
