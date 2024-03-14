package unidad_05_Bucles;

public class Ejercicio44_5 {
    public static void main (String[] args) {
        /*Escribe un programa que sea capaz de insertar un dígito dentro de un número
        indicando la posición. El nuevo dígito se colocará en la posición indicada y el
        resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
        izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
        correctamente los datos. Se recomienda usar long en lugar de int ya que el
        primero admite números más largos.
        */
        Methods.soutPedirInt();
        long num = Methods.pedirInt();
        System.out.println("Introduzca la posición donde quiere insertar:");
        int posicion = Methods.pedirInt();
        System.out.println("Introduzca el dígito que quiere insertar:");
        int digito = Methods.pedirInt();

        long resultado = Methods.insertarDigito(num,posicion,digito);
        System.out.println("El número resultante es "+resultado);

    }

}
