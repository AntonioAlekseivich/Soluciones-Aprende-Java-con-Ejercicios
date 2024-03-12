package unidad_05_Bucles;

import java.util.Scanner;

public class Methods {
    public static void soutPedirInt() {
        System.out.println("Por favor, introduzca un número entero positivo:");
    }

    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    public static boolean esPrimo(int n) {
        boolean esPrimo = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
    }



    public static int pedirInt() {

        Scanner sInt = new Scanner(System.in);
        return sInt.nextInt();
    }


    public static int factorial(int n) {
        int factorial = n;
        for (int i = n - 1; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Válida que un valor introducido por teclado este
     * comprendido en un tramo determinado.
     * Valores límite incluidos.
     *
     * @param: int a: valor inicial
     * @param:int b: valor final
     * @return:int input: Valor comprendido entre esos 2.
     */
    public static int inputBetween2Num(int a, int b) {
        int input;
        do {

            input = pedirInt();
            if (input < a || input > b) {
                System.out.println("valor no valido");

            }
        } while (input < a || input > b);
        return input;
    }

    public static boolean esCapicua(long n) {
        String num = "" + n;
        boolean capicua = true;
        for (int i = 0; i < num.length() / 2; i++) {
            if (num.charAt(i) != num.charAt(num.length() - 1 - i)) {
                capicua = false;
                break;
            }

        }
        return capicua;
    }

    public static int pedirNumImparMayorOIgualA3() {
        int num;
        do {
            num = Methods.pedirInt();


            if (num < 3 || Methods.esPar(num))
                System.out.println("Valor no valido.");
        } while (num < 3 || Methods.esPar(num));
        return num;
    }


}