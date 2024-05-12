package unidad_06_NumerosAleatorios;

import java.util.Scanner;

/*
Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la
partida, el jugador introduce la cantidad de dinero que quiere apostar. Se
muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u
11, el jugador gana la misma cantidad que apostó y termina la partida. Por ej.
si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos dados
suman 2, 3 o 12, el jugador pierde su dinero y termina la partida. Si no se
da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego
entra en una segunda etapa. En esta etapa, el jugador buscará volver a obtener
ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7,
pierde. Si sale otro número, tiene que seguir tirando.
 */
public class Ejercicio31_6 {
    public static void main(String[] args) {
        System.out.println("Cuanto dinero quiere apostar?");
        int dinero = Methods.pedirInt();
        int numeroBuscado = 0;
        boolean juego=true;

        int tirada = tirarDados();
        if (tirada == 7 || tirada == 11) {
            dinero += dinero;
            System.out.println("Ha ganado! Su dinero: " + dinero);
        } else if (tirada == 2 || tirada == 3 || tirada == 12) {
            System.out.println("Ha perdido!");
        } else {
            numeroBuscado = tirada;
            do{
                System.out.println("Numero buscado: " + numeroBuscado);
                tirada=tirarDados();
                if(tirada==numeroBuscado) {
                    dinero += dinero;
                    System.out.println("Ha ganado! Su dinero: " + dinero);
                    juego = false;
                }
                else if (tirada==7) {
                    System.out.println("Ha perdido");
                    juego = false;
                }
            }while (juego);

        }
    }

    private static int tirarDados() {
        Scanner sInput = new Scanner(System.in);
        String input = "";
        int dado1 = 0, dado2 = 0, tirada = 0;

        do {
            System.out.println("Escriba \"Tirar\" para tirar los dados.");
            input = sInput.nextLine();
            if (input.toLowerCase().equals("tirar")) {

                dado1 = Methods.numAleatorioEnRango(1, 6);
                dado2 = Methods.numAleatorioEnRango(1, 6);

                System.out.println("Dado1: " + dado1 + "\n" +
                        "Dado2: " + dado2 + "\n");
            }
        } while (!input.equals("tirar"));
        tirada=dado2+dado1;
        return  tirada;
    }
}
