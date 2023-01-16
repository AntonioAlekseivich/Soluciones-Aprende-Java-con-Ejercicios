package sentenciaCondiciona_If_Switch;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Realiza un programa que resuelva una ecuación 
		//de primer grado (del tipo ax+b =0).

		
		//input: valor de a y valor de b
		//output: valor de x

		//razonamiento: ax+b=0 -> x=-b/a
//declaramos las variables
int a;
int b;
int x;
Scanner s = new Scanner(System.in);

System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0.");
//pedimos al usuario introducir los valores
System.out.println("Introduzca el valor de a:");
a = s.nextInt();

System.out.println("Introduzca el valor de b:");
b = s.nextInt();

//realizamos la operacion
x = -(b)/a;

//damos el resultado
System.out.println("x es igual a "+x+".");
	}

}
