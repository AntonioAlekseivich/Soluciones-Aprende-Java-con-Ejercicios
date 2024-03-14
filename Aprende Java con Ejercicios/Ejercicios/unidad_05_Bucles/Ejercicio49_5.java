package unidad_05_Bucles;

public class Ejercicio49_5 {
    public static void main(String[] args) {
        /*
        Realiza un programa que calcule el máximo, el mínimo y la media de una serie
de números enteros positivos introducidos por teclado. El programa terminará
cuando el usuario introduzca un número primo. Este último número no se
tendrá en cuenta en los cálculos. El programa debe indicar también cuántos
números ha introducido el usuario (sin contar el primo que sirve para salir).
         */
        System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:");
        int num=0,contadorNoPrimos=0,numMaximo=0,numMinimo=9999,sumatorio=0;
        double media=0;

        do{
            num=Methods.pedirInt();
            if(!Methods.esPrimo(num)){
            sumatorio+=num;
            contadorNoPrimos++;
            if(numMaximo<num)
                numMaximo=num;
            if(numMinimo>num)
                numMinimo=num;
            }

        }while(!Methods.esPrimo(num));
        media=sumatorio/contadorNoPrimos;

        System.out.println("Ha introducido "+contadorNoPrimos+" números no primos.");
        System.out.println("Máximo: " + numMaximo +
                "\nMínimo: " + numMinimo +
                "\nMedia: " + media);


    }
}
