package unidad_06_NumerosAleatorios;

public class Ejercicio01_6 {

	public static void main(String[] args) {
		/*Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
		también la suma total (los puntos que suman entre los tres dados).*/

		
int dadoPrimero;
int dadoSegundo;
int dadoTercero;
int suma;
		
		//un nº aleatorio para cada dado
		dadoPrimero = (int)(Math.random()*6) + 1;
		System.out.println("Primer dado: "+dadoPrimero);
		
		dadoSegundo = (int)(Math.random()*6) + 1;
		System.out.println("Segundo dado: "+dadoSegundo);
		
		dadoTercero = (int)(Math.random()*6) + 1;
		System.out.println("Tercer dado: "+dadoTercero);
		
		 suma = dadoPrimero + dadoSegundo + dadoTercero;//los sumamos
		 
		 System.out.println("la suma de los tres dados es: "+suma);
				}

}
