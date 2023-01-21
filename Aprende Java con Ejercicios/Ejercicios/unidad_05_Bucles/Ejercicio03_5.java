package unidad_05_Bucles;

public class Ejercicio03_5 {

	public static void main(String[] args) {
		// Muestra los números 
		//múltiplos de 5 de 0 a 100 utilizando un bucle do-while.

//aqui tambien hay que declarar la variable antes del bucle
		
		int numero = -5;		

		do {
			numero += 5;
			System.out.println(numero);
		} while (numero < 100);

	}
}
