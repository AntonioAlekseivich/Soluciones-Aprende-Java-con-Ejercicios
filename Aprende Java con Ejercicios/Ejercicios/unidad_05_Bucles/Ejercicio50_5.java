package unidad_05_Bucles;

public class Ejercicio50_5 {
    /*
        Una empresa de cartelería nos ha encargado un programa para realizar uno de
        sus diseños. Debido a los acontecimientos que han tenido lugar en Cataluña
        durante el 2018, han recibido muchos pedidos del cartel que muestra el número
    155. Realiza un programa que pinte el número 155 mediante asteriscos. Al
        usuario se le pedirán dos datos, la altura del cartel y el número de espacios
        que habrá entre los números. La altura mínima es 5. La anchura de los números
        siempre es la misma. La parte superior de los cincos también es siempre igual.
        La parte inferior del 5 sí que varía en función de la altura.
        Ejemplo 1:
        Introduzca la altura (5 como mínimo): 5 Introduzca el número de
        espacios entre los números (1 como mínimo): 2
        */
    public static final int ANCHURA_NUMERO = 4;
    public static final int PARTE_SUPERIOR = 3;

    public static void main(String[] args) {
        System.out.println("Introduzca la altura (5 como mínimo):");
        int altura = Methods.pedirNumMinimo(5);
        System.out.println("Introduzca el número de espacios entre los números (1 como mínimo):");
        int huecos = Methods.pedirNumMinimo(1);

        for (int i = 0; i < altura; i++) {//Recorremos altura
            System.out.print("*");
            pintaEspacio(ANCHURA_NUMERO);
            pintaCinco(ANCHURA_NUMERO,i,altura);
            pintaEspacio(ANCHURA_NUMERO);
            pintaCinco(ANCHURA_NUMERO,i,altura);
            System.out.println();
        }


    }

    private static void pintaEspacio(int anchura) {
        for (int j = 0; j < anchura; j++) {//recorremos espacios en blanco
            System.out.print(" ");
        }
    }

    private static void pintaCinco(int anchura, int iteracion, int altura) {
        if (iteracion == 0 || iteracion == 2 || iteracion == altura-1) {
            for (int j = 0; j < anchura; j++) {
                System.out.print("*");
            }
        } else if (iteracion == 1) {
            for (int j = 0; j < anchura; j++) {
                if (j == 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
        } else {
            for (int i = 0; i < anchura; i++) {
                if (i == anchura - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
        }
    }

}
