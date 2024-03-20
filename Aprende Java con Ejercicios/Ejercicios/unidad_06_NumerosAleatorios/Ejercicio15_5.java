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

   String sNota = generarNota();
        do{

        }while()
    }
    private static String generarNota(){
        String sNota="";
        int iNota=0;

        iNota=Methods.numAleatorioEnRango(1,7);
        switch (iNota){
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

    private static String generarCompas(){
        String compas = "";
        for (int i = 0; i < 4; i++) {
            compas += generarNota()+" |";
        }
        return compas;
    }
}
