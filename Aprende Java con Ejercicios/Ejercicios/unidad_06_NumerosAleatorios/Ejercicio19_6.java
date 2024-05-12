package unidad_06_NumerosAleatorios;
/*
Escribe un programa que muestre 50 números enteros aleatorios comprendidos
entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
el máximo de los pares el mínimo de los impares y la media de todos los
números generados.
 */

public class Ejercicio19_6 {
    public static final int CANTIDAD_NUMEROS=50,RANGO_MINIMO=-100,RANGO_MAXIMO=200;
    public static void main(String[] args) {

        int num=0, maxPar=RANGO_MINIMO, minImpar=RANGO_MAXIMO, sumatorio=0, media=0;

        for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
            num=Methods.numAleatorioEnRango(RANGO_MINIMO,RANGO_MAXIMO);
            System.out.println("Numero: "+ num);
            if(Methods.esPar(num)) {
                if (maxPar < num)
                    maxPar = num;
            } else {
                    if (minImpar > num)
                        minImpar = num;
                }
          sumatorio+=num;
        }
        media=sumatorio/CANTIDAD_NUMEROS;
        System.out.println("Media: "+media);
    }
}
