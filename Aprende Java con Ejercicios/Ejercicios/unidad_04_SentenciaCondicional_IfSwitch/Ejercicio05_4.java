package unidad_04_SentenciaCondicional_IfSwitch;
import java.util.Scanner;

public class Ejercicio05_4 {

	public static void main(String[] args) {
		// Realiza un programa que resuelva una ecuación 
		//de primer grado (del tipo ax+b =0).

		
		//input: valor de a y valor de b
		//output: valor de x

		//razonamiento: ax+b=0 -> x=-b/a
		
//declaramos las variables
double a;
double b;
double x;
Scanner s = new Scanner(System.in);

System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0.");
//pedimos al usuario introducir los valores
System.out.println("Introduzca el valor de a:");
a = s.nextDouble();

System.out.println("Introduzca el valor de b:");
b = s.nextDouble();

//realizamos la operacion

x = (-b)/a;

//damos el resultado
System.out.printf("x es igual a %.2f.\n",x);
	}

}
