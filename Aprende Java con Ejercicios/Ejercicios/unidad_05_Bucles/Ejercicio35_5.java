package unidad_05_Bucles;

public class Ejercicio35_5 {
    public static void main(String[] args) {
        /*
        Realiza un programa que pinte una X hecha de asteriscos. El programa debe
pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
igual a 3, en caso contrario se debe mostrar un mensaje de error.
         */
        System.out.println("Por favor, introduzca la altura de la X:");
        int altura=0;
        int contador=0;
        do{
             altura= Methods.pedirInt();
             if(altura<3||Methods.esPar(altura))
                 System.out.println("Valor no valido.");
        }while(altura<3||Methods.esPar(altura));

        for (int i = 0; i < altura; i++) {

        }
    }
}
