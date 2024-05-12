package unidad_08_Funciones;
/*
Crea una función con la siguiente cabecera:
public String convierteEnPalabras(int n)
Esta función convierte los dígitos del número n en las correspondientes palabras
y lo devuelve  en una cadena de caracteres. Por ejemplo, el 470213
convertido a palabras sería:
cuatro, siete, cero, dos, uno, tres
Utiliza esta función en un programa para comprobar que funciona bien. Desde
la función no se debe mostrar nada por pantalla, solo se debe usar print desde
el programa principal. Fíjate que hay una coma detrás de cada palabra salvo al
final.
 */
public class Ejercicio39_08 {
    public static void main(String[] args) {
        System.out.println(convierteEnPalabras(31234));

    }
    public static String convierteEnPalabras(int n){
        String num = ""+n;
        String respuesta="";
        for (int i = 0; i < num.length(); i++) {
            respuesta+= switch (num.charAt(i)){
                case '0' -> "cero";
                case '1' -> "uno";
                case '2' -> "dos";
                case '3' -> "tres";
                case '4' -> "cuatro";
                case '5' -> "cinco";
                case '6' -> "seis";
                case '7' -> "siete";
                case '8' -> "ocho";
                case '9' -> "nueve";
                default -> "error";
            };
            if(i<num.length()-1)
                respuesta+=", ";
        }
        return respuesta;
    }

}
