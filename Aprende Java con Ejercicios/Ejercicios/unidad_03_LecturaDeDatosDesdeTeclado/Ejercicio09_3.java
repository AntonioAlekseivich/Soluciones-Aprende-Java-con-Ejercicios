package unidad_03_LecturaDeDatosDesdeTeclado;
import java.util.Scanner;

public class Ejercicio09_3 {

	public static void main(String[] args) {
		// volumenCono?
		//V=1/3*Math.PI*r*r*h;
Scanner s = new Scanner(System.in);

double radius;
double height;
double volume;

System.out.println("¿Cuál es el radio de la base del cono?");
radius = s.nextDouble();

System.out.println("¿Y su altura?");
height = s.nextDouble();

volume = (double) 1/3*Math.PI*radius*radius*height;

System.out.printf("El volumen del cono es de %.2f.",volume);
	}

}
