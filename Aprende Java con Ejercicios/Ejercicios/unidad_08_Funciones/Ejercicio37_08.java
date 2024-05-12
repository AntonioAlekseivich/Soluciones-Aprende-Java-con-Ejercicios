package unidad_08_Funciones;

public class Ejercicio37_08 {
    public static void main(String[] args) {
        System.out.println(convierteEnMorse(213) );
    }

    public static String convierteEnMorse(int n) {
        String num = "" + n;
        String morse = "";

        for (int i = 0; i < num.length(); i++) {
            morse += switch (num.charAt(i)) {
                case '1' -> ". _ _ _ _";
                case '2' -> ". . _ _ _";
                case '3' -> ". . . _ _";
                case '4' -> ". . . . _";
                case '5' -> ". . . . .";
                case '6' -> "_ . . . .";
                case '7' -> "_ _ . . .";
                case '8' -> "_ _ _ . .";
                case '9' -> "_ _ _ _ .";
                case '0' -> "_ _ _ _ _";
                default -> "error";
            };
        }
    return morse;
    }

}

