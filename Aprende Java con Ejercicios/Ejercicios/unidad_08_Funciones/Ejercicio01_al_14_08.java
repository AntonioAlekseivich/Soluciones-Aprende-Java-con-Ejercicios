package unidad_08_Funciones;


public class Ejercicio01_al_14_08 {

	/**Metodo para pasar los digitos de un int a un array, se usa mucho.
	 * 
	 * @param int x 
	 * return digitos
	 */
	public static int[] getArray (int x) {

		int nDigitos = (Ejercicio01_al_14_08.digitos(x));//contamos los digitos

		int [] digitos = new int [nDigitos];//declaramos array

		for (int i=(nDigitos - 1); i >= 0; i--) {//atribuimos los digitos de x al array 
			digitos [i] = x%10;
			x = x/10;
		}
		return digitos;
	}

	/** 01_Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
	 * 
	 * @param x un número entero positivo
	 * @return <code>true</code> si el número es primo
	 * @return <code>false</code> en caso contrario
	 * 
	 * */
	public static boolean esCapicua(int x) {

		int u = (Ejercicio01_al_14_08.voltea(x));

		if (x == u) {//comparamos los ints
			return true;
		} else { 
			return false;
		}
	}

	/** 02_Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
	 * 
	 * @param x un número entero positivo
	 * @return <code>true</code> si el número es primo
	 * @return <code>false</code> en caso contrario
	 * 
	 * */
	public static boolean esPrimo(int x) {

		for (int i=1; i<=x; i++) {//recorremos todos los num posibles
			if(x%i==0 && i != 1 && i != x) {//Si al div entre ese numero el resto es 0, no es 1, y no es el mismo numero
				return false;//devolvemos false
			}
		}
		return true;//si no se entro en el if, es true
	}


	/** 03_Devuelve el menor primo que es mayor al número que se pasa como parámetro.
	 * 
	 * @param x un número entero positivo
	 * @return int primo siguiente al param
	 * 
	 * */
	public static int siguientePrimo (int x) {
		int nPrimo = 0;//iniciamos el primo

		while(nPrimo == 0) {
			x++;//incrementamos el param
			if(Ejercicio01_al_14_08.esPrimo(x)) {//si es primo lo atribuimos
				nPrimo = x;
			}
		}
		return nPrimo;
	}


	/** 04_Dada una base y un exponente devuelve la potencia.
	 * 
	 * @param x un número entero positivo de base
	 * @param x un número entero positivo de exponente
	 * 
	 * @return int potencia de resultado
	 * 
	 * */
	public static int potencia (int x, int y) {

		int potencia = (int) Math.pow(x, y);
		return potencia;
	}


	/** 05_Cuenta el número de dígitos de un número entero.
	 * 
	 * @param x un número entero positivo 
	 * 
	 * @return int nº digitos de x
	 * 
	 * */
	public static int digitos (int x) {

		int nDigitos = 0;

		while(x>0) {//mientras se puede, dividimos x entre 10
			x = x/10;
			nDigitos++;//x cada iteracion, sumamos 1
		}
		return nDigitos;
	}


	/** 06_Le da la vuelta a un número
	 * 
	 * @param x un número entero positivo 
	 * 
	 * @return int xVolteado
	 * 
	 * */
	public static int voltea (int x) {

		int nDigitos = (Ejercicio01_al_14_08.digitos(x));//calculamos el nº digitos
		int [] digitos = (Ejercicio01_al_14_08.getArray(x));//declaramos array con los digitos


		String resultado = "";//concatenamos en string
		for(int i = (nDigitos - 1); i >= 0; i--) {//en orden inverso
			resultado += digitos[i];
		}

		return Integer.parseInt(resultado);//pasamos a int
	}


	/** 07_Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha.
	 * 
	 * @param int x un número entero positivo 
	 * @param int n la posicion que vamos a comprobar
	 * 
	 * @return int k el numero en la posicion
	 * 
	 * */
	public static int digitoN (int x, int n) {

		int [] digitos = (Ejercicio01_al_14_08.getArray(x));//declaramos array con los digitos

		int k = digitos [n];
		return k;
	}


