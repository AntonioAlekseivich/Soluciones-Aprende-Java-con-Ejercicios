package sentenciaCondiciona_If_Switch;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
		//las horas extras. Escribe un programa que calcule el salario semanal de un
		//trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
		//trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
		//la hora.

		//input: horas trabajadas
		//hora ordinaria(primeras 40) se paga a 12
		//hora extra se paga a 16
		
//declaramos el scanner y las variables
Scanner s = new Scanner(System.in);

int horasTotal;

int horasExtra;
int horasOrdinarias;
int sueldo;

//preguntamos al usuario cuantas horas ha trabajado
System.out.println("¿Cuántas horas has trabajado esta semana? Introduzca el valor en números.");
horasTotal = s.nextInt();

//si solo tiene horas ordinarias, solo multiplicamos por 40

if (horasTotal<=40) {
	sueldo = horasTotal*12;
System.out.println("Su sueldo esta semana es de "+sueldo+"€.");

//si tiene horas extra, averiguamos cuanto son las extra
//calculamos a cuanto cobra ambas
//las sumamos

} else {
	horasExtra = horasTotal-40;
	horasOrdinarias = 40;
	sueldo = horasExtra*16+horasOrdinarias*12;
	System.out.println("Su sueldo esta semana es de "+sueldo+"€.");
		}
	}

}
