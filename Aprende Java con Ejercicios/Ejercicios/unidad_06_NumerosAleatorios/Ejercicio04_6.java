package unidad_06_NumerosAleatorios;

public class Ejercicio04_6 {

	public static void main(String[] args) {
		//Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
		
int numero;
int counter = 0;

while (counter<20) {//necesitamos un contador para correr el bucle 20 veces
	numero = (int)(Math.random()*11);//el math random debe estar dentro del bucle
	System.out.println(numero);
	System.out.println("");
	counter++;
}
System.out.println("He imprimido "+counter+" numeros");
	}

}
