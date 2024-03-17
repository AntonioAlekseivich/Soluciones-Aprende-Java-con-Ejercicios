package unidad_05_Bucles;

public class Ejercicio67_5 {
    /*
    Realiza un programa que pinte una escalera que va descendiendo de izquierda
a derecha. El programa pedirá el número de escalones y la altura de cada
escalón. La anchura de los escalones siempre es la misma: 4 asteriscos.
     */
        public static final int ANCHURA = 4;
    public static void main(String[] args) {
        System.out.println("Introduzca el número de escalones:");
        int numero = Methods.pedirInt();
        System.out.println("Introduzca la altura de cada escalon:");
        int altura = Methods.pedirInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.println("*".repeat(ANCHURA*i));
            }
        }

    }

}
