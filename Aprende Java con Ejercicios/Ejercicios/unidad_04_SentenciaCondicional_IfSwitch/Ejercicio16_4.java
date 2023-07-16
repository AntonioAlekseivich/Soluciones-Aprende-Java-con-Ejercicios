package unidad_04_SentenciaCondicional_IfSwitch;

import java.util.Scanner;

public class Ejercicio16_4 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja
		 * nos está siendo infiel. El programa irá haciendo preguntas que el usuario
		 * contestará con verdadero o falso. Cada pregunta contestada como verdadero
		 * sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. A
		 * continuación se listan las preguntas del test.
		 */

		/*
		 * @param: int puntuacion 
		 * @input: String respuesta 
		 * @output: String resultado
		 */
		Scanner s = new Scanner(System.in);
		
		int puntuacion = 0;
		String resultado;
		String respuesta;
		
		System.out.println("Este test calcula la probabilidad de que su pareja le este siendo infiel. "
				+ "Responda a las preguntas a continuación con \"V\" en caso de verdadero y cualquier otra caracter"
				+ " en caso de falso.");
		
		System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
		respuesta = s.nextLine();
		if(respuesta.equals("v") || respuesta.equals("V") ) {
			puntuacion = puntuacion + 3;
		}
		
		System.out.println("2. Ha aumentado sus gastos de vestuario.");
		respuesta = s.nextLine();
		if(respuesta.equals("v") || respuesta.equals("V") ){
			puntuacion = puntuacion + 3;
		}
		
		System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
		respuesta = s.nextLine();
		if(respuesta.equals("v") || respuesta.equals("V") ){
			puntuacion = puntuacion + 3;
		}

		System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
		respuesta = s.nextLine();
		if(respuesta.equals("v") || respuesta.equals("V") ){
			puntuacion = puntuacion + 3;
		}
		
		System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
		respuesta = s.nextLine();
		if(respuesta.equals("v") || respuesta.equals("V") ){
			puntuacion = puntuacion + 3;
		}
		
		System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
		respuesta = s.nextLine();
		if(respuesta.equals("v") || respuesta.equals("V") ){
			puntuacion = puntuacion + 3;
		}
		
		System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
		respuesta = s.nextLine();
		if(respuesta.equals("v") || respuesta.equals("V") ){
			puntuacion = puntuacion + 3;
		}
		
		System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
		respuesta = s.nextLine();
		if(respuesta.equals("v") || respuesta.equals("V") ){
			puntuacion = puntuacion + 3;
		}
		
		System.out.println("9. Has notado que últimamente se perfuma más");
		respuesta = s.nextLine();
		if(respuesta.equals("v") || respuesta.equals("V") ){
			puntuacion = puntuacion + 3;
		}
		
		System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
		respuesta = s.nextLine();
		if(respuesta.equals("v") || respuesta.equals("V") ){
			puntuacion = puntuacion + 3;
		}
	
		if ( puntuacion >= 0 && puntuacion <=10) {
			resultado = "¡Enhorabuena! tu pareja parece ser totalmente fiel.";
			System.out.println(resultado);
		} else if (puntuacion >= 11 && puntuacion<= 22) {
			resultado = "Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.";
			System.out.println(resultado);
		} else if (puntuacion >22) {
			resultado = "Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.";
			System.out.println(resultado);
		}
		
		
	}

}
