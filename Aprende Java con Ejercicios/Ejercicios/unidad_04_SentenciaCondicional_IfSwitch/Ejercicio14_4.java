package unidad_04_SentenciaCondicional_IfSwitch;

public class Ejercicio14_4 {
	/*Realiza un programa que diga si un número introducido por teclado es par y/o
	divisible entre 5.
	
		@param: int  num
		@output: boolean
		*/
	public static boolean esParEsDivisibleEntre5(int num){
		if(num % 2 ==0 || num % 5 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
