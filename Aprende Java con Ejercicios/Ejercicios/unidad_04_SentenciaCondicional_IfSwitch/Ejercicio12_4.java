package unidad_04_SentenciaCondicional_IfSwitch;

import java.util.Scanner;
public class Ejercicio12_4 {

	public static void main(String[] args) {
		/*Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
que se imparten en el curso. Cada pregunta acertada sumará un punto. El
programa mostrará al final la calificación obtenida*/
		int puntuacion = 0;
		int errores = 0;
		
		String respuesta;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Test sobre la asignatura de Sistemas Informaticos de DAW");
		System.out.println("Pregunta 1:");
		System.out.println("La informatica es la ciencia que...");
		System.out.printf("a)Maneja las aplicaciones de procedimientos de datos controlados.\n"
				+ "b)Estudia el tratamiento automático de la información por medio de sistemas informáticos.\n"
				+ "c)Estudia el comportamiento cívico de los usuarios programadores.\n"
				+ "d)Se encarga de estudiar sólo lo relacionado con los ordenadores.\n");
		respuesta = s.nextLine();
		if(respuesta.equals("b")){
			puntuacion = puntuacion + 1;
					} else {
						errores = errores + 1;
					}
		
		System.out.println("Pregunta 2:");
		System.out.println("Señala las respuestas correctas respecto a las cajas de ordenador.");
		System.out.printf("a)Se fabrican siguiendo unas dimensiones estándares.\n"
				+ "b)En su interior se instalan todos los dispositivos conectados al ordenador.\n"
				+ "c)En su exterior podemos ver las conexiones disponibles para los dispositivos internos\n."
				+ "d)Deben estar bien ventiladas para evacuar el calor generado por los componentes de su interior.\n");
		respuesta = s.nextLine();
		if(respuesta.equals("a")){
			puntuacion = puntuacion + 1;
					} else {
						errores = errores + 1;
					}
		
		System.out.println("Pregunta 3:");
		System.out.println("De la siguiente respuestas, señala las que son correctas.");
		System.out.printf("a)La GPU es el procesador de las tarjetas de vídeo.\n"
				+ "b)Las tarjetas de vídeo integradas de la placa base con conector SVGA no necesitan RAMDAC.\n"
				+ "c)Si ya tengo el vídeo integrado en la placa base no puedo añadir una nueva tarjeta de vídeo.\n"
				+ "d)Una misma tarjeta de vídeo puede tener conectores de salida de los tipos SVGA y DVI.");
		respuesta = s.nextLine();
		if(respuesta.equals("a")){
			puntuacion = puntuacion + 1;
					} else {
						errores = errores + 1;
					}
		
		System.out.println("Pregunta 4:");
		System.out.println("Señala los elementos o componentes que no son imprescindibles para que el ordenador pueda arrancar.");
		System.out.printf("a)Memoria RAM.\n"
				+ "b)Disco duro.\n"
				+ "c)Procesador.\n"
				+ "d)Fuente de alimentación.");
		respuesta = s.nextLine();
		if(respuesta.equals("d")){
			puntuacion = puntuacion + 1;
					} else {
						errores = errores + 1;
					}
		
		System.out.println("Pregunta 5:");
		System.out.println("Señala la respuesta incorrecta respecto a los periféricos:");
		System.out.printf("a)Existen unidades de entrada/salida.\n"
				+ "b)Existen unidades de almacenamiento externo.\n"
				+ "c)Existen unidades de entrada y unidades de salida.\n"
				+ "d)Existen unidades de compresión de hardware.");
		respuesta = s.nextLine();
		if(respuesta.equals ("d")){
			puntuacion = puntuacion + 1;
					} else {
						errores = errores + 1;
					}
		
		System.out.println("Pregunta 6:");
		System.out.println("¿Qué es un algoritmo?");
		System.out.printf("a) Un programa de computadora.\n"
		        + "b) Una secuencia de pasos para resolver un problema.\n"
		        + "c) Un tipo de memoria en el hardware.\n"
		        + "d) Un dispositivo de entrada en un ordenador.\n");
		respuesta = s.nextLine();
		if (respuesta.equals("b")) {
		    puntuacion = puntuacion + 1;
		} else {
		    errores = errores + 1;
		}

		System.out.println("Pregunta 7:");
		System.out.println("¿Cuál de los siguientes lenguajes de programación es de tipo orientado a objetos?");
		System.out.printf("a) C\n"
		        + "b) Python\n"
		        + "c) HTML\n"
		        + "d) Assembly\n");
		respuesta = s.nextLine();
		if (respuesta.equals("b")) {
		    puntuacion = puntuacion + 1;
		} else {
		    errores = errores + 1;
		}

		System.out.println("Pregunta 8:");
		System.out.println("¿Cuál de las siguientes estructuras de datos se caracteriza por seguir el principio de 'primero en entrar, primero en salir'?");
		System.out.printf("a) Pila (Stack)\n"
		        + "b) Cola (Queue)\n"
		        + "c) Árbol (Tree)\n"
		        + "d) Lista enlazada (Linked List)\n");
		respuesta = s.nextLine();
		if (respuesta.equals("a")) {
		    puntuacion = puntuacion + 1;
		} else {
		    errores = errores + 1;
		}

		System.out.println("Pregunta 9:");
		System.out.println("¿Qué es un bucle 'for' en programación?");
		System.out.printf("a) Una estructura condicional.\n"
		        + "b) Un tipo de variable.\n"
		        + "c) Una operación matemática.\n"
		        + "d) Una estructura de control repetitiva.\n");
		respuesta = s.nextLine();
		if (respuesta.equals("d")) {
		    puntuacion = puntuacion + 1;
		} else {
		    errores = errores + 1;
		}

		System.out.println("Pregunta 10:");
		System.out.println("¿Qué es la recursividad en programación?");
		System.out.printf("a) Un error de compilación.\n"
		        + "b) Un tipo de dato primitivo.\n"
		        + "c) Un paradigma de programación.\n"
		        + "d) Una función o método que se llama a sí mismo.\n");
		respuesta = s.nextLine();
		if (respuesta.equals("d")) {
		    puntuacion = puntuacion + 1;
		} else {
		    errores = errores + 1;
		}

		System.out.println("Pregunta 11:");
		System.out.println("¿Cuál de las siguientes estructuras de datos permite almacenar elementos de manera ordenada y eficiente para realizar búsquedas rápidas?");
		System.out.printf("a) Pila (Stack)\n"
		        + "b) Cola (Queue)\n"
		        + "c) Árbol (Tree)\n"
		        + "d) Tabla hash (Hash table)\n");
		respuesta = s.nextLine();
		if (respuesta.equals("c")) {
		    puntuacion = puntuacion + 1;
		} else {
		    errores = errores + 1;
		}

		System.out.println("Aciertos:"+puntuacion+"\n"
				+ "Errores:"+errores);
	}
	

}
