package unidad_04_SentenciaCondicional_IfSwitch;

public class Ejercicio18_4 {
	/*Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras.*/
	
	public static int primeraCifra(int num){
		//declaramos 2 ints; uno para los posibles casos y otro para devolver el resultado.
		int caso;
		int result;
		
		//definimos en que caso nos encontramos.
		if (num > 9999 && num <= 99999) {
			caso = 5;
		} else if ( num > 999 && num<= 9999 ) {
			caso= 4;
		} else if ( num > 99 && num <= 999) {
			caso= 3;
		} else if ( num > 9 && num <= 99) {
			caso = 2;
		} else if ( num > 0 && num <= 9) {
			caso = 1;
		} else {
			caso = 0;
		}
		
		//sacamos la solucion con un switch
		switch (caso) {
		case 5:
			result = num / 10000;
		break;
		
		case 4:
			result = num / 1000;
		break;
		
		case 3:
			result = num / 100;
		break;
		
		case 2:
			result = num / 10;
		break;
		
		case 1:
			result = num;
			break;
			
			default:
				result= 0;
		}
		
		//devolvemos la solucion
		return result;
	}
}
