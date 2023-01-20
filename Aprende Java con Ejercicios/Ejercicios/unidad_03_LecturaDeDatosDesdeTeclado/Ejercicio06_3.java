package unidad_03_LecturaDeDatosDesdeTeclado;
import java.util.Scanner;
public class Ejercicio06_3 {

	public static void main(String[] args) {
		// Area triangulo = (base*altura)/2

	Scanner s = new Scanner(System.in);
		
double base;
double altura;
double area;

System.out.println("¿Cuál es la base del triangulo?");

base = s.nextDouble();

System.out.println("¿Y la altura?");
altura = s.nextDouble();

area = (base*altura)/2;

System.out.println("El area del triangulo es "+area+".");
	}

}
