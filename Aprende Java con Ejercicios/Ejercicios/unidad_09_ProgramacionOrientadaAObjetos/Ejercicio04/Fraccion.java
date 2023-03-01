package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio04;

public class Fraccion {
	//Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de los
	//métodos pueden ser invierte, simplifica, multiplica, divide, etc.

	//Atributos
	public static int numerador;
	public static int denominador;
	
	//Metodos
		//invirte
		public static int[] invierte(int numerador, int denominador ) {
			int temp;
			temp = denominador;
			denominador = numerador;
			numerador = temp;
			int [] result = {numerador, denominador};
			return result;
		}
		//simplifica
		public static int[] simplifica(int numerador, int denominador ) {
			int gcd;
			   if (denominador == 0) {
			        gcd = numerador;
			    } else {
			         gcd = (numerador % denominador);
			    }
			    int[] result = {numerador / gcd, denominador / gcd};
			    return result;
		}
		
}
