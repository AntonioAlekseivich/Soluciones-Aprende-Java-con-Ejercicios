package unidad_03_LecturaDeDatosDesdeTeclado;

import java.util.Scanner;

public class Ejercicio12_3 {

	public static void main(String[] args) {
		
		//Realiza un programa que calcule la nota que hace falta sacar en el segundo
		//examen de la asignatura Programación para obtener la media deseada. Hay
		//que tener en cuenta que la nota del primer examen cuenta el 40% y la del
		//segundo examen un 60%.
		
		// nota1 = scanner
		// valNota1 = nota1*0,40
		// notaTrimestre = scanner
		// result = para sacar +notaTrimestre+ en el trimestre necesitas
		// sacar +nota2+ en el segundo examen
		// nota 2 = valNota2*0,60
		
Scanner s = new Scanner(System.in);

double nota1;
double valNota1;

double nota2;

double notaTrimestre;


System.out.println("¿Cuánto has sacado en el primer examen?");
nota1 = s.nextDouble();

valNota1 =  nota1*0.40;

	
System.out.println("¿Qué nota quieres sacar en el trimestre?");
notaTrimestre = s.nextDouble();	

//notaTrimestre es igual a la suma del porcentaje de las 2 notas:
//notaTrimestre = valNota1 + valNota2 = nota1*0,4 + nota2*0,6


//Ya tenemos notaTrimestre y valNota1, queremos sacar nota2:

//Ecuacion ejemplo: 8 = 3 + x*0,6

//Despejamos la x:(8 - 3)/0,6 = x

//nota2 = (notaTrimestre - valNota1)/0,6

nota2 = (notaTrimestre - valNota1)/0.6;

System.out.printf("Para sacar %.2f en el trimeste tienes que sacar un %.2f en el segundo examen.",notaTrimestre,nota2);

	}
}
