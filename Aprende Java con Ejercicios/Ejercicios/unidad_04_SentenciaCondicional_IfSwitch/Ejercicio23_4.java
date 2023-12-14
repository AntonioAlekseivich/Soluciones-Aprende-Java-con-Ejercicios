package unidad_04_SentenciaCondicional_IfSwitch;
import java.util.Scanner;

public class Ejercicio23_4 {

	public static void main(String[] args) {
		/*Escribe un programa que calcule el precio final de un producto según su
base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
reducido o superreducido) y el código promocional. Los tipos de IVA general,
reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
respectivamente que no se aplica promoción, el precio se reduce a la mitad,
se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
muestran los valores correctos, aunque los números no estén tabulados.*/

		/*Ejemplo:
Introduzca la base imponible: 25
Introduzca el tipo de IVA (general, reducido o superreducido): reducido
Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
Base imponible 25.00
IVA (10%) 2.50
Precio con IVA 27.50
Cód. promo. (mitad): -13.75
TOTAL 13.75*/
		
		
		final double IVAGENERAL = 0.21, IVAREDUCIDO = 0.10, IVASUPERREDUCIDO = 0.04;
		final double CODNOPRO = 0, CODMITAD = 0.5, CODMENO5 = 5, COD5PORC = 0.05;
		
		Scanner sInt = new Scanner (System.in);
		Scanner sString = new Scanner (System.in);
		
		String ivaInput, codPromocionalInput;
		double bImponible, precio, descuento = 0, iva=0;
		
		boolean ivaFlag=false, codFlag = false;
		
		
		System.out.println("Introduzca la base imponible: ");
		bImponible = sInt.nextDouble();
		
		
		
		do {
		System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido):");
		ivaInput = sString.nextLine();
		
		if (ivaInput.equals("general")) {
			iva = bImponible * IVAGENERAL;
			ivaFlag=true;
		} else if (ivaInput.equals("reducido")) {
			iva = bImponible * IVAREDUCIDO;
			ivaFlag=true;
		} else if (ivaInput.equals("superreducido")) {
			iva = bImponible * IVASUPERREDUCIDO;
			ivaFlag=true;
		}
		else {
			System.out.println("valor IVA no valido.");
		}
		}while (!ivaFlag);
		precio = bImponible+iva;
		
		do {
		System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc):");
		codPromocionalInput = sString.nextLine();
		
		if (codPromocionalInput.equals("mitad")) {
			descuento = precio * CODMITAD;
			codFlag=true;
		} else if (codPromocionalInput.equals("meno5")) {
			descuento = CODMENO5;
			codFlag=true;
		} else if (codPromocionalInput.equals("5porc")) {
			descuento = precio * COD5PORC;
			codFlag=true;
		}
		else {
			System.out.println("valor codPromocional no valido.");
		}
		}while (!codFlag);
		
		System.out.println("Base imponible: "+bImponible);
		
		if (ivaInput.equals("general")) {
			System.out.println("IVA (21%) "+ iva);
		} else if (ivaInput.equals("reducido")) {
			System.out.println("IVA (10%) " +iva);
		} else {
			System.out.println("IVA (40%) "+iva);
		}
		
		System.out.println("Precio con IVA "+precio);
		
		System.out.println("Cód. promo. ("+codPromocionalInput+"): -"+descuento);
		precio -= descuento;
		System.out.println("TOTAL "+ precio);
	}
}

