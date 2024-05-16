package unidad_10_Colecciones;
import java.util.ArrayList;
public class Ejercicio01_10 {
    /*Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
odo el ArrayList sin usar ningún índice.
     */
        public static void main(String[] args) {
            //Hecho por chatGpt
            // Crear un ArrayList con los nombres de los compañeros de clase
            ArrayList<String> nombres = new ArrayList<>();
            nombres.add("Juan");
            nombres.add("María");
            nombres.add("Pedro");
            nombres.add("Ana");
            nombres.add("Luis");
            nombres.add("Elena");

            // Mostrar los nombres por pantalla utilizando un bucle for sin índices
            System.out.println("Nombres de compañeros de clase:");
            for (String nombre : nombres) {
                System.out.println(nombre);

        }
    }

}
