package unidad_05_Bucles;
import java.util.Scanner;
public class Ejercicio08_5 {

	public static void main(String[] args) {
		// Muestra la tabla de multiplicar de un número 
		//introducido por teclado.

		//declaramos las variables
Scanner s = new Scanner(System.in);
int numero;//el numero que vamos a multiplicar
int multiplicacion = 1;//el numero por el que lo multiplicamos
int resultado;//su resultado
	
	System.out.println("Introduzca un numero.");//pedimos el numero
	numero = s.nextInt();
	
	resultado = numero;//iniciamos la multiplicacion en "ese numero"*1
	
	System.out.println("La tabla de multiplicacion del "+numero+" es:");
	
while (resultado < numero * 10) {//llevamos la tabla hasta el 10
	resultado = numero * multiplicacion;//multiplicamos
	
	System.out.println(numero+"x"+multiplicacion+"="+resultado);//damos el resultado
	
	multiplicacion++;//sumamos en 1 la multiplicacion.
}
		
	}

}
