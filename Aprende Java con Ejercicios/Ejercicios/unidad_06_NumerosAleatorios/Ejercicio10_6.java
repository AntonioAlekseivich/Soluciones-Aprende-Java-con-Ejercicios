package unidad_06_NumerosAleatorios;

public class Ejercicio10_6 {

	public static void main(String[] args) {
		/*Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
		El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
		de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
		entre 1 y 40 caracteres.*/

//este codigo lo he escrito yo, pero una IA me ha dado una respuesta mas corta:
		
		/*for (int i = 0; i < 10; i++) {
		    int randomCharacter = (int)(Math.random()*6) + 1;
		    int lineLength = (int)(Math.random()*40) + 1;
		    for (int j = 0; j < lineLength; j++) {
		        switch (randomCharacter) {
		            case 1:
		                System.out.print("*");
		                break;
		            case 2:
		                System.out.print("-");
		                break;
		            case 3:
		                System.out.print("=");
		                break;
		            case 4:
		                System.out.print(".");
		                break;
		            case 5:
		                System.out.print("|");
		                break;
		            case 6:
		                System.out.print("@");
		                break;
		        }
		    }
		    System.out.println();
		}*/
		//10 de cada cosa, para 10 lineas
		String caracter1 = "";//declaramos string para el caracter que se imprima
		String caracter2 = "";
		String caracter3 = "";
		String caracter4 = "";
		String caracter5 = "";
		String caracter6 = "";
		String caracter7 = "";
		String caracter8 = "";
		String caracter9 = "";
		String caracter10 = "";
		
		int tipoCaracter1;//un int aleatorio para atribuir el numero del caracter y otra 
		int lineaLongitud1;//la longitud de la linea
		
		int tipoCaracter2;
		int lineaLongitud2;
		
		int tipoCaracter3;
		int lineaLongitud3;
		
		int tipoCaracter4;
		int lineaLongitud4;
		
		int tipoCaracter5;
		int lineaLongitud5;
		
		int tipoCaracter6;
		int lineaLongitud6;
		
		int tipoCaracter7;
		int lineaLongitud7;
		
		int tipoCaracter8;
		int lineaLongitud8;
		
		int tipoCaracter9;
		int lineaLongitud9;
		
		int tipoCaracter10;
		int lineaLongitud10;
		
//primera linea
		
		 tipoCaracter1 = (int)(Math.random()*6)+1;
			switch (tipoCaracter1){//con este switch sacamos el caracter
			case 1:
				caracter1 += "*";
				break;
			case 2:
				caracter1 += "-";
				break;
			case 3:
				caracter1 += "=";
				break;
			case 4:
				caracter1 += ".";
				break;
			case 5:
				caracter1 += "|";
			case 6: 
				caracter1 += "@";
				break;
			}
			
		 lineaLongitud1 = (int)(Math.random()*40)+1;//con este bucle imprimimos la linea
		System.out.println(lineaLongitud1);
		do {
			System.out.print(caracter1);
			lineaLongitud1 --;
		}while (lineaLongitud1>0);
		
		
//segunda linea
		 tipoCaracter2 = (int)(Math.random()*6)+1;//lo repetimos 10 veces.
		switch (tipoCaracter2){
		case 1:
			caracter2 += "*";
			break;
		case 2:
			caracter2 += "-";
			break;
		case 3:
			caracter2 += "=";
			break;
		case 4:
			caracter2 += ".";
			break;
		case 5:
			caracter2 += "|";
		case 6: 
			caracter2 += "@";
			break;
		}
		
		

	 lineaLongitud2 = (int)(Math.random()*40)+1;
	System.out.println("\n"+lineaLongitud2);
	do {
		System.out.print(caracter2);
		lineaLongitud2 --;
	}while (lineaLongitud2>0);
	
//tercera linea		
		
	 tipoCaracter3 = (int)(Math.random()*6)+1;
		switch (tipoCaracter3){
		case 1:
			caracter3 += "*";
			break;
		case 2:
			caracter3 += "-";
			break;
		case 3:
			caracter3 += "=";
			break;
		case 4:
			caracter3 += ".";
			break;
		case 5:
			caracter3 += "|";
		case 6: 
			caracter3 += "@";
			break;
		}
		
		

	 lineaLongitud3 = (int)(Math.random()*40)+1;
	System.out.println("\n"+lineaLongitud3);
	do {
		System.out.print(caracter3);
		lineaLongitud3 --;
	}while (lineaLongitud3>0);
	
//cuarta linea
	
	 tipoCaracter4 = (int)(Math.random()*6)+1;
		switch (tipoCaracter4){
		case 1:
			caracter4 += "*";
			break;
		case 2:
			caracter4 += "-";
			break;
		case 3:
			caracter4 += "=";
			break;
		case 4:
			caracter4 += ".";
			break;
		case 5:
			caracter4 += "|";
		case 6: 
			caracter4 += "@";
			break;
		}
		
		

	 lineaLongitud4 = (int)(Math.random()*40)+1;
	System.out.println("\n"+lineaLongitud4);
	do {
		System.out.print(caracter4);
		lineaLongitud4 --;
	}while (lineaLongitud4>0);
	
	
//quinta linea
	 tipoCaracter5 = (int)(Math.random()*6)+1;
		switch (tipoCaracter5){
		case 1:
			caracter5 += "*";
			break;
		case 2:
			caracter5 += "-";
			break;
		case 3:
			caracter5 += "=";
			break;
		case 4:
			caracter5 += ".";
			break;
		case 5:
			caracter5 += "|";
		case 6: 
			caracter5 += "@";
			break;
		}
		
		

	 lineaLongitud5 = (int)(Math.random()*40)+1;
	System.out.println("\n"+lineaLongitud5);
	do {
		System.out.print(caracter5);
		lineaLongitud5 --;
	}while (lineaLongitud5>0);
	
//sexta linea
	 tipoCaracter6 = (int)(Math.random()*6)+1;
		switch (tipoCaracter6){
		case 1:
			caracter6 += "*";
			break;
		case 2:
			caracter6 += "-";
			break;
		case 3:
			caracter6 += "=";
			break;
		case 4:
			caracter6 += ".";
			break;
		case 5:
			caracter6 += "|";
		case 6: 
			caracter6 += "@";
			break;
		}
		
		

	 lineaLongitud6 = (int)(Math.random()*40)+1;
	System.out.println("\n"+lineaLongitud6);
	do {
		System.out.print(caracter6);
		lineaLongitud6 --;
	}while (lineaLongitud6>0);
	
//septima linea
	 tipoCaracter7 = (int)(Math.random()*6)+1;
		switch (tipoCaracter7){
		case 1:
			caracter7 += "*";
			break;
		case 2:
			caracter7 += "-";
			break;
		case 3:
			caracter7 += "=";
			break;
		case 4:
			caracter7 += ".";
			break;
		case 5:
			caracter7 += "|";
		case 6: 
			caracter7 += "@";
			break;
		}
		
		

	 lineaLongitud7 = (int)(Math.random()*40)+1;
	System.out.println("\n"+lineaLongitud7);
	do {
		System.out.print(caracter7);
		lineaLongitud7 --;
	}while (lineaLongitud7>0);
	
//octava linea
	tipoCaracter8 = (int)(Math.random()*6)+1;
	switch (tipoCaracter8){
	case 1:
		caracter8 += "*";
		break;
	case 2:
		caracter8 += "-";
		break;
	case 3:
		caracter8 += "=";
		break;
	case 4:
		caracter8 += ".";
		break;
	case 5:
		caracter8 += "|";
	case 6: 
		caracter8 += "@";
		break;
	}
	
	

 lineaLongitud8 = (int)(Math.random()*40)+1;
System.out.println("\n"+lineaLongitud8);
do {
	System.out.print(caracter8);
	lineaLongitud8 --;
}while (lineaLongitud8>0);

//novena linea
tipoCaracter9 = (int)(Math.random()*6)+1;
switch (tipoCaracter9){
case 1:
	caracter9 += "*";
	break;
case 2:
	caracter9 += "-";
	break;
case 3:
	caracter9 += "=";
	break;
case 4:
	caracter9 += ".";
	break;
case 5:
	caracter9 += "|";
case 6: 
	caracter9 += "@";
	break;
}



lineaLongitud9 = (int)(Math.random()*40)+1;
System.out.println("\n"+lineaLongitud9);
do {
System.out.print(caracter9);
lineaLongitud9 --;
}while (lineaLongitud9>0);

//decima linea
tipoCaracter10 = (int)(Math.random()*6)+1;
switch (tipoCaracter10){
case 1:
	caracter10 += "*";
	break;
case 2:
	caracter10 += "-";
	break;
case 3:
	caracter10 += "=";
	break;
case 4:
	caracter10 += ".";
	break;
case 5:
	caracter10 += "|";
case 6: 
	caracter10 += "@";
	break;
}



lineaLongitud10 = (int)(Math.random()*40)+1;
System.out.println("\n"+lineaLongitud10);
do {
System.out.print(caracter10);
lineaLongitud10 --;
}while (lineaLongitud10>0);
	}

}
