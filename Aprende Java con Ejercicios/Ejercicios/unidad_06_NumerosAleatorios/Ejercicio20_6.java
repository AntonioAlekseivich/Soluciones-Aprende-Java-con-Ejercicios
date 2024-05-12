package unidad_06_NumerosAleatorios;

/*
Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
agua. La capacidad será indicada por el usuario. La cuba se llenará con una
cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
pueda admitir. El ancho de la cuba no varía.
 */
public class Ejercicio20_6 {
   public static final int ANCHO=6;

    public static void main(String[] args) {
        System.out.println("Por favor, indique la capacidad de la cuba en litros:\n");
        int capacidad=Methods.pedirInt();
        int agua=Methods.numAleatorioEnRango(0,capacidad);
        for (int i = 0; i < capacidad+1; i++) {
            for (int j = 0; j < ANCHO; j++) {
                if(j==0||j==ANCHO-1||i==capacidad) {
                    System.out.print("*");
                }else if(i>=capacidad-agua){
                    System.out.print("=");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println("La cuba tiene una capacidad de "+capacidad+" litros y contiene "+agua+" litros de agua.");

    }
}
