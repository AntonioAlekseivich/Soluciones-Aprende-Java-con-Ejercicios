package unidad_07_Array;
import java.util.Scanner;
public class Ejercicio09_7 {

	public static void main(String[] args) {
		/*Ejercicio 9
		Realiza un programa que pida 8 números enteros y que luego muestre esos
		números junto con la palabra “par” o “impar” según proceda.*/

		int numero [] = new int [8];
		Scanner s = new Scanner(System.in);

		for(int i=0; i<8; i++) {//pedimos los numeros
			if(i==0) {
				System.out.println("Introduce un numero");
				numero[i] = s.nextInt();
			}else {
				System.out.println("Introduce otro numero");
				numero[i] = s.nextInt();
			}
		}
		
		for(int i=0; i<8; i++) {//los imprimimos comprobando que san pares o impares
			System.out.print(numero[i]);
			if(numero[i] % 2 == 0 ) {
			System.out.print(" par\n");
			} else {
			System.out.print(" impar\n");
			}
			
		}
		
	}
}
