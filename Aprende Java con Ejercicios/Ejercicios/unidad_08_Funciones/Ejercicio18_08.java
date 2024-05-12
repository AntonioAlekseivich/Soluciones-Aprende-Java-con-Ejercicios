package unidad_08_Funciones;
/*
Escribe un programa que pase de decimal a binario.
 */
public class Ejercicio18_08 {
    public static void main(String[] args) {

        int decimal = 100;
        String binario = decimalABinario(decimal);
        System.out.println(binario);

    }
    private static String decimalABinario(int decimal){
        StringBuilder binario = new StringBuilder();
        while(decimal>0){
            binario.append(decimal%2);
            decimal=decimal/2;
        }
        return binario.reverse().toString();
    }


}
