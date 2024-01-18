package unidad_05_Bucles;

public class Ejercicio13_5 {

	public static void main(String[] args) {
		/*Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.*/
		String positivos="", negativos="";
		int [] lista = {1,2,4,1,-4,1,5,-7,-4,9};
		for (int i = 0;i < lista.length ;i++) {
			if (lista[i]>0) {
				positivos+=lista[i]+" ";
			} else {
				negativos+=lista[i]+" ";
			}
		}
		System.out.println(positivos);
		System.out.println(negativos);

	}

}
