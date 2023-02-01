package unidad_07_Array;
import java.util.Scanner;

public class Ejercicio11_7 {

	public static void main(String[] args) {
		/* Realiza un programa que pida 10 números por teclado y que los almacene en
		un array. A continuación se mostrará el contenido de ese array junto al índice
		(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
		primos a las primeras posiciones, desplazando el resto de números (los que no
		son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
		array resultante.*/
		
		Scanner s = new Scanner(System.in);
		int [] numeros = new int [10];
		int [] primos = new int [10];
		int [] noPrimos = new int [10];
		int contadorPrimo = 0;
		int contadorNoPrimo = 0;
		
		System.out.println("Introduce 10 numeros");//pedimos los numeros
		for (int i = 0; i<10; i++) {
			System.out.println("Numero "+(i+1)+"º:");
			numeros[i] = s.nextInt();
		}
		System.out.print("\nindice: ");//imprimimos la tabla
		for ( int i = 0; i<10; i++) {
			System.out.print(" |"+i+"| ");
		}
		
		System.out.println();//salto de linea
		System.out.print("array: ");
		for ( int i = 0; i<10; i++) {
			System.out.print(" |"+numeros[i]+"| ");
		}
		
		for ( int i = 0; i<10; i++) {//recorremos el array numeros
			boolean noPrimo = false;
			for(int u=1; u<9; u++){//recorremos para cada numero del array una variable de 1 a 9
				
				if (numeros [i]%u==0 && u!=1 && u!=numeros[i]) {//si al dividir entre algun numero de 1 a 9 nos da de resto 0, y no es ese mismo numero, y no es 1, entonces no es primo
					noPrimos[contadorNoPrimo] = numeros[i];
					contadorNoPrimo++;//los contadores nos sirven para recorrer despues el array resultante
					noPrimo = true;
					break;
				}
				
			}
			if (!noPrimo) {//si no se ha entrado en el if del loop anterior, es primo
				primos[contadorPrimo] = numeros[i];
				contadorPrimo++;
			}
		}
		
		System.out.println();
		
		System.out.println("\nNumeros introducidos:");//imprimimos los datos
		for ( int i = 0; i<10; i++) {
			System.out.print(" "+numeros[i]);
		}
		
		System.out.println();
		
		System.out.println("\nNumeros primos:");
		for ( int i = 0; i<10; i++) {
			System.out.print(" "+primos[i]);
		}
		
		System.out.println();
		
		System.out.println("\nNumeros no primos:");
		for ( int i = 0; i<10; i++) {
			System.out.print(" "+noPrimos[i]);
		}
		
		for (int i=0; i<contadorPrimo; i++) {//atribuimos los primos al array usando el contador
			numeros[i] = primos[i];
		}

		int u = 0;
		for(int i=(10-contadorNoPrimo);i<10;i++) {//atribuimos los no primos usando el contador
			numeros[i] = noPrimos[u];
			u++;
		}
		
		System.out.println();
		
		System.out.println("\nNumeros ordenados:");//imprimimos el array ordenado
		for ( int i = 0; i<10; i++) {
			System.out.print(" "+numeros[i]);
		}
	}
}

