package unidad_06_NumerosAleatorios;

/*
Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,
la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual
a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente
compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
con dos barras.
d) La última nota de la melodía debe coincidir con la primera.
 */
public class Ejercicio15_5 {
    public static void main(String[] args) {
        //TODO Para tener en cuenta que la ultima nota es igual a la primera *done
        //Hay que sacar el codigo de los metodos
        //queda un void largo, pero funciona

        String sNota = "";
        String compas;
        String melodia = "";
        int iNota = 0, iNotaPrimera = 0, iNotaUltima = 0;
        int contadorNotas = 0;

        do {//Bucle de la melodia

            compas= "";//Reseteamos el compas
            for (int i = 0; i < 4; i++) {//Bucle del compas

                iNota = Methods.numAleatorioEnRango(1, 7);//Pillamos la nota
                sNota=atribuirNota(iNota);

                if (contadorNotas==0) {//Pillamos la primera nota de la melodia
                    iNotaPrimera = iNota;;
                }
                contadorNotas++;

                if (i == 3)//Pillamos la ultima nota del compas
                    iNotaUltima = iNota;

                if(contadorNotas==28)//Si estamos en la ultima nota
                    sNota=atribuirNota(iNotaPrimera);//Nos aseguramos que sea igual a la primera

                compas += sNota + " ";
            }

            melodia += compas + "|";


        } while(iNotaPrimera!=iNotaUltima&&contadorNotas<28);

        System.out.println(melodia);
    }
    private static String atribuirNota(int iNota){
        String sNota="";

        switch (iNota) {
            case 1:
                sNota = "do";
                break;
            case 2:
                sNota = "re";
                break;
            case 3:
                sNota = "mi";
                break;
            case 4:
                sNota = "fa";
                break;
            case 5:
                sNota = "sol";
                break;
            case 6:
                sNota = "la";
                break;
            case 7:
                sNota = "si";
                break;
            default:
                System.out.println("error");
        }
        return sNota;

    }
}
