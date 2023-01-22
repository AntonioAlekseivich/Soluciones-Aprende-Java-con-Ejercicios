package unidad_06_NumerosAleatorios;

public class Ejercicio03_6 {

	public static void main(String[] args) {
		/* Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
		de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.*/

		//variables:
		String palo = "";
		String carta = "";
		int rollPalo;
		int rollCarta;
		//importante inicializar los string y despues concatenarlos, no asignarles una nueva variable dentro del bucle
		//si les asignamos una nueva variable dentro del bucle, despues no podemos usarlos fuera del mismo





		//sacamos el valor de la carta
		rollCarta = (int)(Math.random()* 10 ) + 1;

		//separamos los casos que pueden ser caracteres de los numerales
		if (rollCarta == 1) {
			carta += "As";//+= para concatenar; importante no usar =

		} else if (rollCarta > 7){

			switch(rollCarta) {
			case 8:
				carta += "Sota";

				break;
			case 9:
				carta += "Caballo";

				break;
			case 10:
				carta += "Rey";

				break;
			}

		}else {
			carta += rollCarta;


		}



		//sacamos el valor del palo
		rollPalo = (int)(Math.random()*4 ) + 1 ;
		switch (rollPalo) {
		case 1:
			palo += "Oro";


			break;
		case 2: 
			palo += "Bastos";


			break;
		case 3:
			palo += "Espadas";

			break;
		case 4:
			palo += "Copas";

			break;

		}


		System.out.println(carta+" de "+palo);
	}	
}


