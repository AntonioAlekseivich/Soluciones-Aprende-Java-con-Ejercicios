package unidad_04_SentenciaCondicional_IfSwitch;

public class Ejercicio19_4 {

	public static void main(String[] args) {
		/*Realiza un programa que nos diga cuántos dígitos tiene un número entero que
		puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.*/
		int num=-23,digito=1;
		if(num>0) {//en casao de que sea positivo
			
		if(num>9999) {
			digito++;
		}
		if(num>999) {
			digito++;
		}
		if(num>99) {
			digito++;
		}
		if(num>9) {
			digito++;
		}
		} else {//en caso de que sea negativo
			
			if(num<-9999) {
				digito++;
			}
			if(num<-999) {
				digito++;
			}
			if(num<-99) {
				digito++;
			}
			if(num<-9) {
				digito++;
			}
		}
		System.out.println("Ese numero tiene "+digito+" digitos.");
	}

}
