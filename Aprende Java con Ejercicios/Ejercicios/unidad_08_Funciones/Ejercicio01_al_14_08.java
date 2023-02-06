package unidad_08_Funciones;

import java.util.Arrays;

public class Ejercicio01_al_14_08 {
	
	/*Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
	 * 
	 * @param x un número entero positivo
	 * @return <code>true</code> si el número es primo
	 * @return <code>false</code> en caso contrario
	 * 
	 * */
	
	public static boolean esCapicua(int x) {
	
		int nDigitos = 0;
		int u = x;//calculamos cuantos digitos tiene x
		while(u>0) {
			u = u/10;
			nDigitos++;
		}

		int [] digitos = new int [nDigitos];//declaramos los 2 arrays que vamos a usar
		int [] digitosInv = new int [nDigitos];
		
		for (int i=0; i < nDigitos; i++) {//atribuimos los digitos de x al array digitos
			digitos [i] = x%10;
			x = x/10;
		}
		
		int k = 0;
		for (int i = (nDigitos - 1); i>=0; i--) {//creamos el array invertido
		digitosInv[k] = digitos[i];
		k++;
		}
		
		if (Arrays.equals(digitos, digitosInv)) {//comparamos los arrays
			return true;
		} else {
			return false;
		}
	}
	
	/*: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
	 * 
	 * @param x un número entero positivo
	 * @return <code>true</code> si el número es primo
	 * @return <code>false</code> en caso contrario
	 * 
	 * */
	
	public static boolean esPrimo(int x) {

		for (int i=1; i<=x; i++) {//recorremos todos los num posibles
			if(x%i==0 && i != 1 && i != x) {//Si al div entre ese numero el resto es 0, no es 1, y no es el mismo numero
				return true;//devolvemos true
			}
		}
		return false;//si no se entro en el if, es false
	}
}

