package unidad_06_NumerosAleatorios;

/*
Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
convertir un entero en un carácter.
 */
public class Ejercicio12_6 {
    public static void main(String[] args) {
        char caracter = ' ';
        final int espacios = 3;

        for (int i = 0; i < 35; i++) {//Longitud total de la linea vertical


            for (int j = 0; j < 100; j++) {//Longitud horizontal
                caracter = (char) Methods.numAleatorioEnRango(31, 126);
                System.out.print(caracter + " ".repeat(espacios));
            }
            System.out.println();
        }
    }
}
