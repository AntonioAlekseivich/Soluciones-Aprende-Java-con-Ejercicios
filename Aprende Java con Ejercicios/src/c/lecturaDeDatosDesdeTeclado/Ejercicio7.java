package c.lecturaDeDatosDesdeTeclado;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		// iva=21% de base; total=base+iva;
		
		Scanner s = new Scanner(System.in);
		
double base;
double total;
double iva;

System.out.println("¿Cual es la base imponible?");
base = s.nextDouble();

iva = base*0.21;
total = base+iva;
System.out.printf("Tiene un iva de %.2f€.\n",iva);
System.out.printf("El total de la factura es de %.2f€.",total);
	}
}
