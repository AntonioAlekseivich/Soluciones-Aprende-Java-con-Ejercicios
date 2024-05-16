package unidad_10_Colecciones;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Ejercicio21_10 {
    /*
    La asociación “Amigos de los anfibios” nos ha encargado una aplicación
educativa sobre estos animalitos. Crea un programa que pida al usuario el tipo
de anfibio y que, a continuación, nos muestre su hábitat y su alimentación. Si
el tipo de anfibio introducido no existe, se debe mostrar el mensaje “Ese tipo
de anfibio no existe”.
     */

//Hecho por chatGpt

        public static void main(String[] args) {
            // Crear el diccionario de anfibios con su hábitat y alimentación
            Map<String, String[]> anfibios = new HashMap<>();
            anfibios.put("rana", new String[]{"humedales", "insectos"});
            anfibios.put("salamandra", new String[]{"bosques húmedos", "insectos, gusanos"});
            anfibios.put("sapo", new String[]{"zonas húmedas", "insectos, gusanos, pequeños vertebrados"});

            // Pedir al usuario el tipo de anfibio
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce el tipo de anfibio (rana, salamandra o sapo): ");
            String tipoAnfibio = scanner.nextLine().toLowerCase();

            // Mostrar información del anfibio si existe en el diccionario
            if (anfibios.containsKey(tipoAnfibio)) {
                String[] infoAnfibio = anfibios.get(tipoAnfibio);
                System.out.println("Hábitat: " + infoAnfibio[0]);
                System.out.println("Alimentación: " + infoAnfibio[1]);
            } else {
                System.out.println("Ese tipo de anfibio no existe.");
            }
        }
    }




