package unidad_08_Funciones;
/*
Define la función convierteArrayEnString con la siguiente cabecera:
public static String convierteArrayEnString(int[] a)
Esta función toma como parámetro un array que contiene números y devuelve
una cadena de caracteres con esos números. Por ejemplo, si a = { }, convierteArrayEnString(
a) devuelve “”; si a = { 8 }, convierteArrayEnString(a)
devuelve “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve
“62501”.
 */
public class Ejercicio47_08 {
    public static String convierteArrayEnString(int[] a){
        String answer="";
        for (int i = 0; i < a.length; i++) {
            answer+=a[i];
        }
        return answer;
    }

}
