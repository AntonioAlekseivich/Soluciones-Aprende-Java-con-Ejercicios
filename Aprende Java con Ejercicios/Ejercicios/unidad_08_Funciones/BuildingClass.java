package unidad_08_Funciones;

import java.util.Arrays;

public class BuildingClass {

	public static void main(String[] args) {
		// esCapicua

		int x = 2441;//el numero a comprobar
		
		
		int nDigitos = 0;
		int u = x;//calculamos cuantos digitos tiene x
		while(u>0) {
			u = u/10;
			nDigitos++;
		}

		int [] digitos = new int [nDigitos];//declaramos los 2 arrays que vamos a usar
		int [] digitosInv = new int [nDigitos];
		
		
		for (int i=0; i < nDigitos; i++) {//atribuimos los digitos de x al array digitos
			digitos [i] = x%10;
			x = x/10;
		}
		
		int k = 0;
		for (int i = (nDigitos - 1); i>=0; i--) {//creamos el array invertido
		digitosInv[k] = digitos[i];
		k++;
		}
		
		if (Arrays.equals(digitos, digitosInv)) {//comparamos los arrays
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		
	}
}
