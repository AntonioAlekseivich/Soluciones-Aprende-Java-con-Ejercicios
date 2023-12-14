package unidad_04_SentenciaCondicional_IfSwitch;
import java.util.Scanner;
public class Ejercicio25_4_Methods {
	public static int inputAtLeast(int min) {
		/**Valida que un valor sea como minimo un num introducido.
		 * valor limite incluido
		 * 
		 * @param: int min: valor inicial
		 * @return:int input: Valor por encima del param.
		 */
		Scanner s = new Scanner(System.in);

		int input = 0;
		do {

		input = s.nextInt();
		if (input < min) {
			System.out.println("valor no valido");
		}
		} while ((input<min));
		return input;
	}

	public static boolean sn(){
		/**recoge una respuesta entre verdadero y falso del usuario
		 * validando el valor introducido.
		 * @return boolean basado en un input entre s y n
		 */
		Scanner sString = new Scanner(System.in);
		String input = "";
		boolean statement = false;
		do {
		input = sString.nextLine();
		
		if (input.equals("s")) {
			statement=true;
		} else if (input.equals("n")) {
			statement = false;
		} else {
			System.out.println("valor no valido");
		}
		
		} while (!input.equals("s")&&!input.equals("n"));
		
		return statement;
	}

	public static int calculateCm2(int altura, int anchura) {
		int cm2 = altura*anchura;
		return cm2;
		
	}
	
	public static double calculatePrice(int cm2) {
		double price = cm2/100.0;
		return price;
	}

public static double calculateTotalPrice(double ESCUDOPRICE, double ENVIO, boolean escudo, double price) {
	double totalPrice = price;
	totalPrice += ENVIO;
	if (escudo) {
		totalPrice += ESCUDOPRICE;
	}
	return totalPrice;
}
}


