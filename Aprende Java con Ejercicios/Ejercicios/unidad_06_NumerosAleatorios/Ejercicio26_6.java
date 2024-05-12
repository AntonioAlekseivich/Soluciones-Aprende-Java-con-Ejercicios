package unidad_06_NumerosAleatorios;

/*
Realiza un programa que pinte una tableta de turrón con un bocado realizado de
forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El bocado se
da alrededor del turrón, obviamente no se puede dar un bocado por en medio
de la tableta.
 */
public class Ejercicio26_6 {
    public static void main(String[] args) {
        System.out.println("Introduzca la anchura de la tableta:");
        int anchura = Methods.pedirInt();
        System.out.println("Introduzca la altura de la tableta:");
        int altura = Methods.pedirInt();

        int caso = Methods.numAleatorioEnRango(1, 4);
        int hueco = 0;

        if (caso < 3)
            hueco = Methods.numAleatorioEnRango(0, anchura - 1);
        else
            hueco = Methods.numAleatorioEnRango(0, altura - 1);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                if (caso == 1) {
                    if (i == 0 && j == hueco)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                } else if (caso == 2) {
                    if (i == altura - 1 && j == hueco)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                } else if (caso == 3) {
                    if (j == 0 && i == hueco)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                } else {
                    if (j == anchura - 1 && i == hueco)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            }
            System.out.println();

        }
    }
}
