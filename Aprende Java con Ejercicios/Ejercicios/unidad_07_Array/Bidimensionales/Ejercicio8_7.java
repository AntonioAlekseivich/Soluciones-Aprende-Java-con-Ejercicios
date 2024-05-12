package unidad_07_Array.Bidimensionales;

import java.util.Scanner;

/*
Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
se indican del 1 al 8.
 */
public class Ejercicio8_7 {
    public final static int LONGITUD_TABLERO=8;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String posiciones = "El alfil puede moverse en las posiciones: \n";

        System.out.println("Introduzca la posicion del alfil:");
        String posicion = coordenadaCorrecta();

        int xInt = convertirCoordenadaHorizontalAInt(String.valueOf(posicion.charAt(0)));
        int y = Character.getNumericValue(posicion.charAt(1));

        //Sacamos eje superior derecho
        int xAux=xInt, yAux=y;
        while (xAux<LONGITUD_TABLERO && yAux<LONGITUD_TABLERO){

            xAux++;
            yAux++;
            posiciones += convertirCoordenadaHorizontal(xAux)+yAux+" ";
        }
        posiciones+=" || ";

        //Sacamos eje inferior derecho
         xAux=xInt;
         yAux=y;
        while (xAux<LONGITUD_TABLERO && yAux>1){
            xAux++;
            yAux--;
            posiciones += convertirCoordenadaHorizontal(xAux)+yAux+" ";
        }
        posiciones+=" || ";

        //Sacamos eje inferior izquierdo
        xAux=xInt;
        yAux=y;
        while (xAux>1 && yAux>1){
            xAux--;
            yAux--;
            posiciones += convertirCoordenadaHorizontal(xAux)+yAux+" ";
        }
        posiciones+=" || ";

        //Sacamos eje superior izquierdo
        xAux=xInt;
        yAux=y;


        while (xAux>1 && yAux<LONGITUD_TABLERO){
            xAux--;
            yAux++;
            posiciones += convertirCoordenadaHorizontal(xAux)+yAux+" ";
        }
        posiciones+=" || ";

        System.out.println(posiciones);
    }
    private static int convertirCoordenadaHorizontalAInt (String sCoordenada){
        int iCoordenada = switch (sCoordenada){
            case "a" -> 1;
            case "b" -> 2;
            case "c" -> 3;
            case "d" -> 4;
            case "e" -> 5;
            case "f" -> 6;
            case "g" -> 7;
            case "h" -> 8;
            default -> -1;
        };
    return iCoordenada;
    }

    private static String convertirCoordenadaHorizontal (int iCoordenada){
        String sCoordenada = switch (iCoordenada){
            case 1 -> "a";
            case 2 -> "b" ;
            case 3 -> "c";
            case 4 -> "d" ;
            case 5 -> "e";
            case 6 -> "f";
            case 7 -> "g";
            case 8 -> "h";
            default -> "x";
        };
        return sCoordenada;
    }

    private static String coordenadaCorrecta (){
        Scanner s = new Scanner(System.in);
        boolean coordenadaCorrecta=false;
        String coordenada="";
        do {
            coordenada=s.nextLine();
            if(coordenada.charAt(0)>96&&coordenada.charAt(0)<105//Checkamos letra correcta
            && Character.getNumericValue(coordenada.charAt(1))<9 && Character.getNumericValue(coordenada.charAt(1))>0//Checkamos numero en rango
                    && coordenada.length()<3)//Checkamos tamaño del string correcto
                coordenadaCorrecta=true;
            else
                System.out.println("Coordenada no valida");
        }while (!coordenadaCorrecta);
        return coordenada;
    }
}
