package unidad_07_Array.Unidimensionales;
import unidad_07_Array.Methods;

import java.util.*;

/*
Ejercicio 20
Implementa un programa que calcule la denominación ordinal de los reyes de
una secuencia histórica. El programa solicitará la cantidad de reyes que se
van a introducir, y a continuación recibirá los nombres de los reyes. Presentará
por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así,
por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería
aparecer como Felipe 1º y el segundo como Felipe 2º.
 */
public class Ejercicio20_7 {
    public static void main(String[] args) {
        int contador = 0;
        String nombre = "";
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca el número total de nombres de reyes:");
        int cantidad = Methods.pedirNumMinimo(1);
        String [] reyes = new String [cantidad];
        ArrayList<String> ocurrenciasReyes = new ArrayList<>();

        System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.\n");
        do {
            nombre=s.nextLine();
            reyes[contador]=nombre;
            contador++;
        } while (contador < cantidad);

        System.out.println("Los reyes introducidos son:\n");
        for (String nombreRey : reyes) {
            ocurrenciasReyes.add(nombreRey);
            System.out.println(nombreRey+" "+contarOcurrenciasString(ocurrenciasReyes,nombreRey)+"º");
        }
    }
    private static int contarOcurrenciasString (ArrayList<String> array, String elemento){
        int ocurrencias=0;
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).equals(elemento))
                ocurrencias++;
        }
        return ocurrencias;
    }
}
