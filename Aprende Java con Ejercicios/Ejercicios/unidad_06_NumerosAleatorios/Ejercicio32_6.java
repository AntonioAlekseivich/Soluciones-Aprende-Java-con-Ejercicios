package unidad_06_NumerosAleatorios;

import java.util.Random;

/*
Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con
el carácter “|”. La anchura del sendero siempre es la misma, los dos caracteres
del borde más cuatro caracteres en medio, en total 6 caracteres (incluyendo
espacios). A cada metro, el sendero puede continuar recto, girar un carácter a
la izquierda o girar un carácter a la derecha, por supuesto de forma aleatoria.
Por cada metro de sendero - representado por una línea - puede que haya un
obstáculo o puede que no, la probabilidad es del 50%. La posición del obstáculo
es aleatoria dentro de la línea. En caso de existir un obstáculo en un metro de
sendero (en una línea), puede ser una planta (carácter *) o una piedra (carácter
O), la probabilidad de que salga uno u otro es la misma. Recuerda que nunca
habrá más de un obstáculo por metro de sendero, habrá uno o ninguno.
 */
public class Ejercicio32_6 {
    public static final int POSICION_INICIAL = 13;
    public static void main(String[] args) {
        System.out.println("Introduzca la longitud del sendero en metros:");
        int longitud = Methods.pedirInt();
        Random random = new Random();
        int posicion = POSICION_INICIAL;

        for (int i = 0; i < longitud; i++) {//Recorre longitud
            int casos = Methods.numAleatorioEnRango(1, 3);
            if (casos == 1)
                posicion--;
            else if (casos == 2)
                posicion++;

            for (int j = 0; j < posicion; j++) {//sendero
                boolean obstaculo = random.nextBoolean();
                boolean tipo = random.nextBoolean();
                int posicionObstaculo= random.nextInt(1,3);

                if(j==posicion-7||j==posicion-1)
                    System.out.print("|");
                else if(j>posicion-8) {
                    if (obstaculo&&j==posicion-posicionObstaculo){
                        if(tipo)
                            System.out.print("*");
                        else
                            System.out.print("O");
                    } else
                        System.out.print(" ");
                }
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
