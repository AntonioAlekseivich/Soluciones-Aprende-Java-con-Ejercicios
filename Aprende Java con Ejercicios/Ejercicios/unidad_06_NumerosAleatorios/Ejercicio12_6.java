package unidad_06_NumerosAleatorios;
/*
Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
convertir un entero en un carácter.
 */
public class Ejercicio12_6 {
    public static void main(String[] args) {
        char caracter =' ';
        int espacios =0;
        int lineas = 0;
        for (int i = 0; i < 35; i++) {
           caracter = (char)Methods.numAleatorioEnRango(32,126);
           espacios=Methods.numAleatorioEnRango(0,4);
           lineas = Methods.numAleatorioEnRango(0,25);
            for (int j = 0; j < lineas; j++) {
                System.out.print(caracter);
            }

            System.out.println();
        }

    }
}
