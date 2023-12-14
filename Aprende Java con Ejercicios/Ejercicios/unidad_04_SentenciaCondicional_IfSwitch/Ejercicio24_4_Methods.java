package unidad_04_SentenciaCondicional_IfSwitch;
import java.util.Scanner;

public class Ejercicio24_4_Methods {
	
	public static int inputBetween2Num(int a, int b) {
		/**Valida que un valor introducido por teclado este 
		 * comprendido en un tramo determinado.
		 * Valores limites incluidos.
		 * 
		 * @param: int a: valor inicial
		 * @param:int b: valor final
		 * @return:int input: Valor comprendido entre esos 2.
		 */
		Scanner s = new Scanner(System.in);

		int input = 0;
		do {

		input = s.nextInt();
		if (input < a || input > b) {
			System.out.println("valor no valido");

		}
		} while (input<a||input>b);
		return input;
	}

	public static int inputAtLeast(int min) {
		/**Valida que un valor sea como minimo un num introducido.
		 * valor limite incluido
		 * 
		 * @param: int min: valor inicial
		 * @return:int input: Valor por encima del param.
		 */
		Scanner s = new Scanner(System.in);

		int input = 0;
		do {

		input = s.nextInt();
		if (input < min) {
			System.out.println("valor no valido");
		}
		} while ((input<min));
		return input;
	}

public static double calculateBaseSalary(int rank) {
	double baseSalary;
	if (rank == 1) {
		baseSalary = 950;
	} else if (rank == 2) {
		baseSalary = 1200;
	}else {
		baseSalary = 1600;
	}
	return baseSalary;
}

public static double calculateDiets(int dTrip) {
	double diets = dTrip*30;
	return diets;
}

public static double calculateBruteSalary(double baseSalary, double diets) {
	baseSalary+=diets;
	return baseSalary;
}

public static int calculateIrpf(int mStatus) {
	int irpf;
	if (mStatus == 1) {
		irpf =25;
	} else {
		irpf = 20;
	}
	return irpf;
}

public static double calculateRetention(int irpf,double bruteSalary) {
	double irpfRetention= bruteSalary * (irpf/100.0);
	
	return irpfRetention;
}

public static double calculateFinalSalary(double bruteSalary, double irpfRetention) {
	
	double finalSalary;
	
	finalSalary = bruteSalary - irpfRetention;
	return finalSalary;
	
}

public static void printNomina(double baseSalary,  int dTrip, double diets,double bruteSalary, int mStatus, double irpf, double finalSalary, double retentionIrpf) {
	
	
	System.out.println("Sueldo base: "+baseSalary+"\n"
			+ "Dietas "+"( "+dTrip+" viajes) "+diets+"\n"
			+ "-\n"
			+ "Sueldo bruto "+ bruteSalary +"\n"
			+ "Retencion IRPF ("+irpf+"%) "+ retentionIrpf +"\n"
			 + "-\n"
			+ "Sueldo neto  "+ finalSalary);
}
}
