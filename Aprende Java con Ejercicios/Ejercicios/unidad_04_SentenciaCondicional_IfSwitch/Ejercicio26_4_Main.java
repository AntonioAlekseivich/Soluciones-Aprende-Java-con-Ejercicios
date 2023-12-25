package unidad_04_SentenciaCondicional_IfSwitch;

public class Ejercicio26_4_Main {

	public static void main(String[] args) {
		/*Realiza un programa que calcule el precio de unas entradas de cine en función
del número de personas y del día de la semana. El precio base de una entrada
son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los
jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
1 individual que son 41 euros (33 + 8).*/
final int PRECIOBASE = 8, PRECIOBASEMIERCOLES = 5, PRECIOPAREJA = 11;
int  numPersonas,numPareja;
double precioIndividual = 0, precioTotal, descuento=0, pagar;
String dia;
boolean tarjeta;

System.out.println("Venta de entradas CineCampa");
System.out.println("Numero de entradas:");
numPersonas =  Ejercicio26_4_Methods.inputAtLeast(1);

System.out.println("Dia de la semana:");
dia =  Ejercicio26_4_Methods.diaSemanaValidoMinuscula();

System.out.println("Tiene tarjeta CineCampa? (s/n)");
tarjeta= Ejercicio26_4_Methods.sn();


	switch (dia) {
	case "miercoles":
		precioIndividual = PRECIOBASEMIERCOLES ;
		precioTotal = precioIndividual*numPersonas;
		if(tarjeta) {
			descuento = precioTotal*0.1;
		}
		pagar = precioTotal - descuento;
		System.out.println("Aqui tiene sus entradas. Gracias por su compra.");
		System.out.println("Entradas individuales: "+numPersonas);
		System.out.println("Precio por entrada individual: "+ precioIndividual);
		System.out.println("Total: "+precioTotal);
		System.out.println("Descuento: "+descuento);
		System.out.println("A pagar: " +pagar);
		break;
	case "jueves":
		
		if (numPersonas % 2 ==0) {
			numPareja = numPersonas/2;
			precioTotal = numPareja*11;
			
			if(tarjeta) {
				descuento = precioTotal*0.1;
			}
			pagar = precioTotal - descuento;
			System.out.println("Aqui tiene sus entradas. Gracias por su compra.");
			System.out.println("Entradas de parejas: "+numPareja);
			System.out.println("Precio por entrada de pareja: "+ PRECIOPAREJA);
			System.out.println("Total: "+precioTotal);
			System.out.println("Descuento: "+descuento);
			System.out.println("A pagar: " +pagar);
		} else {
			numPareja = numPersonas/2;
			precioTotal = numPareja*11;
			precioTotal += PRECIOBASE;
			
			if(tarjeta) {
				descuento = precioTotal*0.1;
			}
			pagar = precioTotal - descuento;
			System.out.println("Aqui tiene sus entradas. Gracias por su compra.");
			System.out.println("Entradas de parejas: "+numPareja);
			System.out.println("Precio por entrada de pareja: "+ PRECIOPAREJA);
			System.out.println("Entradas individuales: 1");
			System.out.println("Precio por entrada individual: "+ PRECIOBASE);
			System.out.println("Total: "+precioTotal);
			System.out.println("Descuento: "+descuento);
			System.out.println("A pagar: " +pagar);
		}
		break;
	default:
		precioIndividual = PRECIOBASE ;
		precioTotal = PRECIOBASE*numPersonas;
		
		if(tarjeta) {
			descuento = precioTotal*0.1;
		}
		pagar = precioTotal - descuento;
		System.out.println("Aqui tiene sus entradas. Gracias por su compra.");
		System.out.println("Entradas individuales: "+numPersonas);
		System.out.println("Precio por entrada individual: "+ precioIndividual);
		System.out.println("Total: "+precioTotal);
		System.out.println("Descuento: "+descuento);
		System.out.println("A pagar: " +pagar);
		
	}
	
	
	
	
	
	

	
	}
}

