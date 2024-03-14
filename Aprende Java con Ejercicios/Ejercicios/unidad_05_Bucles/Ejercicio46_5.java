package unidad_05_Bucles;

public class Ejercicio46_5 {
    /*Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
    asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
    que tanto la anchura como la altura sean mayores o iguales que 2, en caso
    contrario se debe mostrar un mensaje de error.
     */
    public static void main (String[] args) {
        int altura=0;
        int anchura=0;

        do{
        System.out.println("Por favor, introduzca la anchura del rectángulo (como mínimo 2):");
         altura=Methods.pedirInt();
        System.out.println("Ahora introduzca la altura (como mínimo 2):");
         anchura=Methods.pedirInt();
         if(altura<2||anchura<2)
             System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2.");
        }while (altura<2||anchura<2);

        for (int i = 0; i < anchura; i++) {//pintamos la parte de arriba
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < altura-2; i++) {//pintamos el medio
            for (int j = 0; j < anchura; j++) {
                if (j == 0 || j == anchura - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 0; i < anchura; i++) {//pintamos la parte de abajo
            System.out.print("*");
        }
    }
}
