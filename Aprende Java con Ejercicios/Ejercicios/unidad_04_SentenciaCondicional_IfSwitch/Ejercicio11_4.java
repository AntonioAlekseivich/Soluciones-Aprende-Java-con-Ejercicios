package unidad_04_SentenciaCondicional_IfSwitch;

import java.util.Scanner;

public class Ejercicio11_4 {

	public static void main(String[] args) {
	/*Escribe un programa que dada una hora determinada (horas y minutos), calcule
	los segundos que faltan para llegar a la medianoche*/
		
		//Lo primero es calcular cuantos segundos tienen 24h.
		//Despues los segundos que lleva en la hora dada.
		//Calcular y devolver la diferencia.
		
		Scanner s = new Scanner(System.in);
		

	
	int hora;
	int minutos;
	
	int segundosHoraIntroducidos;
	int segundosMinutosIntroducidos;
	
	int segundosTotalesIntroducidos;
	
	int diferencia;
	
	boolean validInput = true;
	
	while (validInput) {
		System.out.println("Introduzca la hora");
	hora = s.nextInt()	;
	if (hora < 1 || hora > 24) {
		System.out.println("Hora incorrecta");
		validInput = false;
		} else {
			System.out.println("Introduzca los minutos");
			minutos = s.nextInt();
			if (minutos < 1 || minutos > 60) {
				validInput = false;
				System.out.println("Minutos incorrectos");
				} else {
					
	segundosHoraIntroducidos = hora * 3600;
	segundosMinutosIntroducidos = minutos * 60;
	
	segundosTotalesIntroducidos = segundosMinutosIntroducidos + segundosHoraIntroducidos;
	
	diferencia = 86400 - segundosTotalesIntroducidos;
	System.out.println(segundosTotalesIntroducidos);
	System.out.println("Quedan "+diferencia+" segundos para media noche");
		}
	}
}
	
	}
}