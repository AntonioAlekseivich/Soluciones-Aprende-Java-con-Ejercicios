package unidad_05_Bucles;

public class Ejercicio06_5 {

	public static void main(String[] args) {
		// Muestra los números del 320 al 160, 
		//contando de 20 en 20 utilizando un bucle
		//do-while.
		int numero = 340;

		do{
			numero -= 20;
			System.out.println(numero);
		}while (numero>160);
	}
}
