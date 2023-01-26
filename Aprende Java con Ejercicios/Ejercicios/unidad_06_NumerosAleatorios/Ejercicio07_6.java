package unidad_06_NumerosAleatorios;

public class Ejercicio07_6 {

	public static void main(String[] args) {
		// Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
		//para los 14 partidos y el pleno al quince (15 filas)
		
		String local ="1";
		String empate ="X";
		String visitante ="2";
		int contadorColumna = 14;
		int numeroColor;
		int numeroPleno1;
		int numeroPleno2;
		
		do {
			numeroColor = (int)(Math.random()*3+1);
				if(numeroColor == 1) {
				System.out.printf("|\033[91m%5s\033[39;49m    |%5s    |%5s    |\n",local,empate,visitante);
				} else if (numeroColor == 2) {
				System.out.printf("|%5s    |\033[91m%5s\033[39;49m    |%5s    |\n",local,empate,visitante);
				} else {
				System.out.printf("|%5s    |%5s    |\033[91m%5s\033[39;49m    |\n",local,empate,visitante);
				}
		contadorColumna = contadorColumna -1;
		}while(contadorColumna >0);

		String cero;
		String uno;
		String dos;
		String m;
		
		numeroPleno1 = (int)(Math.random()*4+1);
		if (numeroPleno1 == 1) {
			cero = "0";
			uno = "1";
			dos = "2";
			m = "\u001B[31m"+"M"+"\u001B[0m";
			
			System.out.printf("\nEquipo 1:"+cero+" "+uno+" "+dos+" "+m);
		} else if (numeroPleno1 == 2) {
			cero = "0";
			uno = "1";
			dos = "\u001B[31m"+"2"+"\u001B[0m";
			m = "M";
			System.out.printf("\nEquipo 1:"+cero+" "+uno+" "+dos+" "+m);
		}else if (numeroPleno1 == 3) {
			cero = "0";
			uno = "\u001B[31m"+"1"+"\u001B[0m";
			dos = "2";
			m = "M";
			System.out.printf("\nEquipo 1:"+cero+" "+uno+" "+dos+" "+m);
		}else if (numeroPleno1 == 4) {
			cero = "\u001B[31m"+"0"+"\u001B[0m";
			uno = "1";
			dos = "2";
			m = "M";
			System.out.printf("\nEquipo 1:"+cero+" "+uno+" "+dos+" "+m);
		}
		numeroPleno2 = (int)(Math.random()*4+1);
		if (numeroPleno2 == 1) {
			cero = "0";
			uno = "1";
			dos = "2";
			m = "\u001B[31m"+"M"+"\u001B[0m";
			
			System.out.printf("	Equipo 2:"+cero+" "+uno+" "+dos+" "+m);
		} else if (numeroPleno2 == 2) {
			cero = "0";
			uno = "1";
			dos = "\u001B[31m"+"2"+"\u001B[0m";
			m = "M";
			System.out.printf("	Equipo 2:"+cero+" "+uno+" "+dos+" "+m);
		}else if (numeroPleno2 == 3) {
			cero = "0";
			uno = "\u001B[31m"+"1"+"\u001B[0m";
			dos = "2";
			m = "M";
			System.out.printf("	Equipo 2:"+cero+" "+uno+" "+dos+" "+m);
		}else if (numeroPleno2 == 4) {
			cero = "\u001B[31m"+"0"+"\u001B[0m";
			uno = "1";
			dos = "2";
			m = "M";
			System.out.printf("	Equipo 2:"+cero+" "+uno+" "+dos+" "+m);
		}
		
	}
}
