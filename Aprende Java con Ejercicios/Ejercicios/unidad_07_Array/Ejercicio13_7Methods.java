package unidad_07_Array;

import java.util.Scanner;

public class Ejercicio13_7Methods {

	/**Imprime un array de ints
	 * @param  array a imprimir
	 */
	public static void printArray(int [] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	/**Crea array con ints aleatorios dentro de un rango,
	 * @param  size int tamaño del array.
	 * @param  min int valor limite minimo.
	 * @param  max int valor limite maximo.
	 * @return array con ints aleatorios,
	 */
	public static int []  randomIntsInRange(int size, int min, int max) {
		int [] array = new int [size];

		for (int i = 0; i < array.length; i++) {
			array[i]= (int)(Math.random()*(max - min + 1)) + min;
		}
		return array;
	}

	/**devuelve al boolean dependiendo de la respuesta del usuario
	 * asegurandose que la respuesta sea entre 2 opciones pasadas al metodo
	 *@param:String isTrue, isFalse: opciones disponibles.
	 *@return: boolean statement:: opcion seleccionada.
	 */
	public static boolean string2Opciones(String isTrue, String isFalse) {
	
		Scanner sString = new Scanner(System.in);
		String input = "";
		boolean statement = false;
		do {
			input = sString.nextLine();

			if (input.equals(isTrue)) {
				statement=true;
			} else if (input.equals(isFalse)) {
				statement = false;
			} else {
				System.out.println("Valor no valido, vuelva a introducirlo.");
			}

		} while (!input.equals(isTrue)&&!input.equals(isFalse));

		return statement;
	}
	
	/**Returns the index of where the max or min value of an array is stored.
	 * @param array to check
	 * @param boolean operation decides what action to take. true for max and false for min.
	 * 
	 * @return int with the index
	 */
	public static int minOrMaxValueOfArray(int [] array, boolean operation) {
		int index = 0, value;//one stores the index and the other its content
		if (operation) {
			value=array[0];//initialize the value on the first element of the array
			for (int i = 0; i<array.length;i++) {
				if (value<array[i]) {//if the corrent value is bigger than the one stored, change it
					value = array[i];
					index = i;
				}
			}
		} else {
			value=array[0];
			for (int i = 0; i<array.length;i++) {
				if (value>array[i]) {
					value = array[i];
					index = i;
				}
			}
		}
		return index;
	}
	
	/**Imprime un array de ints con un indice subrayado
	 * @param  array a imprimir
	 * @param  int index a señalar
	 */
	public static void printArrayWithHighlightedIndex(int [] array, int index) {
		for (int i = 0; i < array.length; i++) {
			if (i == index) {
				System.out.print("**"+array[i]+"** ");
			} else {
			System.out.print(array[i]+" ");
			}
		}
	}

}

