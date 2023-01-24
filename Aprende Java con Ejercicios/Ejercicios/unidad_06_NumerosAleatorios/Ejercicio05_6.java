package unidad_06_NumerosAleatorios;

public class Ejercicio05_6 {

	public static void main(String[] args) {
		/*Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
		separados por espacios. Muestra también el máximo, el mínimo y la media
		de esos números.*/
		
int numeros;
int counter = 0;
int suma = 0;
int media;
int max = 100;
int min = 199;
//primero hay que hacer loop para imprimir los 50 numeros
while(counter<50) {
	numeros = (int)(Math.random()*99)+100;//asignamos un int aleatorio entre 100 y 99
	counter++;
	suma = suma += numeros;
	System.out.print(numeros+" ");//los imprimimos
	
	if (max<numeros){
		max = numeros;
	}
	if (min>numeros) {
		min = numeros;
	}
	
	
}
System.out.printf("\nNumeros impresos: "+counter);
media = suma/counter;
System.out.printf("\nla media de esos numeros es "+media);
System.out.printf("\nEl maximo numero que se ha imprimo es %,d. Y el minimo es %,d.",max,min);



	}

}
