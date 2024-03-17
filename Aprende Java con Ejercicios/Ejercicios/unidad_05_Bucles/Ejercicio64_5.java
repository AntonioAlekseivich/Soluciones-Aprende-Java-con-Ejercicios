package unidad_05_Bucles;

public class Ejercicio64_5 {
    /*
    Escribe un programa que pinte por pantalla un rectángulo hueco de 6 caracteres
de ancho por 3 de alto y, a continuación, un menú que permita agrandarlo,
achicarlo o cambiar su orientación. Cada vez que el rectángulo se agranda,
se incrementa en 1 tanto su anchura como su altura. Cuando se achica,
se decrementa en 1 su anchura y altura. Por último, cuando se cambia la
orientación, los valores de anchura y altura se intercambian. El valor mínimo
de la altura o la anchura es 2.
     */
    public static final int ANCHURA_INIT=6,ALTURA_INIT=3;
    public static void main(String[] args) {

        int altura=ALTURA_INIT, anchura=ANCHURA_INIT, input=0;
        do {
            Methods.pintarRectangulo(anchura, altura);
            menu();
            input = Methods.pedirInt();
            switch (input) {
                case 1:
                    anchura++;
                    altura++;
                    break;
                case 2:
                    if(altura>2) {
                        anchura--;
                        altura--;
                    } else
                        System.out.println("No se puede achicar mas.");
                    break;
                case 3:
                    int aux = anchura;
                    anchura = altura;
                    altura = aux;
                    break;
                case 4:
                    System.out.println("chao");
                    break;
                default:
                    System.out.println("Valor no valido.");
                    break;
            }
        }while (input!=4);

    }
    private static void menu(){
        System.out.println("1. Agrandarlo\n" +
                "2. Achicarlo\n" +
                "3. Cambiar la orientación\n" +
                "4. Salir\n" +
                "Indique qué quiere hacer con el rectángulo:");
    }
}
