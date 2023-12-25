package unidad_04_SentenciaCondicional_IfSwitch;

import java.util.Scanner;

public class Ejercicio27_4_Methods {
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
		if (!input.equals("manzana") &&!input.equals("fresa") &&!input.equals("chocolate")) {
			System.out.println("valor no valido, vuelva a introducirlo");
		}
		} while (!input.equals("manzana") &&!input.equals("fresa") &&!input.equals("chocolate"));
		return input;
	}

	public static boolean string2Opciones(String isTrue, String isFalse) {
		/**devuelve al boolean dependiendo de la respuesta del usuario
		 * asegurandose que la respuesta sea entre 2 opciones pasadas al metodo
		 *@param:String isTrue, isFalse: opciones disponibles.
		 *@return: boolean statement:: opcion seleccionada.
		 */
		Scanner sString = new Scanner(System.in);
		String input = "";
		boolean statement = false;
		do {
			input = sString.nextLine();

			if (input.equals(isTrue)) {
				statement=true;
			} else if (input.equals(isFalse)) {
				statement = false;
			} else {
				System.out.println("valor no valido");
			}

		} while (!input.equals(isTrue)&&!input.equals(isFalse));

		return statement;
	}

}
