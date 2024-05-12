package unidad_06_NumerosAleatorios;

import java.util.ArrayList;

/*
Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
 */
public class Ejercicio23_6 {
    public static void main(String[] args) {
        ArrayList<String> dados = new ArrayList<>();
        String dado = "";
        while (dados.size() < 5) {
            dado = asignarValorDado(Methods.numAleatorioEnRango(1, 6));
            dados.add(dado);
        }
        for (int i = 0; i < dados.size(); i++) {
            System.out.print(dados.get(i)+" ");
        }

    }
    private static String asignarValorDado ( int valor){
        String valorDado = switch (valor) {
            case 1 -> "As";
            case 2 -> "K";
            case 3 -> "Q";
            case 4 -> "J";
            case 5 -> "7";
            case 6 -> "8";
            default -> "error";
        };
        return valorDado;
    }
}
