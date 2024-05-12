package unidad_06_NumerosAleatorios;

/*
Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
introduce una opción incorrecta, el programa deberá mostrar un mensaje de
error.
 */
public class Ejercicio27_6 {
    public static void main(String[] args) {
        int input = 0;
        int jugadaBot = 0;

        menu();
        input = Methods.inputBetween2Num(1, 3);
        jugadaBot = Methods.numAleatorioEnRango(1, 3);
        soutJugadaBot(jugadaBot);

        if (input == 1 && jugadaBot == 3 ||
                input == 2 && jugadaBot == 1 ||
                input == 3 && jugadaBot == 2)
            System.out.println("Gana el jugador");

        else if (input == 3 && jugadaBot == 1 ||
                input == 1 && jugadaBot == 2 ||
                input == 2 && jugadaBot == 3)
            System.out.println("Gana el ordenador");

        else
            System.out.println("Empate!");
    }

    private static void menu() {
        System.out.println("Turno del jugador:\n" +
                "1.-Piedra\n" +
                "2.-Papel\n" +
                "3.-Tijera\n");
    }

    private static void soutJugadaBot(int value) {
        System.out.print("Turno del ordenador: ");
        if (value == 1)
            System.out.print(" Piedra\n");
        if (value == 2)
            System.out.print(" Papel\n");
        if (value == 3)
            System.out.print(" Tijera\n");
    }
}

