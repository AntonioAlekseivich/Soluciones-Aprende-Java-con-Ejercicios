package unidad_05_Bucles;

public class Ejercicio38_5 {
    /*Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
programa debe pedir la altura. Se debe comprobar que la altura sea un número
impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
     */
    public static void main(String[] args) {
        System.out.println("Por favor, introduzca la altura del reloj de arena");
        int altura=0;

        do{
            altura= Methods.pedirInt();;

            if(altura<3||Methods.esPar(altura))
                System.out.println("Valor no valido.");
        }while(altura<3||Methods.esPar(altura));

        for (int i = 0; i < altura; i++) {//Recorremos la altura

            if(i<altura/2){//si estamos en la primera mitad
                for (int j = 0; j < altura; j++) {//recorremos la anchura
                    if (j >= i && j <= altura - i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" " );
                    }
                }
            }
            else{//Si estamos en la segunda mitad
                for (int j = 0; j < altura; j++) {//recorremos la anchura
                    if (j <= i && j >= altura - i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" " );
                    }

                }
            }
            System.out.println();
        }
    }
    }

