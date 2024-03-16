package unidad_05_Bucles;

public class Ejercicio60_5 {
    /*
    Escribe un programa que pinte por pantalla un par de calcetines, de los que
se ponen al lado del árbol de Navidad para que Papá Noel deje sus regalos.
El usuario debe introducir la altura. Suponemos que el usuario introduce una
altura mayor o igual a 4. Observa que la talla de los calcetines y la distancia
que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura.
     */
    public static void main(String[] args) {
        System.out.println("Introduzca la altura de los calcetines:");
        int altura = Methods.pedirInt();
        int valor1=0,valor2=1;
        final int ANCHURA=6;

        for (int i = 0; i < altura; i++) {
            if(i<altura-2){
                valor1=ANCHURA/2;
                valor2=ANCHURA;
            } else {
                valor1=ANCHURA;
                valor2=ANCHURA/2;
            }
            System.out.println("*".repeat(valor1)+" ".repeat(valor2)+"*".repeat(valor1));
        }

    }

}