	/** 08_Da la posición de la primera ocurrencia de un dígito
	 *	dentro de un número entero. Si no se encuentra, devuelve -1.
	 * 
	 * @param int x un número entero positivo 
	 * @param int k el num que vamos a buscar
	 * 
	 * @return la posicion empezando por 0 y de izquierda a derecha.
	 * 
	 * */
	public static int posicionDeDigito (int x, int k) {

		int nDigitos = (Ejercicio01_al_14_08.digitos(x));//contamos los digitos
		int [] digitos = new int [nDigitos];//declaramos array

		for (int i=(nDigitos - 1); i >= 0; i--) {//atribuimos los digitos de x al array 
			digitos [i] = x%10;
			x = x/10;
		}
		for (int i=0; i<nDigitos; i++) {
			if ( digitos[i] == k) {
				return i;
			}
		} return -1;
	}

	/** 09_Le quita a un número n dígitos por detrás (por la derecha).
	 * 
	 * @param int x un número entero positivo 
	 * @param int n la cantidad que vamos a quitar
	 * 
	 * @return int con los digitos quitados
	 * 
	 * */
	public static int quitaPorDetras (int x, int n) {
		int [] digitos = (Ejercicio01_al_14_08.getArray(x));//Array de los digitos
		String resultado = "";//para poder concatenar el resultado

		for(int i = 0; i<(digitos.length - n); i++) {
			resultado += digitos [i];
		}
		return Integer.parseInt(resultado);
	}

	/** 10_Le quita a un número n dígitos por delante (por la izquierda).
	 * 
	 * @param int x un número entero positivo 
	 * @param int n la cantidad que vamos a quitar
	 * 
	 * @return int con los digitos quitados
	 * 
	 * */	
	public static int quitaPorDelante (int x, int n) {
		int [] digitos = (Ejercicio01_al_14_08.getArray(x));//Array de los digitos
		String resultado = "";//para poder concatenar el resultado

		for(int i = n; i<digitos.length; i++) {
			resultado += digitos [i];
		}
		return Integer.parseInt(resultado);
	}

	/** 11_Añade un dígito a un número por detrás.
	 * 
	 * @param int x un número entero positivo 
	 * @param int n digito que se va a pegar
	 * 
	 * @return int con x concatenado 
	 * 
	 * */	
	public static int pegaPorDetras (int x, int n) {

		String resultado = "" + x;//para poder concatenar el resultado
		resultado += n;
		return Integer.parseInt(resultado);
	}

	/** 12_Añade un dígito a un número por delante
	 * 
	 * @param int x un número entero positivo 
	 * @param int n digito que se va a pegar
	 * 
	 * @return int con x concatenado 
	 * 
	 * */	
	public static int pegaPorDelante (int x, int n) {
		String resultado = "" + x;//para poder concatenar el resultado
		resultado = n + resultado;
		return Integer.parseInt(resultado);
	}

	/** 13_Toma como parámetros las posiciones inicial y final
	 *	dentro de un número y devuelve el trozo correspondiente
	 * 
	 * @param int x un número entero positivo 
	 * @param int a primera posicion
	 * @param int b segunda posicion
	 * 
	 * @return int del trozo
	 * 
	 * */	
	public static int trozoDeNumero (int x, int a, int b) {

		String resultado = "";
		int [] digitos = (Ejercicio01_al_14_08.getArray(x));

		if (digitos.length<b || a>b) {//comprobamos que los valores sean validos
			return -1;
		}else {
			for(int i=(a-1); i<=(b-1); i++) {//recorremos los numeros validos
				resultado += digitos[i];//concatenamos
			}
			return Integer.parseInt(resultado);
		}
	}

	/** 14_Pega dos números para formar uno.
	 * 
	 * @param int x un número entero positivo 
	 * @param int u otro num entero positivo

	 * @return int concatenado de x y u
	 * 
	 * */	
	public static int juntaNumeros (int x, int u) {
		String num = Integer.toString(x);//parsing a string
		num += u ;//concatenamos u
		return Integer.parseInt(num);//devolvemos en int
	}

}


