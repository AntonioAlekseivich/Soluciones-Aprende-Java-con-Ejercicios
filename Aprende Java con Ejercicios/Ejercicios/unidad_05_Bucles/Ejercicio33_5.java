package unidad_05_Bucles;

public class Ejercicio33_5 {
    public static void main(String[] args) {
        /*
        Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.
         */
        System.out.println("Introduzca la altura de la U:");
        int altura = Methods.pedirInt();
        int anchura = altura;
        String caracter1,caracter2;
        for (int i = 0; i < altura; i++) {

            if (i != altura - 1) {
                caracter1 = "*";
                caracter2 = " ";
            } else{
                caracter1 = " ";
                caracter2 = "*";
            }
                for (int j = 0; j < anchura; j++) {
                    if (j == altura - 1 || j == 0) {
                        System.out.print(caracter1+" ");
                    } else {
                        System.out.print(caracter2+" " );
                    }
                }

            System.out.println();
        }
    }
}
