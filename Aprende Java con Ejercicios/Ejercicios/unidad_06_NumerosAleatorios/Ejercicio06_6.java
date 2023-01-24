package unidad_06_NumerosAleatorios;
import java.util.Scanner;
public class Ejercicio06_6 {

	public static void main(String[] args) {
		/*Escribe un programa que piense un número al azar entre 0 y 100. 
		 * El usuario debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
		el programa dirá cuántas oportunidades quedan y si el número introducido es
		menor o mayor que el número secreto.*/
		
		//input: numero del usuario
		
		//output: nº intentos
				  //si es menor o mayor
//variables
		Scanner s = new Scanner(System.in);
		int numeroSecreto = (int)(Math.random()*101 ) ;//inicializamos el nº secreto
		int numeroIntroducido;
		int intentos = 50;
		
		
			System.out.println("Adivina un numero entre 1 y 100, te doy "+intentos+" intentos.");
			
		
		while ( intentos > 0 ) {//mientras nos quede intentos...
			numeroIntroducido =  s.nextInt();
			
			
			if (numeroIntroducido!=numeroSecreto) {//si fallaste
				
				intentos = intentos - 1 ;
				System.out.println("Nope, ese numero no es.");
				System.out.println("Te quedan "+intentos+" intentos.");//restamos un intento y decimos cuantos quedan
				
				
				if(numeroIntroducido > numeroSecreto) {//damos una pista
				System.out.println("Mi numero es menor");
				
				} else {
				System.out.println("Mi numero es mayor");
				}	
				
				
			} else {
				System.out.println("¡Acertaste!");//en caso de acierto
				break;//salimos del bucle
			}
		}
		
		
	}
}
