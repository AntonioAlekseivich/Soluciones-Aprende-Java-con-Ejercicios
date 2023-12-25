package unidad_04_SentenciaCondicional_IfSwitch;

public class Ejercicio28_4_Main {

	public static void main(String[] args) {
		/*Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
incorrecta, el programa deberá mostrar un mensaje de error.*/
String p1,p2;
System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijera):");
p1 = Ejercicio28_4_Methods.stringValido3OpcionesMinusculas("piedra", "papel", "tijera"); 

System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijera):");
p2 = Ejercicio28_4_Methods.stringValido3OpcionesMinusculas("piedra", "papel", "tijera"); 
	
	if (p1.equals(p2)) {
		System.out.println("Empate");
	} else if (p1.equals("piedra") && p2.equals("tijera") ||
			p1.equals("papel") && p2.equals("piedra") ||
			p1.equals("tijera") && p2.equals("papel")
			) {
		System.out.println("Gana el jugador 1");
	} else {
		System.out.println("Gana el jugador 2");
	}
	}
}
