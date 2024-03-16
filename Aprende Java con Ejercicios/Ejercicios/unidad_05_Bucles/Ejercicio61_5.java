package unidad_05_Bucles;

public class Ejercicio61_5 {
    /*
    Escribe un programa que pinte por pantalla la letra V. El ancho del palo de
la V es siempre de 3 asteriscos. El usuario debe introducir la altura. La altura
mínima es de 3 pisos. Si el usuario introduce una altura menor, el programa
debe mostrar un mensaje de error.
     */
    public static void main(String[] args) {
        System.out.println("Introduzca la altura de la V (un número mayor o igual a 3):");

        int altura = Methods.pedirNumMinimo(3);
final int ANCHURA = 3;
        for (int i = 0; i <=altura; i++) {
            //primera mitad
            System.out.println(" ".repeat(i)+"*".repeat(ANCHURA)+" ".repeat(altura-i)
                 //segunda mitad
                    +" ".repeat(altura-i)+"*".repeat(ANCHURA));
        }
    }


}
