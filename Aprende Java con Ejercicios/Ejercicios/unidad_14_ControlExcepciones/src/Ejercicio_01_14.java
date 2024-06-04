
import java.util.Scanner;
import java.util.InputMismatchException;


public class Ejercicio_01_14 {

	public class MaximoNumero {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] numeros = new int[6];
	        int maximo = Integer.MIN_VALUE;
	        
	        for (int i = 0; i < 6; i++) {
	            boolean numeroValido = false;
	            while (!numeroValido) {
	                try {
	                    System.out.print("Introduce el número " + (i + 1) + ": ");
	                    numeros[i] = scanner.nextInt();
	                    numeroValido = true;
	                } catch (InputMismatchException e) {
	                    System.out.println("Error: Por favor, introduce un número entero válido.");
	                    scanner.next(); // Limpiar el buffer del scanner
	                }
	            }
	            if (numeros[i] > maximo) {
	                maximo = numeros[i];
	            }
	        }

	        System.out.println("El número máximo introducido es: " + maximo);
	        scanner.close();
	    }
	}

}
