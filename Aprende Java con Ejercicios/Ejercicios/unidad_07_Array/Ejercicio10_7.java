package unidad_07_Array;

public class Ejercicio10_7 {

	public static void main(String[] args) {
		/*Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario.*/

		int [] numeros = new int [20];
		int [] pares = new int [20];
		int [] impares= new int [20];

		int contadorPar = 0;
		int contadorImpar = 0;

System.out.println("Numeros aleatorios: \n");

		for (int i=0; i<20; i++) {
			numeros[i] = (int)(Math.random()*100);//creamos los num aleatorios

			if (numeros[i]%2==0) {
				pares[contadorPar] = numeros[i];//dividimos en pares e impares
				contadorPar++;//añadimos contadores para contar cuantos hay de cada tipo

			} else {
				impares[contadorImpar] = numeros[i];
				contadorImpar++;
			}
			System.out.println(numeros[i]);
		}

		for (int i=0; i<contadorPar; i++) {//atribuimos los pares al array usando el contador
			numeros[i] = pares[i];
		}

		int u = 0;
		for(int i=(20-contadorImpar);i<20;i++) {//atribuimos los impares usando el contador
			numeros[i] = impares[u];
			u++;
		}
		
System.out.println("\nNumeros pares: \n");//los imprimimos

		for (int i=0; i<20; i++) {
			System.out.println(pares[i]);
		}
		
System.out.println("\nNumeros impares: \n");
		
		for (int i=0; i<20; i++) {
			System.out.println(impares[i]);
		}
		
System.out.println("\nNumeros ordenados: \n");

		for (int i=0; i<20; i++) {
			System.out.println(numeros[i]);
		}

	}
}
