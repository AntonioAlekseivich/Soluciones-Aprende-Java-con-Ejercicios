package unidad_05_Bucles;

public class Ejercicio45_5 {
    public static void main (String[] args) {
        /*
        Escribe un programa que cambie un dígito dentro de un número dando la
posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
empezando por el 1. Se recomienda usar long en lugar de int ya que el
primero admite números más largos. Suponemos que el usuario introduce
correctamente los datos.
         */
        Methods.soutPedirInt();
        long num = Methods.pedirInt();
        System.out.println("Introduzca la posición donde quiere insertar:");
        int posicion = Methods.pedirInt();
        System.out.println("Introduzca el dígito que quiere insertar:");
        int digito = Methods.pedirInt();

        long resultado = Methods.reemplazarDigito(num,posicion,digito);
        System.out.println("El número resultante es "+resultado);

    }
}
