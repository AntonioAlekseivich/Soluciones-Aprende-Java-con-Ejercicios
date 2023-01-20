package unidad_03_LecturaDeDatosDesdeTeclado;
import java.util.Scanner;
public class Ejercicio08_3 {

	public static void main(String[] args) {
		//Salario semanal a partir de horas trabajadas;
		//1hora = 12€;
		//horasSemana
		
Scanner s = new Scanner(System.in);

int horasSemana;
int sueldoSemana;

int sueldoHora = 12;

System.out.println("¿Cuántas horas ha trabajado esta semana?");
horasSemana = s.nextInt();

sueldoSemana = horasSemana*sueldoHora;

System.out.println("Su salario semanal es de "+sueldoSemana+"€.");
	}

}
