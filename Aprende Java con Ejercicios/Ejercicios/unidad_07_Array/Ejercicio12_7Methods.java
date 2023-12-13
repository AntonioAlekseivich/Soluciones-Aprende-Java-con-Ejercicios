package unidad_07_Array;
import java.util.Scanner;
public class Ejercicio12_7Methods {
	
public static int[] createArray(int num) {
	/**
	 * Creates the array
	 */
	    int[] array = new int[num];
	    return array;
	}
	
public static int[] assignArray(int []array) {
	/**
	 * Asks for the content of the array.
	 * @param int []array: array to asign
	 * @return array assigned
	 * 
	 */
	
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < array.length;i++) {
			System.out.println("Introduzca un valor para la posicion "+i);
			array[i]=s.nextInt();
		}

		return array;
	}
	
public static int input(int a, int b) {
		/**Valida que un valor introducido por teclado este 
		 * comprendido en un tramo determinado.
		 * Valores limites incluidos.
		 * 
		 * @param: int a: valor inicial
		 * @param:int b: valor final
		 * @return:int input: Valor comprendido entre esos 2.
		 */
		Scanner s = new Scanner(System.in);

		int input = 0;
		do {

		input = s.nextInt();
		if (input < a || input > b) {
			System.out.println("valor no valido");

		}
		} while (input<a||input>b);

		return input;
	}

	public static int[] positions() {
		/**
		 * Asks for the positions on which the operation and validates the values
		 * @return An array with 2 values. [0] for the initial value and [1] for the final
		 */
		  int[] array = new int[2];
		 int num1=0,num2=0;
		  do {
			  System.out.println("Introduzca un valor inicial.");
		   num1=input(0,9);
		   System.out.println("Introduzca un valor final.");
		   num2=input(0,9);
		   if(num1>num2||num1==num2) {
			   System.out.println("El valor inicial debe ser inferior al valor final.");
		   }
		  } while(num1>num2||num1==num2);
		  array[0]=num1;
		  array[1]=num2;
		  return array;
	}

public static void printArray(int []array) {
	/**
	 * Prints the array
	 */
	for (int i = 0; i< array.length;i++) {//print array content
		System.out.print(array[i]+" | ");
	}
	System.out.println();
	for (int i = 0; i< array.length;i++) {//print array index
		System.out.print(i+" | ");
	}
}
public static int[] changeArray(int [] array,int [] positions) {
	/**
	 * flips the values of the arrays. 
	 * Starting from the initial value and finishing on the final.
	 * Leaving the values in between.
	 */
	int initialAux = array[positions[0]];//we save the values that get lost when fliping the array
	int lastAux = array[9];
	
	for (int i =array.length-1; i>positions[1] ; i--) {//assigning the values before the finish
		array [i]= array [i-1];
	}
	for (int i = positions[0]; i>0; i--) {//assigning the values starting from the initial and to the end
		array[i] = array[i-1];
	}
	array[0] = lastAux;//using the saved values to rearrange the lost values
	array[positions[1]]=initialAux;
	return array;
}

}
