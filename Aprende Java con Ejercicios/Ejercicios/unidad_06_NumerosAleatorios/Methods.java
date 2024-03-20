package unidad_06_NumerosAleatorios;

import java.util.Scanner;

public class Methods {
    public static void soutPedirInt() {
        System.out.println("Por favor, introduzca un número entero positivo:");
    }

    public static int pedirInt() {

        Scanner sInt = new Scanner(System.in);
        return sInt.nextInt();
    }

    public static int pedirNumMinimo(int num){
        int input;
        do {

            input = pedirInt();
            if (input < num ) {
                System.out.println("valor no valido");

            }
        } while (input < num);
        return input;
    }
    public static long pedirLong() {
        Scanner sLong = new Scanner(System.in);
        return sLong.nextLong();
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

    public static int pedirNumImparMayorOIgualAUnNumero(int numMinimo) {
        int num;
        do {
            num = unidad_05_Bucles.Methods.pedirInt();


            if (num < numMinimo || unidad_05_Bucles.Methods.esPar(num))
                System.out.println("Valor no valido.");
        } while (num < numMinimo || unidad_05_Bucles.Methods.esPar(num));
        return num;
    }

    public static long insertarDigito(long num, int posicion, int digito) {
        String sNum = "" + num;
        String sResultado = "";
        long lResultado = 0;
        for (int i = 0; i < posicion - 1; i++) {
            sResultado += sNum.charAt(i);
        }
        sResultado += digito;
        for (int i = posicion - 1; i < sNum.length(); i++) {
            sResultado += sNum.charAt(i);
        }
        lResultado = Long.parseLong(sResultado);
        return lResultado;
    }

    public static long reemplazarDigito(long num, int posicion, int digito) {
        String sNum = "" + num;
        String sResultado = "";
        long lResultado = 0;
        for (int i = 0; i < posicion - 1; i++) {
            sResultado += sNum.charAt(i);
        }
        sResultado += digito;
        for (int i = posicion; i < sNum.length(); i++) {
            sResultado += sNum.charAt(i);
        }
        lResultado = Long.parseLong(sResultado);
        return lResultado;
    }

    public static boolean longContieneDigito(long num, int digito){
        String sNum= ""+num;
        boolean contiene=false;

        for (int i = 0; i < sNum.length(); i++) {
            if(Character.getNumericValue(sNum.charAt(i))==digito) {
                contiene = true;
                break;
            }
        }
        return contiene;

    }

    /**
     * Counts the numer of ocurrences of a digit inside a long
     * @param num
     * @param digito
     * @return ocurrences of the digit
     */
    public static int cuentaOcurrencias(long num, int digito){
        String sNum= ""+num;
        int ocurrencia=0;

        for (int i = 0; i < sNum.length(); i++) {
            if(Character.getNumericValue(sNum.charAt(i))==digito) {
                ocurrencia++;

            }
        }
        return ocurrencia;
    }

    public static void pintarRectangulo(int anchura, int altura){
        for (int i = 0; i < altura; i++) {
            if(i==0||i==altura-1)
                System.out.println("*".repeat(anchura));
            else
                System.out.println("*"+" ".repeat(anchura-2)+"*");
        }

    }

    /**
     * Takes a long and for each digit, if it is even, substracts 1,
     * else, adds 1
     * @param  numero
     * @return numero dislocated
     */
    public static long dislocarNumero(long numero){
        String num= ""+ numero;
        String result="";

        for (int i = 0; i < num.length(); i++) {
            if(esPar(Character.getNumericValue(num.charAt(i))))
                result+=Character.getNumericValue(num.charAt(i))+1;
            else
                result+=Character.getNumericValue(num.charAt(i))-1;
        }
        return Long.parseLong(result);

    }

    //Numeros aleatorios:
    public static int numAleatorioEnRango(int num1, int num2){
        return (int)(Math.random()*(num2-num1+1))+num1;
    }


}
