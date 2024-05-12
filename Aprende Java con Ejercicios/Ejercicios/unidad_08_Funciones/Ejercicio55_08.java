package unidad_08_Funciones;

/*
Realiza una función que tome como parámetro un array de cadenas de caracteres
y que devuelva otro array con los mismos valores habiendo eliminado
las posibles repeticiones. Se distinguen mayúsculas de minúsculas, por tanto
“hola” es distinto de “Hola”. Por ejemplo, si el array a contiene los valores
{“casa”, “coche”, “sol”, “mesa”, “mesa”, “coche”, “ordenador”,
“sol”, “CASA”}, la sentencia sinRepetir(a) devolvería el array {“casa”,
“coche”, “sol”, “mesa”, “ordenador”, “CASA”}. Se debe entregar tanto
el código de la función como el código de prueba que la usa. La cabecera de la
función es la siguiente:
public static String[] sinRepetir(String[] s)
 */
public class Ejercicio55_08 {
    public static void main(String[] args) {
        String [] s = {"casa", "coche", "sol", "mesa", "mesa", "coche", "ordenador", "sol", "CASA"};

        String [] r = sinRepetir(s);
        for (String name : r) {
            System.out.println(name);
        }

    }

    public static String[] sinRepetir(String[] s) {
        int counter = 0, counterR = 0;
        boolean repe = false;
        // Count the number of repetitions
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].equalsIgnoreCase(s[j]))
                    counter++;
            }
        }

        String[] r = new String[s.length - counter];

        int index = 0;

        for (int i = 0; i < s.length; i++) {
            repe = false;
            for (int j = 0; j < r.length; j++) {
                if (s[i].equalsIgnoreCase(r[j])) {
                    repe = true;
                    break;
                }
            }
            if (!repe)
                r[index++] = s[i];
        }
        return r;
    }

}
