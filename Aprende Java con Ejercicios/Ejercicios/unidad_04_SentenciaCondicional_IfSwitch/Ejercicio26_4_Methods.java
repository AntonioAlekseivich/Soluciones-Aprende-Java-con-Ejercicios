package unidad_04_SentenciaCondicional_IfSwitch;

import java.util.Scanner;

public class Ejercicio26_4_Methods {
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
			System.out.println("valor no valido, vuelva a introducirlo.");
		}
		} while ((input<min));
		return input;
	}

	public static String diaSemanaValidoMinuscula() {
		/**Pide al usuario introducir un dia de la semana valido
		 *  y lo devuelve en minuscula para evitar errores
		 * 
		 * 
		 * @return:String dia: dia valido.
		 */
		Scanner s = new Scanner(System.in);

		String input = "";
		do {

		input = s.nextLine().toLowerCase();
		if (!input.equals("lunes") &&!input.equals("martes")&&!input.equals( "miercoles")&&!input.equals( "jueves") && !input.equals( "viernes") &&!input.equals( "sabado")&& !input.equals( "domingo")) {
			System.out.println("valor no valido, vuelva a introducirlo");
		}
		} while (!input.equals("lunes") &&!input.equals("martes")&&!input.equals( "miercoles")&& !input.equals( "jueves")&& !input.equals( "viernes") &&!input.equals( "sabado")&& !input.equals( "domingo"));
		return input;
	}

	public static boolean sn(){
		/**recoge una respuesta entre verdadero y falso del usuario
		 * validando el valor introducido.
		 * @return:boolean statement: En funcion de la respuesta del usuario.
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

	}

