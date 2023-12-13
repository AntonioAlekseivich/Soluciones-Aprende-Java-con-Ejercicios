package unidad_04_SentenciaCondicional_IfSwitch;
import java.util.Scanner;

public class Ejercicio20_4 {

	public static void main(String[] args) {
		/*Realiza un programa que diga si un número entero positivo introducido por
teclado es capicúa. Se permiten números de hasta 5 cifras.*/
		Scanner s = new Scanner(System.in);
		int cifras = 1;
		
		System.out.println("Introduzca un numero positivo de menos de 6 cifras.");
		int num = s.nextInt();
		String numS = ""+num, numI = "";//1 string for the num n' other for the inverse
		
		if(num<99999&&num>0) {//if it has less than 6 digits and is positive
		if(num>9999) {//count the digits
			cifras++;
		}
		if(num>999) {
			cifras++;
		}
		if(num>99) {
			cifras++;
		}
		if(num>9) {
			cifras++;
		}
		}else {
			cifras = -1;//else not a valid number
		}
		
		switch (cifras) {
		case 1:
			System.out.println("El numero solo tiene una cifra.");
			break;
		case 2:
			String cifra1 = "",cifra2 = "";
			cifra1 += num / 10;//create 2 string for each digit
			cifra2 += num % 10;
			
			if(cifra1.equals(cifra2)) {//compare them
				System.out.println("Tiene 2 digitos y es capicua");
			} else {
				System.out.println("Tiene 2 digitos y no es capicua");
			}
			break;
			
		case 3:
			numI += num % 10;//we invert it
			numI += num % 100;
			
			
			if(numS.equals(numI)) {//compare them
				System.out.println("Tiene 3 digitos y es capicua");
			} else {
				System.out.println("Tiene 3 digitos y no es capicua");
			}
			break;
			
		case 4:
			//we split it and compare both halfs
			numI += num % 10;//add the last digit
			num /= 10; //get rid of the last digit
			numI += num % 10;//add the last digit
			num /= 10; //get rid of the last digit
			numI += num % 10;
			num /= 10; //get rid of the last digit
			numI += num % 10;

			
			if(numS.equals(numI)) {//compare them
				System.out.println("Tiene 4 digitos y es capicua");
			} else {
				System.out.println("Tiene 4 digitos y no es capicua");
			}
			break;
			
		case 5:
			//we split it and compare both halfs
			numI += num % 10;//add the last digit1
			num /= 10; //get rid of the last digit
			numI += num % 10;//add the last digit2
			num /= 10; //get rid of the last digit
			numI += num % 10;//3
			num /= 10; //get rid of the last digit
			numI += num % 10;//4
			num /= 10; //get rid of the last digit
			numI += num % 10;//5
			
			if(numS.equals(numI)) {//compare them
				System.out.println("Tiene 5 digitos y es capicua");
			} else {
				System.out.println("Tiene 5 digitos y no es capicua");
			}
			break;
			default:
				System.out.println("Numero no valido");
		}
		s.close();
		
	}

}
