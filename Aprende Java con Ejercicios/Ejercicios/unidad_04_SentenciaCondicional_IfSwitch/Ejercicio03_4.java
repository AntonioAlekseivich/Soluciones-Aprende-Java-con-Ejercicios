package unidad_04_SentenciaCondicional_IfSwitch;
import java.util.Scanner;
public class Ejercicio03_4 {

	public static void main(String[] args) {
		// Escribe un programa en que dado un número del 1 a 7 
		//escriba el correspondiente nombre del día de la semana.
		
		//input: int num
		//output: dia de la semana
		
		//creamos el scanner
Scanner s = new Scanner(System.in);

		//creamos la int num
int num;

		//pedimos el numero
System.out.println("Introduzca un numero del 1 al 7");
num = s.nextInt();

		//creamos el switch
switch (num) {

	case 1:
System.out.println("El 1 correspone a lunes.");
			break;
	
	case 2:
		System.out.println("El 2 correspone a martes.");
			break;
			
	case 3:
		System.out.println("El 3 correspone a miércoles.");
			break;
	
	case 4:
		System.out.println("El 4 correspone a jueves.");
			break;
			
	case 5:
		System.out.println("El 5 correspone a viernes.");
			break;
			
	case 6:
		System.out.println("El 6 correspone a sabado");
			break;
			
	case 7:
		System.out.println("El 7 correspone a domingo");
			break;
			
	default:
	System.out.println("He dicho un NUMERO del 1 al 7");
	

		}
	}
}
