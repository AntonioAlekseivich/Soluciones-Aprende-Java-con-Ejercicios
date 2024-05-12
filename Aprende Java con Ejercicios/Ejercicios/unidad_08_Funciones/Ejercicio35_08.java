package unidad_08_Funciones;


/*
Crea una función con la siguiente cabecera:
public static String convierteEnPalotes(int n)
Esta función convierte el número n al sistema de palotes y lo devuelve en una
cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | - | | | | | |
| - - | | - | - | | | en el sistema de palotes. Utiliza esta función en un programa
para comprobar que funciona bien. Desde la función no se debe mostrar nada
por pantalla, solo se debe usar print desde el programa principal.
 */
public class Ejercicio35_08 {

    public static void main(String[] args) {
        System.out.println(convierteEnPalotes(470213));
    }

public static String convierteEnPalotes(int n){
    String num = "" + n;
    String respuesta ="";
    for (int i = 0; i < num.length(); i++) {


        for (int j = 0; j < Character.getNumericValue(num.charAt(i)); j++) {
            respuesta += "|";
        }
        if (i < num.length() - 1)
            respuesta += "-";
    }
    return respuesta;
}
}
