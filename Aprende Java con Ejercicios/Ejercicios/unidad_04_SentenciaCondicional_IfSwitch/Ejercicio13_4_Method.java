package unidad_04_SentenciaCondicional_IfSwitch;


public class Ejercicio13_4_Method {
	public static String ordenamientoNumeral(int tNum1, int tNum2, int tNum3) {

		// Escribe un programa que ordene tres números enteros introducidos por teclado.
		//@param: int  tNum1, int tNum2, int tNum3
		//@output: param ordenados

		int num1;
		int num2;
		int num3;
		
		if (tNum1 > tNum2 && tNum2 > tNum3) {// input: 3 2 1 
			
			num1 = tNum3;
			num2 = tNum2;
			num3 = tNum1;

			String result = "" + num1 + num2 + num3 ;
			return result;
		} else if (tNum1 > tNum2 && tNum2 < tNum3 && tNum1>tNum3) {// input: 3 1 2
			
			num1 = tNum2;
			num2 = tNum3;
			num3 = tNum1;

			String result = "" + num1 + num2 + num3 ;
			return result;
		} else if (tNum2 > tNum1 && tNum1 > tNum3) {// 2 3 1
			
			num1 = tNum3;
			num2 = tNum1;
			num3 = tNum2;
			String result = "" + num1 + num2 + num3 ;
			return result;

		} else if (tNum2 > tNum1 && tNum1 < tNum3 && tNum2 > tNum3) {// 1 3 2
			
			num1 = tNum1;
			num2 = tNum3;
			num3 = tNum2;
			String result = "" + num1 + num2 + num3 ;
			return result;

		} else if (tNum3 > tNum1 && tNum1 > tNum2 && tNum1 < tNum3) {// 2 1 3 // check
			
			num1 = tNum2;
			num2 = tNum1;
			num3 = tNum3;

			String result = "" + num1 + num2 + num3 ;
			return result;
		} else if (tNum3 > tNum1 && tNum1 < tNum2) {// 1 2 3
			
			num1 = tNum1;
			num2 = tNum2;
			num3 = tNum3;

			String result = "" + num1 + num2 + num3 ;
			return result;
		}
		return "Invalid input";
	}
}
