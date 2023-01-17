package sentenciaCondiciona_If_Switch;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Realiza un programa que calcule el tiempo 
		//que tardará en caer un objeto desde
		//una altura h. Aplica la fórmula t =√2h siendo g = 9.81m/(s) al cuadrado

		//input: h
		//output: t
		
//declaramos las variables
		
		double h;
		double t;
		double g = 9.81;
		Scanner s = new Scanner(System.in);

//pedimos la altura		
System.out.println("¿Desde cuantos metros cae el objeto?");
h = s.nextDouble();

//calculamos 

t = Math.sqrt((2*h)/g);

System.out.printf("Tarda en caer %.2f segundos.\n",t);
	
	}

}
