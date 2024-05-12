package unidad_08_Funciones;
/*
Muestra los números capicúa que hay entre 1 y 99999.
 */
public class Ejercicio16_08 {
    public static void main(String[] args) {
        for (int i = 1; i < 99999; i++) {
            if (Ejercicio01_al_14_08.esCapicua(i))
                System.out.print(i+" ");
        }
    }
}
