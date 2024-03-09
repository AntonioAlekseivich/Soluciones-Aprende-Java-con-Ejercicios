package unidad_05_Bucles;

public class Ejercicio36_5 {
    public static void main(String[] args) {
        /*
        Escribe un programa que diga si un número introducido por teclado es o no
capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
programa debe aceptar números de cualquier longitud siempre que lo permita
el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
long en lugar de int ya que el primero admite números más largos.
         */
        System.out.println("Por favor, introduzca un número entero positivo:");
        long n = Methods.pedirInt();
        if(Methods.esCapicua(n))
            System.out.println("El "+n+" es capicúa.");
        else
            System.out.println("El "+n+" no es capicúa.");
    }
}
