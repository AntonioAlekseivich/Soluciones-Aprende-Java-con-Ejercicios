package unidad_08_Funciones;
/*
Une y amplía los dos programas anteriores de tal forma que se permita
convertir un número entre cualquiera de las siguientes bases: decimal, binario,
hexadecimal y octal.
 */
public class Ejercicio19_08 {
    public static void main(String[] args) {
        int decimal = 12345;
        String octal= ConversorBase.decimalAOctal(decimal);
        String hexadecimal = ConversorBase.decimalAHexadecimal(decimal);
        String binario = ConversorBase.decimalABinario(decimal);
        System.out.println("Decimal: "+decimal+"\n"+
                "Octal: "+octal+"\n"+
                "Hexadecimal: "+ hexadecimal+"\n"+
                "Binario: "+binario);

    }
}
