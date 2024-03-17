package unidad_05_Bucles;

public class Ejercicio66_5 {
    /*
    La Guardia Civil de Tráfico nos ha encargado un programa que pinte una señal
para desviar el tráfico hacia la derecha. La señal es una doble flecha con el
vértice apuntando a la derecha. Se pide al usuario la altura de la figura, que
debe ser un número impar mayor o igual que 3. La distancia entre cada flecha
de asteriscos es siempre de 4 espacios. Si la altura introducida por el usuario
no es un número impar mayor o igual que 3, el programa debe mostrar un
mensaje de error.
     */
    public static final int DISTANCIA=3;
    public static void main(String[] args) {
        System.out.println("Por favor, introduzca la altura de la figura:");
        int altura = Methods.pedirNumImparMayorOIgualAUnNumero(3);
        int espaciosIzquierda=0;

        for (int i = 0; i < altura; i++) {

            System.out.println(" ".repeat(espaciosIzquierda)+"*"+" ".repeat(DISTANCIA)+"*");
            if(i<altura/2)
                espaciosIzquierda++;
            else
                espaciosIzquierda--;
        }
    }
}
