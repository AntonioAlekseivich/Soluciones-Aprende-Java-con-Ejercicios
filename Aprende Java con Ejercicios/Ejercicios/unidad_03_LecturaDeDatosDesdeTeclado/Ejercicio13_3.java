package unidad_03_LecturaDeDatosDesdeTeclado;
import java.util.Scanner;

public class Ejercicio13_3 {

	public static void main(String[] args) {
		// Escribe un programa que ordene tres números enteros introducidos por teclado.
		Scanner s = new Scanner(System.in);
		
		int n1, n2, n3, p1=0, p2=0, p3=0;
		do {//bucle para pedir los valores y comprobar que no se repitan numeros
		System.out.println("Introduzca el primer numero");
		n1 = s.nextInt();
		System.out.println("Introduzca el segundo numero");
		n2 = s.nextInt();
		System.out.println("Introduzca el tercer numero");
		n3 = s.nextInt();

		if(n1==n2) {
		System.out.println("El primer numero es igual al segundo");//imprimimos la causa en caso de error	
		}else if(n1 == n3) {
			System.out.println("El primer numero es igual al tercero");		
		}else if( n2 == n3) {
			System.out.println("El segundo numero es igual al primero");	
		}
			System.out.println();
		}while(n1==n2 || n1 == n3 || n2 == n3);
		
		if(n1 > n2 && n1 > n3) {//pareja de casos en los que n1 es el mayor
			p1 = n1;
			
			if ( n2>n3) {//diferenciamos los 2 casos
				p2= n2;
				p3 = n3;
			} else {
				p2 = n3;
				p3 = n2;
			}
			
		} else if ( n2 > n1 && n2 > n3) {//... n2 es el mayor
			p1 = n2;
			
				if( n1 > n3) {
					p2 = n1;
					p3 = n3;
				} else  {
					p2 = n3;
					p3 = n1;
				}
				
		} else if ( n3 > n1 && n3 > n2) {
			p1 = n3;
			
				if ( n1 > n2 ) {
					p2 = n1;
					p3 = n2;
				} else {
					p2 = n2;
					p3 = n1;
				}
		}
	System.out.println("Numeros ordenados: "+p1+" "+p2+" "+p3 );
	}

}
