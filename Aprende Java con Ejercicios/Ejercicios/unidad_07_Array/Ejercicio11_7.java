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
	
		for (int i = 0; i<10; i++) {
			System.out.println("Introduzca un numero");
			numeros[i] = s.nextInt();
			
		}
		for ( int i = 0; i<10; i++) {
			System.out.print(" "+i+" ");
			
		}
		System.out.println();//salto de linea
		for ( int i = 0; i<10; i++) {
			System.out.print(" "+numeros[i]+" ");
			
		}
		for ( int i = 0; i<10; i++) {
			while(numeros[i]%2==0){
		}
	}

}
}
