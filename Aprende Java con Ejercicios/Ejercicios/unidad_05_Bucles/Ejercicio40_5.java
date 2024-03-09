package unidad_05_Bucles;

public class Ejercicio40_5 {
    public static void main(String[] args) {
        /*
        Realiza un programa que pinte por pantalla un rombo hueco hecho con
asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
mensaje de error.
         */
        System.out.println("Por favor, introduzca la altura del rombo:");
        int altura = Methods.pedirNumImparMayorOIgualA3();
        for (int i = 0; i < altura; i++) {//Recorremos la altura

            if(i<altura/2){//si estamos en la primera mitad
                for (int j = 0; j < altura; j++) {//recorremos la anchura
                    if (j >= i && j <= altura - i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" " );
                    }
                }
            }
            else{//Si estamos en la segunda mitad
                for (int j = 0; j < altura; j++) {//recorremos la anchura
                    if (j <= i && j >= altura - i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" " );
                    }

                }
            }
            System.out.println();
        }
    }
}
