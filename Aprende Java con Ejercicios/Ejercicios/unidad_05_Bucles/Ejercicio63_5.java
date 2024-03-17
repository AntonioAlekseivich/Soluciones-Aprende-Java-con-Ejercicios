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

        piramidesDoblesAltura(altura1,altura2);
    }


    public static void piramidesDoblesAltura(int altura1,int altura2) {
        int alturaMayor= Math.max(altura1,altura2);

        int j=((altura1+altura2/2)*2)+1, valor1=0, valor2=0;

        for (int i = 0; i < alturaMayor; i++) {

            //primera piramide
            if(i>=alturaMayor-altura1) {//si hay q pintar la 1 piramide
                System.out.print(" ".repeat(alturaMayor - i));
                System.out.print("*".repeat(2 * valor1 + 1));
                System.out.print(" ".repeat(alturaMayor * 2 - 2 * i));
                valor1++;
            } else{
                System.out.print(" ".repeat(j));
                j--;
            }

            //segunda piramide
            if(i>=alturaMayor-altura2) {
                System.out.print("*".repeat(2 * valor2 + 1));
                valor2++;

            }
                System.out.println();
        }
    }
    }


