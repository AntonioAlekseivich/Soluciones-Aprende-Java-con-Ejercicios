package sentenciaCondiciona_If_Switch;
import java.util.Scanner;

public class Ejercicio1 {
//Scanner: Dia de la semana.
//Output: Asignatura a primera hora.
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String dia;
		String asignatura;
		
System.out.println("Introduzca un día de lunes a viernes.");
dia = s.nextLine();
	switch (dia) {
	case "Lunes":
		System.out.println("A primera hora tienes Empresa e iniciativa empresarial.");
		break;
	case "lunes":
		System.out.println("A primera hora tienes Empresa e iniciativa empresarial.");
		break;
	case "Martes":
	System.out.println("A primera tienes Entornos de desarrollo.");
		break;
	case "martes":
		System.out.println("A primera tienes Entornos de desarrollo.");
		break;
	case "martes":
		System.out.println("A primera tienes Entornos de desarrollo.");
	break;
	case "martes":
				System.out.println("A primera tienes Entornos de desarrollo.");
	break;
	case "martes":
		System.out.println("A primera tienes Entornos de desarrollo.");
	break;
	case "martes":
				System.out.println("A primera tienes Entornos de desarrollo.");
					break;
			case "martes":
				System.out.println("A primera tienes Entornos de desarrollo.");
					break;case "martes":
						System.out.println("A primera tienes Entornos de desarrollo.");
						break;
		
		
		//Cerramos el switch.
	default:
		System.out.println("Ese día no existe");
		break;
			
		}
	}
}
