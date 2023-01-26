package unidad_06_NumerosAleatorios;

public class Ejercicio08_6 {

	public static void main(String[] args) {
		/* Modifica el programa anterior para que la probabilidad de que salga un 1 sea
		de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
		2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.*/
		

		String local ="1";
		String empate ="X";
		String visitante ="2";
		int contadorColumna = 14;
		int numeroColor;
		int numeroPleno1;
		int numeroPleno2;
		
		do {
			numeroColor = (int)(Math.random()*6+1);
				if(numeroColor >= 1 && numeroColor <4) {
				System.out.printf("|\033[91m%5s\033[39;49m    |%5s    |%5s    |\n",local,empate,visitante);
				} else if (numeroColor >=4 && numeroColor < 6) {
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
