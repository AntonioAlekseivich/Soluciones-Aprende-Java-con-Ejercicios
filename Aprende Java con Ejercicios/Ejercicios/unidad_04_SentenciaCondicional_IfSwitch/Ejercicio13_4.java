package unidad_04_SentenciaCondicional_IfSwitch;
import java.util.Scanner;

public class Ejercicio13_4 {

	public static void main(String[] args) {
		//Escribe un programa que ordene tres números enteros introducidos por teclado.
		
		int tNum1;
		int tNum2;
		int tNum3;
		
		int num1;
		int num2;
		int num3;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca el primer numero.");
		tNum1 = s.nextInt();
		System.out.println("Introduzca el segundo numero.");
		tNum2 = s.nextInt();
		System.out.println("Introduzca el tercer numero.");
		tNum3 = s.nextInt();
		
		//output: 1 2 3
		
		if(tNum1>tNum2 && tNum2>tNum3) {//input: 3 2 1 //check
			num1 = tNum3;
			num2 = tNum2;
			num3 = tNum1;
			System.out.printf("Numeros introducidos:\n"
					+tNum1+ " "+tNum2+" "+tNum3+"\n");
			System.out.printf("Numeros ordenados:\n"
					+num1+" "+num2+" "+num3);
			
		} else if(tNum1>tNum2 && tNum2<tNum3 && tNum1>tNum3){//input: 3 1 2 //check
			num1 = tNum2;
			num2 = tNum3;
			num3 = tNum1;
			System.out.printf("Numeros introducidos:\n"
					+tNum1+ " "+tNum2+" "+tNum3+"\n");
			System.out.printf("Numeros ordenados:\n"
					+num1+" "+num2+" "+num3);
			
		} else if(tNum2>tNum1 && tNum1>tNum3) {//2 3 1 //check
			num1 = tNum3;
			num2 = tNum1;
			num3 = tNum2;
			System.out.printf("Numeros introducidos:\n"
					+tNum1+ " "+tNum2+" "+tNum3+"\n");
			System.out.printf("Numeros ordenados:\n"
					+num1+" "+num2+" "+num3);
			
		} else if (tNum2>tNum1 && tNum1<tNum3) {// 1 3 2 //check
			num1 = tNum1;
			num2 = tNum3;
			num3 = tNum2;
			System.out.printf("Numeros introducidos:\n"
					+tNum1+ " "+tNum2+" "+tNum3+"\n");
			System.out.printf("Numeros ordenados:\n"
					+num1+" "+num2+" "+num3);
			
		} else if (tNum3>tNum1 && tNum1>tNum2 && tNum1<tNum3) {//2 1 3 //check
			num1 = tNum2;
			num2 = tNum1;
			num3 = tNum3;
			System.out.printf("Numeros introducidos:\n"
					+tNum1+ " "+tNum2+" "+tNum3+"\n");
			System.out.printf("Numeros ordenados:\n"
					+num1+" "+num2+" "+num3);
			
		} else if(tNum3>tNum1 && tNum1<tNum2) {//1 2 3
			num1 = tNum1;
			num2 = tNum2;
			num3 = tNum3;
			System.out.printf("Numeros introducidos:\n"
					+tNum1+ " "+tNum2+" "+tNum3+"\n");
			System.out.printf("Numeros ordenados de forma ascendente:\n"
					+num1+" "+num2+" "+num3);
			
		}
		System.out.println("Fin del programa");
	}

}
