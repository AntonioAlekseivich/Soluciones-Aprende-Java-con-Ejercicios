package c.lecturaDeDatosDesdeTeclado;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
double primero;
double segundo;

double suma;
double resta;
double multiplicacion;
double division;



System.out.println("Introduzca el primer numero.");
primero = s.nextDouble();

System.out.println("Introduzca el segundo numero.");
segundo = s.nextDouble();

suma = primero+segundo;
resta = primero-segundo;
multiplicacion = primero*segundo;
division = primero/segundo;

System.out.println("Los resultados de las operaciones entre esos dos numeros son:");
System.out.printf("Suma:%.2f\nResta:%.2f\nMultiplicacion:%.2f\nDivision:%.2f\n",suma,resta,multiplicacion,division);
	}

}
