package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio02_09;
import java.util.Scanner;
public class Main_Vehiculo {

	public static void main(String[] args) {

		//creamos los objetos
		Bicicleta bicicletaRoja = new Bicicleta("Pepe");
		Coche cocheVerde = new Coche("Manolo");

		//plantillas para llamar a los metodos
		/**
		 *bicicletaRoja.anda();
		 *
		 *bicicletaRoja.caballito();
		 *
		 *bicicletaRoja.kilometrajeBici();
		 *
		 *cocheVerde.anda();
		 *
		 *cocheVerde.quemarRueda();
		 *
		 *cocheVerde.kilometrajeCoche();
		 *
		 *bicicletaRoja.verKilometrajeTotal();
		 *}
		 */

		//imprimimos el menu
		System.out.printf("VEHÍCULOS");
		System.out.printf("\n==========");
		System.out.printf("\n1. Anda con la bicicleta");
		System.out.printf("\n2. Haz el caballito con la bicicleta");
		System.out.printf("\n3. Anda con el coche");
		System.out.printf("\n4. Quema rueda con el coche");
		System.out.printf("\n5. Ver kilometraje de la bicicleta");
		System.out.printf("\n6. Ver kilometraje del coche");
		System.out.printf("\n7. Ver kilometraje total");
		System.out.printf("\n8. Salir");
		System.out.printf("\nElige una opción (1-8):");

		//creamos scaner e int de la opcion escogida

		Scanner s = new Scanner(System.in);
		int x = s.nextInt();

		//bucle while para salir del programa en caso de 8
		while (x!=8) {
			
			//switch con las opciones
			switch (x) {
			case 1:
				bicicletaRoja.anda();
				System.out.printf("\nElige otra opción");
				x = s.nextInt();
				break;
			case 2:
				bicicletaRoja.caballito();
				System.out.printf("\nElige otra opción");
				x = s.nextInt();
				break;
			case 3:
				cocheVerde.anda();
				System.out.printf("\nElige otra opción");
				x = s.nextInt();
				break;
			case 4:
				cocheVerde.quemarRueda();
				System.out.printf("\nElige otra opción");
				x = s.nextInt();
				break;
			case 5:
				bicicletaRoja.kilometrajeBici();
				System.out.printf("\nElige otra opción");
				x = s.nextInt();
				break;
			case 6:
				cocheVerde.kilometrajeCoche();
				System.out.printf("\nElige otra opción");
				x = s.nextInt();
				break;
			case 7:
				bicicletaRoja.verKilometrajeTotal();
				System.out.printf("\nElige otra opción");
				x = s.nextInt();
				break;
			default:
				System.out.println("Opcion no valida");
				System.out.printf("\nElige otra opción");
				x = s.nextInt();
			}
		}
		System.out.println("Vemos");
	}
}