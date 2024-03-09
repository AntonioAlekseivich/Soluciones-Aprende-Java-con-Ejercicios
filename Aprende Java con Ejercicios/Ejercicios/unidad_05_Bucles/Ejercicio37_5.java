package unidad_05_Bucles;

public class Ejercicio37_5 {
    public static void main(String[] args) {
        /*
        Realiza un conversor del sistema decimal al sistema de “palotes”.
Ejemplo:
Por favor, introduzca un número entero positivo: 47021
El 47021 en decimal es el | | | | - | | | | | | | - - | | - | en el sistema de palotes.
         */
        System.out.println("Por favor, introduzca un número entero positivo:");
        int n = Methods.pedirInt();
        String num = "" + n;
        String respuesta = "El " + num + " en decimal es el ";
        for (int i = 0; i < num.length(); i++) {


            for (int j = 0; j < Character.getNumericValue(num.charAt(i)); j++) {
                respuesta += "|";
            }
            if (i < num.length() - 1)
                respuesta += "-";
        }
        respuesta+=" en el sistema de bastones";
        System.out.println(respuesta);
    }
}
