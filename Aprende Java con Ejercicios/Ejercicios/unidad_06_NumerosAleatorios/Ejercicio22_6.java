package unidad_06_NumerosAleatorios;

/*Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
aleatorio. La cabeza se representará con el carácter @ y se debe colocar
exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
el cuerpo irá serpenteando de la siguiente manera: se generará de forma
aleatoria un valor entre tres posibles que hará que el siguiente carácter se
coloque una posición a la izquierda del anterior, alineado con el anterior o una
posición a la derecha del anterior. La longitud de la serpiente se pedirá por
teclado y se supone que el usuario introducirá un dato correcto.
 */

public class Ejercicio22_6 {
    public static final int POSICION_INICIAL = 13;

    public static void main(String[] args) {
        System.out.println("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza:");
        int longitud = Methods.pedirInt();

        int posicion = POSICION_INICIAL;

        for (int i = 0; i < longitud; i++) {
            int casos = Methods.numAleatorioEnRango(1, 3);
            if (casos == 1)
                posicion--;
            else if (casos == 2)
                posicion++;

            for (int j = 0; j < posicion + 1; j++) {
                if(i==0&&j==posicion-1)
                    System.out.print("@");
                if(j==posicion&&i!=0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
