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
		int numeroSecreto = (int)(Math.random()*100 )+ 1 ;
		int numeroIntroducido;
		int intentos = 5;
		
		Scanner s = new Scanner(System.in);
		
			System.out.println("Adivina un numero entre 1 y 100, te doy 5 intentos.");
		
		
		while ( intentos > 0 ) {
			numeroIntroducido = s.nextInt();
			if (numeroIntroducido!=numeroSecreto) {
	intentos = intentos - 1 ;
	
	System.out.println("Nope, ese numero no es.");
	
			if(numeroIntroducido > numeroSecreto) {
				System.out.println("Mi numero es menor");
			} else {
				System.out.println("Mi numero es mayor");
			
	System.out.println("Te quedan "+intentos+" intentos.");
	
			}	
			
			} 
		}
		
		if (numeroIntroducido == numeroSecreto) {
			System.out.println("¡Acertaste!");
		}
	}
}
