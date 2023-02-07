package unidad_08_Funciones;

public class Ejercicio15_08 {
	public static void main(String[] args) {
		//Muestra los números primos que hay entre 1 y 1000.
		for (int i = 1; i <= 1000; i++) {//loop del 1 al 1000
			if(Ejercicio01_al_14_08.esPrimo(i)) {
				System.out.println(i);
			}
		}

	}
}


