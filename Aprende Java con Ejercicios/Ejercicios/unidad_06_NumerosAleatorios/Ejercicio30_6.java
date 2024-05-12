package unidad_06_NumerosAleatorios;

/*
El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los
Reyes Magos le han traído un caballito de mar ($) y una caracola (@) para que
le hagan compañía al pez. Realiza un programa que pinte por pantalla la pecera
con los tres animalitos acuáticos colocados dentro en posiciones aleatorias. Por
una cuestión de física elemental, ninguno de los animales puede coincidir
en la misma posición. Se debe pedir al usuario el ancho y el alto de la pecera,
que como mínimo serán de 4 unidades.
 */
public class Ejercicio30_6 {
    public static void main(String[] args) {

        System.out.println("Por favor, introduzca la altura de la pecera (como mínimo 4):");
        int altura = Methods.pedirInt();
        System.out.println("Ahora introduzca la anchura (como mínimo 4):");
        int anchura = Methods.pedirInt();

        int xPez = 0;
        int yPez = 0;

        int xCaballito = 0;
        int yCaballito = 0;

        int xCaracola = 0;
        int yCaracola = 0;

        //Coordenadas del pez
        do {
            xPez = Methods.numAleatorioEnRango(1, anchura - 2);
            yPez = Methods.numAleatorioEnRango(1, altura - 2);

            xCaballito = Methods.numAleatorioEnRango(1, anchura - 2);
            yCaballito = Methods.numAleatorioEnRango(1, altura - 2);

            xCaracola = Methods.numAleatorioEnRango(1, anchura - 2);
            yCaracola = Methods.numAleatorioEnRango(1, altura - 2);

        } while (xPez == xCaballito && yPez == yCaballito ||
                xPez == xCaracola && yPez == yCaracola ||
                xCaballito == xCaracola && yCaballito == yCaracola);


        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == anchura - 1)
                    System.out.print("*");
                else if (j == xPez && i == yPez)
                    System.out.print("&");
                else if (j == xCaballito && i == yCaballito)
                    System.out.print("$");
                else if (j == xCaracola && i == yCaracola)
                    System.out.print("@");
                else
                    System.out.print(" ");
            }
            System.out.println();//salto de linea
        }
    }
}
