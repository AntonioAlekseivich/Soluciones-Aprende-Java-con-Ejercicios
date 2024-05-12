package unidad_08_Funciones;

/*
Escribe un programa que pase de binario a decimal.
 */
public class Ejercicio17_08 {
    public static void main(String[] args) {

        String binario = "0111";

        System.out.println(binario + " " + binarioADecimal(binario));
    }

    private static int binarioADecimal(String binario) {
        int decimal = 0;
        int counter = 0;

        for (int i = binario.length() - 1; i >= 0; i--) {
            if (Character.getNumericValue(binario.charAt(i)) == 1)
                decimal += Math.pow(2, counter);
            counter++;
        }

        return decimal;
    }

}

