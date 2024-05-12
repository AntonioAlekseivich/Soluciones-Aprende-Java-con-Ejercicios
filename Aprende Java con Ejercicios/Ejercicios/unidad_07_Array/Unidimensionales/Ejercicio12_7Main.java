package unidad_07_Array.Unidimensionales;

public class Ejercicio12_7Main {

	public static void main(String[] args) {
		/*Realiza un programa que pida 10 números por teclado y que los almacene en
		un array. A continuación se mostrará el contenido de ese array junto al índice
		(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
		“inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
		números están entre 0 y 9. El programa deberá colocar el número de la posición
		inicial en la posición final, rotando el resto de números para que no se pierda
		ninguno. Al final se debe mostrar el array resultante.
		Por ejemplo, para inicial = 3 y final = 7:*/

		 int[] array = Ejercicio12_7Methods.createArray(10);//create array
		 
		 Ejercicio12_7Methods.assignArray(array);//assigning the numbers to the array
		 
		 int[] positions = Ejercicio12_7Methods.positions();
		 System.out.println("Array inicial:");
		 Ejercicio12_7Methods.printArray(array);
		 array=Ejercicio12_7Methods.changeArray(array, positions);
		 System.out.println("\n");
		 Ejercicio12_7Methods.printArray(array);
	}

}
