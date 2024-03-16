package unidad_05_Bucles;

public class Ejercicio63_5 {
    /*
    Realiza un programa que pinte dos pirámides rellenas hechas con asteriscos,
una al lado de la otra y separadas por un espacio en su base.
     */
    public static void main(String[] args) {
        System.out.println("Introduzca la altura de la primera pirámide:");
        int altura1 = Methods.pedirInt();
        System.out.println("Introduzca la altura de la segunda pirámide:");
        int altura2 = Methods.pedirInt();

        for (int i = 0; i < altura1; i++) {
            if(i==0)
            System.out.println(" ".repeat(altura1)+"*");
            else
            System.out.println(" ".repeat(altura1-i)+"*".repeat(i)+"*"+"*".repeat(i)+" ".repeat(altura1-i));

        }
    }

}
