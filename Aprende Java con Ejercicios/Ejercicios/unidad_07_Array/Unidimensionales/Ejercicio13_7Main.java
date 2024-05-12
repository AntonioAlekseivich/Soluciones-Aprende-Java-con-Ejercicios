package unidad_07_Array.Unidimensionales;

public class Ejercicio13_7Main {

	public static void main(String[] args) {
		/*Escribe un programa que rellene un array de 100 elementos con números enteros
		aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
		el programa mostrará el array y preguntará si el usuario quiere destacar el
		máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
		el número destacado entre dobles asteriscos.*/
		
		boolean operacion; //maximo = true, minimo = false
		int index;
		int [] array = Ejercicio13_7Methods.randomIntsInRange(100,0,500);//creamos el array
		
		Ejercicio13_7Methods.printArray(array);//lo imprimimos
		
		System.out.println();//salto de linea
		
		System.out.println("Desea destacar el maximo o el minimo del array?");//preguntamos que operacion realizar
		
		operacion = Ejercicio13_7Methods.string2Opciones("maximo", "minimo");//boolean para indicar la operacion
		
		index =  Ejercicio13_7Methods.minOrMaxValueOfArray(array, operacion);//int con el indice seleccionado
		
		Ejercicio13_7Methods.printArrayWithHighlightedIndex(array, index);//imprimimos el array con el indice seleccionado
	}

}
