package unidad_07_Array.Unidimensionales;
import java.util.Scanner;

public class Ejercicio08_7 {

	public static void main(String[] args) {
		/* Realiza un programa que pida la temperatura media que ha hecho en cada mes
		de un determinado año y que muestre a continuación un diagrama de barras
		horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
		de asteriscos o cualquier otro carácter*/

		Scanner s = new Scanner(System.in);
		String [] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		int [] temp = new int [12];//declaramos un array para cada dato
		
		for (int i=0; i<12; i++) {//pedimos los datos
			System.out.println("Introduce la temperatura media del mes de "+mes[i]);
			temp[i] = s.nextInt();
		}
		
		for (int i=0; i<12; i++) {//los imprimimos
			System.out.println(mes[i]+":");
				while(temp[i]>0) {
					System.out.print("-");
					temp[i]--;
				}
				System.out.println();//salto de linea
		}
	}

}
