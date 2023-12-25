package unidad_04_SentenciaCondicional_IfSwitch;

import java.util.Scanner;

public class Ejercicio28_4_Methods {
	public static String stringValido3OpcionesMinusculas(String value1,String value2,String value3) {
		/**Pide al usuario introducir un string y valida que sea igual a alguno de los 3 Strings
		 * introducidos en el metodo.
		 * Casteado a minuscula
		 * 
		 * @param: String valor: strings deseados.
		 * @return:String dia: dia valido.
		 */
		Scanner s = new Scanner(System.in);

		String input = "";
		do {

			input = s.nextLine().toLowerCase();
			if (!input.equals(value1)  &&!input.equals(value2) &&!input.equals(value3)) {
				System.out.println("valor no valido, vuelva a introducirlo");
			}
		} while (!input.equals(value1)  &&!input.equals(value2) &&!input.equals(value3));
		return input;
	}
}
