package unidad_06_NumerosAleatorios;

public class Ejercicio02_6 {

	public static void main(String[] args) {
		/*Realiza un programa que muestre al azar el nombre de una carta de la baraja
		francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
		y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
		numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
		1). Para convertir un número en una cadena de caracteres podemos usar
		String.valueOf(n)*/

//variables:
		String palo = "";//puede ser ("pica","corazones","diamantes","treboles")(4casos)
		String carta = "";//puede ser 4 casos o un numero del 2 al 10
		int rollPalo;
		int rollCarta;
		//importante inicializar los string y despues concatenarlos, no asignarles una nueva variable dentro del bucle
		//si les asignamos una nueva variable dentro del bucle, despues no podemos usarlos fuera del mismo
		
			

			
			
			//sacamos el valor de la carta
		rollCarta = (int)(Math.random()* 13 ) + 1;
		
			//separamos los casos que pueden ser caracteres de los numerales
			if (rollCarta == 1) {
						carta += "A";//+= para concatenar; importante no usar =
						
			} else if (rollCarta > 10){
				
				switch(rollCarta) {
					case 11:
						carta += "J";
						
						break;
					case 12:
						carta += "Q";
						
						break;
					case 13:
					carta += "K";
					
					break;
				}
				
			}else {
			carta += rollCarta;
			
			
			}
			
			
			
			//sacamos el valor del palo
			rollPalo = (int)(Math.random()*4 ) + 1 ;
				switch (rollPalo) {
				case 1:
					palo += "Picas";
					
					
				break;
				case 2: 
					palo += "Corazones";
					
					
				break;
				case 3:
					palo += "Diamantes";
					
				break;
				case 4:
					palo += "Tréboles";
					
				break;
				
				}
			
			
	System.out.println(carta+" de "+palo);
	}	
}

