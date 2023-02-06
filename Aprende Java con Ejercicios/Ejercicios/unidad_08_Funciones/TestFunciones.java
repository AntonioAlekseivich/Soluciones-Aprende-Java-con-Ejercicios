package unidad_08_Funciones;

public class TestFunciones {

	public static void main(String[] args) {
		// esCapicua

		int x = 1312;
		int nDigitos = 0;

		//calculamos cuantos digitos tiene x
		int temp = x;

		while(temp>0) {
			temp = temp/10;
			nDigitos++;
		}

		int [] digitos = new int [nDigitos];
		
		digitos[0] = x;
		
		for (int i=0; i < nDigitos; i++) {//atribuimos los digitos de x al array digitos
			digitos [i] = x%10;
			x = x/10;
		}

		for ( int i=0 ; i< nDigitos; i++) {
			System.out.println(digitos[i]);
		}
		
		System.out.println();
		
		System.out.println(nDigitos);
		
		System.out.println();
		
		System.out.println(x);

	}

}
