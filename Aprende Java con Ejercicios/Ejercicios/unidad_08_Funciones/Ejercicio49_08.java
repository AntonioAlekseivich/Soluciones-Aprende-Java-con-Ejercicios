package unidad_08_Funciones;
/*
Escribe un programa que genere los n primeros términos de la sucesión look
and say. El primer término es 1. A continuación se va leyendo - un uno - por
tanto tenemos 11, se sigue leyendo – dos unos – por tanto tenemos 21, etc.
Se recomienda usar arrays para almacenar los dígitos porque los tipos int y
long son muy limitados en cuanto al número de dígitos. También puede resultar
de ayuda utilizar las funciones convierteArrayEnString y concatena definidas en los
ejercicios anteriores.
 */
public class Ejercicio49_08 {
    public static void main(String[] args) {//Hecho x ChatGpt
        int n = 10; // número de términos a generar
        generarSucesion(n);
    }

        public static void generarSucesion ( int n){
            int[] terminoActual = {1}; // primer término de la sucesión es 1

            for (int i = 0; i < n; i++) {
                System.out.println(convierteArrayEnString(terminoActual));
                terminoActual = siguienteTermino(terminoActual);
            }
        }

        public static int[] siguienteTermino ( int[] termino){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for (int i = 1; i < termino.length; i++) {
                if (termino[i] == termino[i - 1]) {
                    count++;
                } else {
                    sb.append(count).append(termino[i - 1]);
                    count = 1;
                }
            }
            sb.append(count).append(termino[termino.length - 1]);
            return stringToArray(sb.toString());
        }

        public static int[] stringToArray (String str){
            int[] array = new int[str.length()];
            for (int i = 0; i < str.length(); i++) {
                array[i] = Character.getNumericValue(str.charAt(i));
            }
            return array;
        }

        public static String convierteArrayEnString ( int[] array){
            StringBuilder sb = new StringBuilder();
            for (int num : array) {
                sb.append(num);
            }
            return sb.toString();
        }


}
