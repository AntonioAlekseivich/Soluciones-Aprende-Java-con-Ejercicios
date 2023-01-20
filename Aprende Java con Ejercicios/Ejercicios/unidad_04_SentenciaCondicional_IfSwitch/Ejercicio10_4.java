package unidad_04_SentenciaCondicional_IfSwitch;

import java.util.Scanner;

public class Ejercicio10_4 {

	public static void main(String[] args) {
		//Escribe un programa que nos diga el horóscopo
		// a partir del día y el mes de nacimiento


		//input: mes / dia
		//salida: horoscopo

		//declaramos las variables
		int dia;
		int mes;
		String horoscopo;
		Scanner s = new Scanner(System.in);

		//abrimos un bucle para resetear el codigo en caso
		//de input no valido
		while (true) {

			//pedimos las variables
			System.out.println("Introduce los datos solo con numeros.");
			System.out.println("¿Que día naciste?");
			dia = s.nextInt();

			System.out.println("¿Y en qué mes?");
			mes = s.nextInt();

			//abrimos un switch para comprobar cada caso posible

			switch (mes) {

			case (12):	//para el mes de diciembre

				if (dia >= 22 && dia <=31) {//los dias de ese mes que son capricornio
					horoscopo = "Capricornio";
				} else if (dia > 0 && dia <= 21) {//los dias de ese mes que son sagitario
					horoscopo = "Sagitario";
				}else{//si el dia es mayor a 31 reiniciamos el while
					System.out.println("El dia introducido no es un valor valido");
					continue;
				}
			break;//cerramos el case

			case(11):	//para el mes de novimbre

				if (dia >= 23 && dia <=30) {//los dias de ese mes que son sagitario
					horoscopo = "Sagitario";
				} else if (dia > 0 && dia <= 22) {//los dias de ese mes que son escorpio
					horoscopo = "Escorpio";
				}else{//si el dia es mayor a 30 o <=0 reiniciamos el while
					System.out.println("El dia introducido no es un valor valido");
					continue;
				}
			break;//cerramos el case

			case(10):	//para el mes de octubre

				if (dia >= 23 && dia <=31) {//los dias de ese mes que son escorpio
					horoscopo = "Escorpio";
				} else if (dia > 0 && dia <= 22) {//los dias de ese mes que son libra
					horoscopo = "Libra";
				}else{//si el dia es mayor a 31 o <=0 reiniciamos el while
					System.out.println("El dia introducido no es un valor valido");
					continue;
				}
			break;

			case(8):
				if(dia >= 23 && dia <=31) {
					horoscopo = "Virgo";
				} else if(dia > 0 && dia <= 22){
					horoscopo = "Leo";
				} else{
					System.out.println("El dia introducido no es un valor valido");
					continue;
				}
			
			break;
			case(7):
				if(dia >= 23 && dia <=31) {
					horoscopo = "Leo";
				} else if(dia > 0 && dia <= 22){
					horoscopo = "Cancer";
				} else{
					System.out.println("El dia introducido no es un valor valido");
					continue;
				}
			break;

			case(6):
				if(dia >= 23 && dia <=30) {
					horoscopo = "Cancer";
				} else if(dia > 0 && dia <= 22){
					horoscopo = "Geminis";
				} else{
					System.out.println("El dia introducido no es un valor valido");
					continue;
				}
			break;

			case(5):
				if(dia >= 22 && dia <=31) {
					horoscopo = "Geminis";
				} else if(dia > 0 && dia <= 21){
					horoscopo = "Tauro";
				} else{
					System.out.println("El dia introducido no es un valor valido");
					continue;
				}
			break;

			case(4):
				if(dia >= 21 && dia <=30) {
					horoscopo = "Tauro";
				} else if(dia > 0 && dia <= 20){
					horoscopo = "Aries";
				} else{
					System.out.println("El dia introducido no es un valor valido");
					continue;
				}
			break;

			case(3):
				if(dia >= 21 && dia <=31) {
					horoscopo = "Aries";
				} else if(dia > 0 && dia <= 20){
					horoscopo = "Piscis";
				} else{
					System.out.println("El dia introducido no es un valor valido");
					continue;
				}
			break;

			case(2):
				if(dia >= 21 && dia <=29) {
					horoscopo = "Piscis";
				} else if(dia > 0 && dia <= 20){
					horoscopo = "Acuario";
				} else{
					System.out.println("El dia introducido no es un valor valido");
					continue;
				}
			break;

			case(1):
				if(dia >= 21 && dia <=31) {
					horoscopo = "Acuario";
				} else if(dia > 0 && dia <= 20){
					horoscopo = "Capricornio";
				} else{
					System.out.println("El dia introducido no es un valor valido");
					continue;
				}
			break;

			default://todos los demas casos son valores invalidos de mes
				System.out.println("El mes introducido no es un valor valido");
				continue;
				
			}
			System.out.println("Tu horoscopo es "+horoscopo);
			
			break;
		}
	
		
		
		
	}
}
	

