package unidad_04_SentenciaCondicional_IfSwitch;

public class Ejercicio29_4_Main {

	public static void main(String[] args) {
		/*preguntará primero qué ha tomado el usuario de comer: palmera, donut o
pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
programa debe preguntar además si era con aceite o con tortilla; el primero
vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
café a 1’50 y 1’20 respectivamente.*/
		String food;//palmera, donut o pitufo

		boolean complementoPitufo = false, //true = aceite, false = tortilla;
				bebida = false;//true = zumo, false = cafe;

		double price = 0;

		final double 
		PRECIOPALMERA = 1.4,
		PRECIODONUT = 1,
		PRECIOACEITE = 1.2,
		PRECIOTORTILLA = 1.6,
		PRECIOZUMO = 1.5,
		PRECIOCAFE = 1.2;

		System.out.println("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
		food = Ejercicio29_4_Methods.stringValido3OpcionesMinusculas("palmera", "donut", "pitufo");

		if(food.equals("pitufo")) {
			System.out.println("¿Con qué se ha tomado el pitufo? (aceite o tortilla):");
			complementoPitufo = Ejercicio27_4_Methods.string2Opciones("aceite", "tortilla");
		}

		System.out.println("¿Qué ha tomado de beber? (zumo o café):");
		bebida = Ejercicio27_4_Methods.string2Opciones("zumo", "cafe");


		if (food.equals("palmera")){
			System.out.println("Palmera: "+PRECIOPALMERA+"€");
			price += PRECIOPALMERA;
		} else if (food.equals("donut")) {
			System.out.println("Donut: "+PRECIODONUT+"€");
			price += PRECIODONUT;
		} else {
			if (complementoPitufo) {
				System.out.println("Pitufo con aceite: "+PRECIOACEITE+"€");
				price += PRECIOACEITE;
			} else {
				System.out.println("Pitufo con tortilla: "+PRECIOTORTILLA+"€");
				price += PRECIOTORTILLA;
			}
		}
		if (bebida) {
			System.out.println("Zumo: "+PRECIOZUMO+"€");
			price += PRECIOZUMO;
		} else {
			System.out.println("Cafe: "+PRECIOCAFE+"€");
			price += PRECIOCAFE;
		}

		System.out.println("Total desayuno: "+price+"€");
	}

}
