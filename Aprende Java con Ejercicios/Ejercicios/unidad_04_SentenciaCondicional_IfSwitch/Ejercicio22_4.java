package unidad_04_SentenciaCondicional_IfSwitch;
import java.util.Scanner;

public class Ejercicio22_4 {
	public static void main(String[] args) {
/*Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
a las 15:00h.*/
	
		Scanner sString = new Scanner(System.in);
		Scanner sInt = new Scanner(System.in);
		final int HOURSDAY = 24, MINHOUR = 60, MINUTESDAY = 1440,HOURSFRIDAY = 15, MINFRIDAY = 900;
		String day;
		int hourS, minS, hourLeft, minLeft;
	
	System.out.println("Introduce a day of the week.");
	day = sString.nextLine();
	System.out.println("Introduzca an hour.");
	hourS = sInt.nextInt();
	System.out.println("Introduce minutes");
	minS = sInt.nextInt();
	switch (day) {
	case "monday":
		hourLeft = HOURSDAY - hourS;//calculate the hours left in the day
		minLeft = hourLeft * MINHOUR;//put them to minutes
		minLeft += minS - MINHOUR; //add the rest of the minutes introduced by user
		minLeft += MINUTESDAY*3;//add the minutes before friday 
		minLeft+=MINFRIDAY;//add the minutes of friday
		
		System.out.println("There are "+ minLeft+" minutes left before the weekend.");
		break;
	case "tuesday":
		hourLeft = HOURSDAY - hourS;//calculate the hours left in the day
		minLeft = hourLeft * MINHOUR;//put them to minutes
		minLeft += minS - MINHOUR; //add the rest of the minutes introduced by user
		minLeft += MINUTESDAY*2;//add the minutes before friday 
		minLeft+=MINFRIDAY;//add the minutes of friday
		
		System.out.println("There are "+ minLeft+" minutes left before the weekend.");
		break;
	case "wednesday":
	hourLeft = HOURSDAY - hourS;//calculate the hours left in the day
	minLeft = hourLeft * MINHOUR;//put them to minutes
	minLeft += minS - MINHOUR; //add the rest of the minutes introduced by user
	minLeft += MINUTESDAY;//add the minutes before friday 
	minLeft+=MINFRIDAY;//add the minutes of friday
	
	System.out.println("There are "+ minLeft+" minutes left before the weekend.");
		break;
	case "thursday":
		hourLeft = HOURSDAY - hourS;//calculate the hours left in the day
		minLeft = hourLeft * MINHOUR;//put them to minutes
		minLeft += minS - MINHOUR; //add the rest of the minutes introduced by user
		//minLeft += MINUTESDAY; //since there are no days between thursday and friday, we do not need to add this.
		minLeft+=MINFRIDAY;//add the minutes of friday
		
		System.out.println("There are "+ minLeft+" minutes left before the weekend.");
		break;
	case "friday":
		hourLeft = HOURSFRIDAY - hourS;//calculate the hours left before 3 pm
		minLeft = hourLeft * MINHOUR;//put them to minutes
		minLeft += minS - MINHOUR; //add the rest of the minutes introduced by user
		//minLeft += MINUTESDAY; //since there are no days between thursday and friday, we do not need to add this.
		//minLeft+=MINFRIDAY;//this minutes have already been added
		
		System.out.println("There are "+ minLeft+" minutes left before the weekend.");
		break;
	default:
		System.out.println("value "+ day+ " invalid.");
	}
	}
}
