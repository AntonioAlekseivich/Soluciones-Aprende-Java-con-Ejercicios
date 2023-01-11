package sentenciaCondiciona_If_Switch;
import java.util.Scanner;

public class Ejercicio1 {
//Scanner: Dia de la semana.
//Output: Asignatura a primera hora.
	
	public static void main(String[] args) {
		
		//declaramos las variables y el scanner
		Scanner s = new Scanner(System.in);
		String dia;
		String asignatura;
		
		//pedimos al usuario introducir el dia
System.out.println("Introduzca un día de lunes a viernes.");
dia = s.nextLine();

		//creamos el switch
	switch (dia) {
	case "Lunes":	case "lunes":
		System.out.println("A primera hora tienes Empresa e iniciativa empresarial.");
		break;
		
	case "Martes":	case "martes":
		System.out.println("A primera tienes Entornos de desarrollo.");
		break;
	
	case "miercoles":	case "Miercoles":	case "miércoles":	case "Miércoles":
		System.out.println("A primera tienes Lenguaje de marcas.");
	break;
	
	case "jueves":	case "Jueves":
		System.out.println("A primera tienes Lenguaje de marcas.");
	break;
	
	case "viernes":	case "Viernes":
		System.out.println("A primera tienes Empresa e iniciativa empresarial.");
	break; 
	
		
		//Cerramos el switch.
	default:
		System.out.println("Ese día no existe");
		break;
			
		}
	}
}
