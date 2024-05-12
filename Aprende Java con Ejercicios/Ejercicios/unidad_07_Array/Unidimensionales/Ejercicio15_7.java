package unidad_07_Array.Unidimensionales;

import unidad_07_Array.Methods;

/*
Un restaurante nos ha encargado una aplicación para colocar a los clientes en
sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
(mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
“Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
como máximo e intente de nuevo”. Para el grupo que llega, se busca
siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
busca donde haya un hueco para el grupo, por ejemplo si el grupo es de
dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del
programa se ilustra a continuación:
 */
public class Ejercicio15_7 {
    public static void main(String[] args) {

        int[] restaurante = inicializarRestaurante();
        int comensales = 0;
        boolean mesaSentada = false;

        do {
            imprimirRestaurante(restaurante);

            comensales = preguntarComensales();
            if(comensales==-1)
                System.out.println("Gracias, hasta pronto.");
            else {
                mesaSentada = sentarMesaVacia(restaurante, comensales);

                if (!mesaSentada) {
                    mesaSentada = sentarMesaOcupada(restaurante, comensales);
                }

                if (!mesaSentada)
                    System.out.println("Lo siento, en estos momentos no queda sitio.");
            }
        }while (comensales>0);

    }

    private static void imprimirRestaurante(int[] array) {
        System.out.print("Mesa nº: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        System.out.print("Ocupacion: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static int[] inicializarRestaurante() {
        int[] restaurante = new int[10];

        for (int i = 0; i < restaurante.length; i++) {
            restaurante[i] = Methods.numAleatorioEnRango(0, 4);
        }
        return restaurante;
    }

    private static int preguntarComensales() {
        System.out.println("¿Cuantos son? (Introduzca -1 para salir del programa): ");
        int comensales = rangoComensales(-1, 4);
        return comensales;
    }

    private static int rangoComensales(int a, int b) {
        int input;
        do {

            input = Methods.pedirInt();
            if (input < a || input > b) {
                System.out.println("Lo siento, no admitimos grupos de " + input + ", haga grupos de 4 personas\n" +
                        "como máximo e intente de nuevo.");

            }
        } while (input < a || input > b);
        return input;
    }

    private static boolean sentarMesaVacia(int [] restaurante, int comensales){
        boolean mesaSentada=false;
        for (int i = 0; i < restaurante.length; i++) {
            if (restaurante[i] ==0) {
                restaurante[i] = comensales;
                mesaSentada=true;
                System.out.println("Por favor, siéntense en la mesa número "+(i+1));
                break;
            }
        }
        return mesaSentada;
    }

    private static boolean sentarMesaOcupada(int [] restaurante, int comensales){
        boolean mesaSentada=false;
        for (int i = 0; i < restaurante.length; i++) {
            if (restaurante[i] + comensales <=4) {
                restaurante[i] += comensales;
                mesaSentada=true;
                System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número "+(i+1));
                break;
            }
        }
        return mesaSentada;
    }
}
