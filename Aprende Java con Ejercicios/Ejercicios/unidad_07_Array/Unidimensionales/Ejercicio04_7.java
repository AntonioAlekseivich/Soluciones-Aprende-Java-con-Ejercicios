package unidad_07_Array.Unidimensionales;

public class Ejercicio04_7 {

	public static void main(String[] args) {
		/*Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
		y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
		cuadrado se deben almacenar los cuadrados de los valores que hay en el array
		numero. En el array cubo se deben almacenar los cubos de los valores que hay en
		numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
		columnas*/
		
int [] numero = new int [20];	
int [] cuadrado = new int [20];	
int [] cubo = new int [20];	

for(int i = 0; i < 20; i++) {//atribuimos a los 20 valores de numero nº aleatorios entre 0 y 100
	
	numero[i] = (int) (Math.random()*101);
	cuadrado[i] = numero[i]*numero[i];
	cubo[i] = numero[i]*numero[i]*numero[i];
	System.out.println(numero[i]+" "+cuadrado[i]+" "+cubo[i]);//lo metemos todo en el mismo bucle
	//no pudemos usar las variables fuera del bucle
		}

	}
}
