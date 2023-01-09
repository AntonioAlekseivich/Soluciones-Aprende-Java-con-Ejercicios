package c.lecturaDeDatosDesdeTeclado;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub)
Scanner s = new Scanner(System.in);
	System.out.println("Introduce el primer número.");

int primero = Integer.parseInt(s.nextLine());

	System.out.println("Introduce el segundo número.");
	
int segundo = Integer.parseInt(s.nextLine());

int resultado = primero*segundo;

	System.out.println("La multiplicación de esos números es igual a "+resultado+".");

	}
}
