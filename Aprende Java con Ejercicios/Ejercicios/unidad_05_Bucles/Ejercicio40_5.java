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

        int altura = Methods.pedirNumImparMayorOIgualAUnNumero(3);

        // Parte superior del rombo
        for (int i = 1; i <= altura / 2 + 1; i++) {

            if (i == 1) {
                for (int j = 0; j < altura; j++) {
                    if (j == altura / 2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

            } else {
                for (int j = 0; j < altura / 2 + 1 - i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j < 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        // Parte inferior del rombo
        for (int i = altura / 2; i >= 1; i--) {



                for (int j = 0; j < altura / 2 + 1 - i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");

                if (i == 1) {
                    System.out.print(" ");
                } else {
                    for (int j = 0; j < 2 * i - 3; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    System.out.println();
                }
            }
        }
    }


