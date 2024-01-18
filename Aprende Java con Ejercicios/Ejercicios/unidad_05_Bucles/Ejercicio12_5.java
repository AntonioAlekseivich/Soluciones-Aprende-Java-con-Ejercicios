package unidad_05_Bucles;

public class Ejercicio12_5 {

	public static void main(String[] args) {
		/*Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
introducir por teclado.*/
int num1 = 1,num2=1, numAux=0;
System.out.println(0);

for(int i = 0; i<10;i++) {
	System.out.println(num1);
	numAux=num1+num2;
	num1=num2;
	num2=numAux;
	
}
	}

}
