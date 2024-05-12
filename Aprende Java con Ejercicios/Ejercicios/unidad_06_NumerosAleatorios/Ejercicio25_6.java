package unidad_06_NumerosAleatorios;
/*
Escribe un programa que muestre por pantalla 100 números enteros separados
por un espacio. Los números deben estar generados de forma aleatoria en
un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
 */
public class Ejercicio25_6 {
    public static void main(String[] args) {
        int num=0;
        for (int i = 0; i < 100; i++) {
            num = Methods.numAleatorioEnRango(10,200);
            if(Methods.esPrimo(num))
                System.out.print(" #"+num+"# ");
            else if (num%5==0)
                System.out.print(" ["+num+"] ");
            else
                System.out.print(" "+num+" ");

        }
    }
}
