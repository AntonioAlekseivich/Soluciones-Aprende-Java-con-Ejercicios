package unidad_04_SentenciaCondicional_IfSwitch;

public class Ejercicio24_4_Main {

	public static void main(String[] args) {
		/*Escribe un programa que genere la nómina (bien desglosada) de un empleado
según las siguientes condiciones:
• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
de proyecto), los días que ha estado de viaje visitando clientes durante el
mes y su estado civil (1 - Soltero, 2 - Casado).
• El sueldo base según el cargo es de 950, 1200 y 1600 euros según
si se trata de un prog. junior, un prog. senior o un jefe de proyecto
respectivamente.
• Por cada día de viaje visitando clientes se pagan 30 euros extra en
concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
un 25% en caso de estar soltero y un 20% en caso de estar casado.*/
		int rank, dTrip, mStatus, irpf;
		double baseSalary, diets, bruteSalary, retentionIrpf, finalSalary;
		
System.out.println("1 - Programador junior\r\n"
		+ "2 - Prog. senior\r\n"
		+ "3 - Jefe de proyecto\r\n"
		+ "Introduzca el cargo del empleado (1 - 3):");
	
	rank =  Ejercicio24_4_Methods.inputBetween2Num(1, 3);
	
System.out.println("¿Cuántos días ha estado de viaje visitando clientes?");
	dTrip= Ejercicio24_4_Methods.inputAtLeast(0);
	
	System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado):");
	mStatus =  Ejercicio24_4_Methods.inputBetween2Num(1, 2);
	
	baseSalary = Ejercicio24_4_Methods.calculateBaseSalary(rank);
	
	diets = Ejercicio24_4_Methods.calculateDiets(dTrip);
	bruteSalary =  Ejercicio24_4_Methods.calculateBruteSalary(baseSalary, diets);
	
	irpf =  Ejercicio24_4_Methods.calculateIrpf(mStatus);
	retentionIrpf =Ejercicio24_4_Methods.calculateRetention(irpf, bruteSalary); 
	
	finalSalary = Ejercicio24_4_Methods.calculateFinalSalary( bruteSalary, retentionIrpf);
	Ejercicio24_4_Methods.printNomina( baseSalary,   dTrip,  diets, bruteSalary,  mStatus,  irpf,  finalSalary,  retentionIrpf);
	}

}
