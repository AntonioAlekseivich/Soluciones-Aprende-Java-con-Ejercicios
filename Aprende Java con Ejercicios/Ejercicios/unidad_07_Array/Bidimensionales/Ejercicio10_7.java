package unidad_07_Array.Bidimensionales;
import java.util.Scanner;
/*
Realiza el juego de las tres en raya.
 */
public class Ejercicio10_7 {



        private static char[][] tablero = new char[3][3];
        private static char jugadorActual = 'X';

        public static void main(String[] args) {
            inicializarTablero();
            jugar();
        }

        private static void inicializarTablero() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    tablero[i][j] = ' ';
                }
            }
        }

        private static void mostrarTablero() {
            System.out.println("-------------");
            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j] + " | ");
                }
                System.out.println();
                System.out.println("-------------");
            }
        }

        private static void cambiarJugador() {
            jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
        }

        private static boolean colocarFicha(int fila, int columna) {
            if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ') {
                tablero[fila][columna] = jugadorActual;
                return true;
            }
            return false;
        }

        private static boolean hayGanador() {
            for (int i = 0; i < 3; i++) {
                if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) {
                    return true;
                }
            }
            for (int j = 0; j < 3; j++) {
                if (tablero[0][j] == jugadorActual && tablero[1][j] == jugadorActual && tablero[2][j] == jugadorActual) {
                    return true;
                }
            }
            if ((tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) ||
                    (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual)) {
                return true;
            }
            return false;
        }

        private static boolean tableroLleno() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tablero[i][j] == ' ') {
                        return false;
                    }
                }
            }
            return true;
        }

        private static void jugar() {
            Scanner scanner = new Scanner(System.in);
            int fila, columna;
            boolean ganador = false;

            System.out.println("¡Bienvenido al juego de Tres en Raya!");

            while (!ganador) {
                mostrarTablero();
                System.out.println("Turno del jugador " + jugadorActual);
                System.out.print("Ingrese la fila (0-2): ");
                fila = scanner.nextInt();
                System.out.print("Ingrese la columna (0-2): ");
                columna = scanner.nextInt();

                if (colocarFicha(fila, columna)) {
                    if (hayGanador()) {
                        ganador = true;
                        System.out.println("¡El jugador " + jugadorActual + " ha ganado!");
                    } else if (tableroLleno()) {
                        ganador = true;
                        System.out.println("¡Empate! No hay ganador.");
                    } else {
                        cambiarJugador();
                    }
                } else {
                    System.out.println("La casilla seleccionada no es válida. Inténtalo de nuevo.");
                }
            }
            scanner.close();
            mostrarTablero();
            System.out.println("¡Gracias por jugar!");
        }
    }

