package unidad_08_Funciones;

public class Ejercicio1_al_14_08 {
	
	/*Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
	 * 
	 * @param x un número entero positivo
	 * @return <code>true</code> si el número es primo
	 * @return <code>false</code> en caso contrario
	 * 
	 * */
	
	public static boolean esCapicua(int x) {
		    String numberString = Integer.toString(x);
		    String reverseString = new StringBuilder(numberString).reverse().toString();
		    return numberString.equals(reverseString);
		}
	}

