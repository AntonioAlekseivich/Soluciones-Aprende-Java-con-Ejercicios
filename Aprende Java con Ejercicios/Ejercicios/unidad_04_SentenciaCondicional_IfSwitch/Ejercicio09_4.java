package unidad_04_SentenciaCondicional_IfSwitch;
import java.util.Scanner;

public class Ejercicio09_4 {

	public static void main(String[] args) {
		// Realiza un programa que resuelva una ecuación de segundo grado 
		//(del tipo ax^2 + bx + c = 0).
		
		//razonamiento: 
		//ax^2+bx+c=0 -> x = (-b + √(b^2 - 4ac)) / 2a | x = (-b - √(b^2 - 4ac))

//declaramos las variables
		double a;
		double b;
		double c;
		double xSumando;
		double xRestando;
		Scanner s = new Scanner(System.in);
		
//pedimos los valores de las variables.
		
System.out.println("introduzca el valor de \"a\" en numeros.");
a = s.nextDouble();

System.out.println("introduzca el valor de \"b\" en numeros.");
b = s.nextDouble();

System.out.println("introduzca el valor de \"c\" en numeros.");
c = s.nextDouble();


xSumando = (-(b) + Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);

xRestando = (-(b) - Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);


System.out.println(xRestando);
System.out.println(xSumando);

	}

}
