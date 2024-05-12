package unidad_08_Funciones;

public class ConversorBase {
    public static int binarioADecimal(String binario) {
        int decimal = 0;
        int counter = 0;

        for (int i = binario.length() - 1; i >= 0; i--) {
            if (Character.getNumericValue(binario.charAt(i)) == 1)
                decimal += Math.pow(2, counter);
            counter++;
        }

        return decimal;
    }
    public static int octalADecimal(int octal) {
        int decimal = 0;
       String sOctal = ""+octal;
        int counter = 0;

        for (int i = sOctal.length()-1; i >= 0 ; i--) {
                decimal += Character.getNumericValue(sOctal.charAt(i))*Math.pow(8, counter);
            counter++;
        }

        return decimal;
    }
    public static String octalABinario(int octal) {
        StringBuilder binario = new StringBuilder();
        String sOctal = "" + octal;
        for (int i = 0; i < sOctal.length(); i++) {
            char c = sOctal.charAt(i);
            switch (c) {
                case '0':
                    binario.append("000");
                    break;
                case '1':
                    binario.append("001");
                    break;
                case '2':
                    binario.append("010");
                    break;
                case '3':
                    binario.append("011");
                    break;
                case '4':
                    binario.append("100");
                    break;
                case '5':
                    binario.append("101");
                    break;
                case '6':
                    binario.append("110");
                    break;
                case '7':
                    binario.append("111");
                    break;
                default:
                    return "error";
            }
        }
        return binario.toString();
    }


    public static String decimalABinario(int decimal){
        StringBuilder binario = new StringBuilder();
        while(decimal>0){
            binario.append(decimal%2);
            decimal=decimal/2;
        }
        return binario.reverse().toString();
    }

    public static String decimalAHexadecimal (int decimal){
        StringBuilder hexadecimal = new StringBuilder();
        while(decimal>0){
            String hex = switch (decimal%16){
                case 10 -> "A";
                case 11 -> "B";
                case 12 -> "C";
                case 13 -> "D";
                case 14 -> "E";
                case 15 -> "F";
                default -> ""+(decimal%16);
            };
            hexadecimal.append(hex);
            decimal=decimal/16;
        }
        return hexadecimal.reverse().toString();
    }

    public static String decimalAOctal(int decimal){
        StringBuilder octal = new StringBuilder();
        while(decimal>0){
            octal.append(decimal%8);
            decimal=decimal/8;
        }

        return octal.reverse().toString();
    }
}
