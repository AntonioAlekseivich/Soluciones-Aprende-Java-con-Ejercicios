package unidad_04_SentenciaCondicional_IfSwitch;

public class Ejercicio27_4_Main {

	public static void main(String[] args) {
		/*Una pastelería nos ha pedido realizar un programa que haga presupuestos de
tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
nombre; la nata suma 2.50 y la escritura del nombre 2.75.*/

		String flavour;//manzana, fresa o chocolate

		boolean chocolate=false//negro = true, blanco=false;
		,cream//si o no
		,name;//si o no

		double price=0;

		final double 
		PRICEAPPLE = 18, 
		PRICESTRAWBERRY = 16, 
		CBLACK=14, 
		CWHITE= 15, 
		CREAM=2.5,
		NAME=2.75;

		System.out.println("Elija un sabor (manzana, fresa o chocolate):");
		flavour = Ejercicio27_4_Methods.stringValido3OpcionesMinusculas("manzana", "fresa", "chocolate");
		if(flavour.equals("chocolate")) {
		System.out.println("¿Qué tipo de chocolate quiere? (negro o blanco):");
		chocolate = Ejercicio27_4_Methods.string2Opciones("negro", "blanco");
		}
		System.out.println("¿Quiere nata? (si o no):");
		cream = Ejercicio27_4_Methods.string2Opciones("si", "no");
		
		System.out.println("¿Quiere ponerle un nombre? (si o no):");
		name = Ejercicio27_4_Methods.string2Opciones("si", "no");
		
		if (flavour.equals("manzana")){
			System.out.println("Tarta de manzana: "+PRICEAPPLE+"€");
			price += PRICEAPPLE;
		} else if (flavour.equals("fresa")) {
			System.out.println("Tarta de fresa: "+PRICESTRAWBERRY+"€");
			price += PRICESTRAWBERRY;
		} else {
			if (chocolate) {
				System.out.println("Tarta de chocolate negro: "+CBLACK+"€");
				price += CBLACK;
			} else {
				System.out.println("Tarta de chocolate blanco: "+CWHITE+"€");
				price += CWHITE;
			}
		}

	
		if (cream) {
			System.out.println("Con nata: "+CREAM+"€");
			price += CREAM;
		}
		
		if (name) {
			System.out.println("Con nombre: "+NAME+"€");
			price += NAME;
		}
		System.out.println("Total: "+price+"€");

	}

}
