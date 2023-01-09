package c.lecturaDeDatosDesdeTeclado;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Area de un rectangulo = largo*ancho
		Scanner s = new Scanner(System.in);
		
double largo;
double ancho;

double area;

System.out.println("¿Cual es el largo del rectangulo?");
largo = s.nextDouble();

System.out.println("¿Y el ancho?");
ancho = s.nextDouble();

area = largo*ancho;

System.out.println("El area del rectangulo es "+area);
	}

}
