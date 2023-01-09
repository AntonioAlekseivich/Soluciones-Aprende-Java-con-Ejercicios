package c.lecturaDeDatosDesdeTeclado;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	
		double euro;
		int peseta;
		
System.out.println("Introduzca la cantidad en euros:");

		euro = s.nextDouble();
		peseta = (int) (euro*166.386);

System.out.println(euro+" euros son "+peseta+" pesetas.");
	}

}
