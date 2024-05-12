package unidad_06_NumerosAleatorios;
/*
Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. Dentro de
la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo.
 */
public class Ejercicio17_6 {
    public static void main(String[] args) {
        System.out.println("Por favor, introduzca la altura de la pecera (como mínimo 4):");
        int altura = Methods.pedirInt();
        System.out.println("Ahora introduzca la anchura (como mínimo 4):");
        int anchura= Methods.pedirInt();

        //Coordenadas del pez
        int x=Methods.numAleatorioEnRango(1,anchura-2);
        int y=Methods.numAleatorioEnRango(1,altura-2);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                if(i==0||i==altura-1||j==0||j==anchura-1)
                    System.out.print("*");
                else if (j==x && i == y)
                    System.out.print("&");
                else
                    System.out.print(" ");
            }
            System.out.println();//salto de linea
        }
    }


}
