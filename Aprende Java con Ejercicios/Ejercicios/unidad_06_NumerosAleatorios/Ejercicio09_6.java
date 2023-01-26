package unidad_06_NumerosAleatorios;

public class Ejercicio09_6 {

	public static void main(String[] args) {
		/* Realiza un programa que vaya generando números aleatorios pares entre 0
		y 100 y que no termine de generar números hasta que no saque el 24. El
		programa deberá decir al final cuántos números se han generado.*/
		
		int numero;
		int counter = 0;
		
		do {
			numero = (int)(Math.random()*99 + 1);
			if(numero % 2 == 0){
				System.out.println(numero);
				
				counter++;
			}
		}while(numero!=24);
			 
		
		
		System.out.println("He sacado "+counter+" numeros, y por ultimo el "+numero);
		
		

			}
		}
	

	
