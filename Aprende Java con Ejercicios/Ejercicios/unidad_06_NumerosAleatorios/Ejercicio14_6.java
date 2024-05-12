package unidad_06_NumerosAleatorios;
/*
Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
programa intentará adivinar el número que estás pensando - un número entre 0
y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
debe preguntar si el número que estás pensando es mayor o menor que el que
te acaba de decir.
*/
public class Ejercicio14_6 {
    public static void main(String[] args) {
        int num=0, numMaximo=99,numMinimo=-1,input=0,intentos=5;

        boolean encontrado=false;

        do{
            num=Methods.numAleatorioEnRango(numMinimo+1,numMaximo-1);
            System.out.println("Estas pensando en el "+num+"?\n" +
                    "1.-Si\n" +
                    "2.-No");
                input=Methods.inputBetween2Num(1,2);
                if(input==1) {

                    encontrado = true;
                    break;
                }else {
                    intentos--;
                    System.out.println("Es mayor o menor?\n" +
                            "1.-Mayor.\n" +
                            "2.-Menor.\n");
                    input = Methods.inputBetween2Num(1, 2);
                    if (input == 1)
                        numMinimo = num;
                    else
                        numMaximo = num;
                }
        } while(intentos>0);

    if(encontrado)
        System.out.println("Numero adivinado!");
    else
        System.out.println("No lo adivine!");

    }
}
