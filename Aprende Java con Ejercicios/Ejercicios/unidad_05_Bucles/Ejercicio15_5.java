package unidad_05_Bucles;
import java.util.Scanner;

public class Ejercicio15_5 {

	public static void main(String[] args) {
		/*Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 21, 22, 23, 24 y 25.*/
double base=2;
int exponente=5;
double result=base;
System.out.println(base+"^"+1+"="+base);
for(int i=2;i<=exponente;i++) {
	 result*=base;
	System.out.println(base+"^"+i+"="+result);
}
	}

}
