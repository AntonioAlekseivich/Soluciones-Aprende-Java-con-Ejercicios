package unidad_05_Bucles;
import java.util.Scanner;

public class Ejercicio07_5 {

	public static void main(String[] args) {
		/* Realiza el control de acceso a una caja fuerte. La combinación será un
		número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
		acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
		y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
		Tendremos cuatro oportunidades para abrir la caja fuerte*/
		
//input: int clave
/*output: si int claveUsuario coincide con int clave correcta abrimos y cerramos
 		si no coinciden damos otra oportunidad y restamos 1 a oportunidades
  		si llegamos oportunidades = 0 cerramos. */

/*variables: int claveCorrecta
			 int claveUsuario
			 int contadorIntentos
*/

//declaramos las variables
		Scanner s = new Scanner(System.in);
		int claveCorrecta = 2740;
		int claveUsuario;
		int contadorIntentos = 4;
		
//comenzamos el bucle
		while(contadorIntentos>0) {//comprobamos que queden intentos
			System.out.println("Introduzca la contraseña.");
			claveUsuario = s.nextInt();
			if (claveUsuario == claveCorrecta) {
				System.out.println("Contraseña correcta.");
				break;//si la contraseña es correcta salimos del bucle
				
			} else {
				System.out.println("Contraseña incorrecta.");
				contadorIntentos = contadorIntentos - 1 ;//en caso contrario restamos 1 intento
				
				if(contadorIntentos > 1){//si nos quedan varios intentos decimos cuantos
				System.out.println("Te quedan "+contadorIntentos+" intentos.");
				} else if (contadorIntentos == 1) {//si solo uno, lo decimos en singular
					System.out.println("Te queda 1 intento.");
				}
			}
			if(contadorIntentos == 0) {//cuando llegamos a 0, damos el mensaje de sistema bloqueado
				System.out.println("Sistema bloqueado.");
			}
		}

	}

}
