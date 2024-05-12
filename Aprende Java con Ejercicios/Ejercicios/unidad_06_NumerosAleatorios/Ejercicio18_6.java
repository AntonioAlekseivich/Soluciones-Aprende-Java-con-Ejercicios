package unidad_06_NumerosAleatorios;
/*
Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
sustituir el color blanco por colores más alegres. Realiza un programa que
genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
naranja.
 */
public class Ejercicio18_6 {
    public static void main(String[] args) {

        int vColor1=0,vColor2=0,vColor3=0;

        do {
            vColor1 = Methods.numAleatorioEnRango(1, 6);
            vColor2 = Methods.numAleatorioEnRango(1, 6);
            vColor3 = Methods.numAleatorioEnRango(1, 6);
        }while(vColor1==vColor2||vColor1==vColor3||vColor2==vColor3);

        String color1=atribuirColor(vColor1);
        String color2=atribuirColor(vColor2);
        String color3=atribuirColor(vColor3);

        System.out.println(color1+" "+color2+" "+color3);
    }
    private static String atribuirColor(int vColor){

        String color= switch (vColor){
            case 1 ->"rojo";
            case 2 -> "azul";
            case 3 -> "verde";
            case 4 -> "amarillo";
            case 5 -> "violeta";
            case 6 -> "naranja";
            default -> "error";
        };
        return color;
    }
}
