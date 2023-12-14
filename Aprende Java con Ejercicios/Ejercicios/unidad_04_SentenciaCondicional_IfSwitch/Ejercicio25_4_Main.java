package unidad_04_SentenciaCondicional_IfSwitch;
import java.util.Scanner;
public class Ejercicio25_4_Main {

	public static void main(String[] args) {
		/*La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
máxima calidad y nos ha pedido hacer un configurador que calcule el precio
según el alto y el ancho. El precio base de una bandera es de un céntimo de
euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
son 3.25 €. El IVA ya está incluido en todas las tarifas.*/
		Scanner sInt = new Scanner(System.in);
		Scanner sString = new Scanner(System.in);
		
		int altura, anchura, cm2;
		final double ESCUDOPRICE=2.5,ENVIO=3.25;
		double price, totalPrice;
		boolean escudo;
		
System.out.println("Introduzca la altura de la bandera en cm:");
altura = Ejercicio25_4_Methods.inputAtLeast(1);

System.out.println("Ahora introduzca la anchura:");
anchura = Ejercicio25_4_Methods.inputAtLeast(1);

System.out.println("¿Quiere escudo bordado? (s/n):");
escudo = Ejercicio25_4_Methods.sn();

cm2 = Ejercicio25_4_Methods.calculateCm2( altura,  anchura);
price =  Ejercicio25_4_Methods.calculatePrice(cm2);
totalPrice = Ejercicio25_4_Methods.calculateTotalPrice(ESCUDOPRICE, ENVIO, escudo, price);

System.out.println("Gracias. Aquí tiene el desglose de su compra.");
System.out.println("Bandera de "+cm2+": "+price+"€");
if (escudo) {
	System.out.println("Con escudo: "+ ESCUDOPRICE+"€");
} else {
	System.out.println("Sin escudo: 0.00€");
}
System.out.println("Gastos de envio: "+ENVIO+"€.\n"
		+ "Total: "+ totalPrice+ "€.");
	}

}
