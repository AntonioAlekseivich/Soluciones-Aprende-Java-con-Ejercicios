package unidad_07_Array;

import java.util.Scanner;

public class Ejercicio14_7Methods {
	/**Imprime un array de Strings
	 * @param  array a imprimir
	 */
	public static void printStringArray(String [] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	/**Asks the user to input the content of an array of Strings with a set size.
	 * @param int size number of elements in the array.
	 * @return array with the set strings.
	 * 
	 */
	public static String  [] arrayStringUserInput(int size) {
		Scanner s = new Scanner(System.in);
		 String [] array = new String [size];
		 
		 for (int i = 0; i<array.length;i++) {
			 System.out.println("Introduce a String in the position "+ i);
			 array [i]= s.nextLine();
		 }
	return array;
	}
}
