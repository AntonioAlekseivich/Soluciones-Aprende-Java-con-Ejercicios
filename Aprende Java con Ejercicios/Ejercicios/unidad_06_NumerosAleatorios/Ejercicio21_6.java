package unidad_06_NumerosAleatorios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/*
Realiza un programa que genere una secuencia de cinco monedas de curso
legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
posiciones posibles son cara y cruz.
 */
public class Ejercicio21_6 {
    public static final String
            MONEDA1 = "1 centimos",
            MONEDA2 = "2 centimos",
            MONEDA3 = "5 centimos",
            MONEDA4 = "10 centimos",
            MONEDA5 = "20 centimos",
            MONEDA6 = "50 centimos",
            MONEDA7 = "1 euro",
            MONEDA8 = "2 euros";

    public static void main(String[] args) {

        ArrayList<Integer> vMonedas = new ArrayList<Integer>();
        ArrayList<String> monedas = new ArrayList<String>();

        Random randomGenerator = new Random();//Generamos en un arraylist 5 valores en rango de 1 a 8 no repe
        while (vMonedas.size() < 5) {
            int random = randomGenerator .nextInt(1,8);
            if (!vMonedas.contains(random)) {
                vMonedas.add(random);
            }
        }

        for (int i = 0; i < vMonedas.size(); i++) {//Generamos su correspondiente string
            monedas.add(atribuirValor(vMonedas.get(i)));
        }

        HashMap<String, Boolean> tiradaMonedas = new HashMap<>();

        for (int i = 0; i < monedas.size(); i++) {
            Random random = new Random();
            tiradaMonedas.put(monedas.get(i), random.nextBoolean());
        }

        tiradaMonedas.forEach((key, value) -> System.out.println(key + " " + value));
    }
    private static String atribuirValor(int iValor){

        String sValor=  switch (iValor){
            case 1 -> MONEDA1;
            case 2 -> MONEDA2;
            case 3 -> MONEDA3;
            case 4 -> MONEDA4;
            case 5 -> MONEDA5;
            case 6 -> MONEDA6;
            case 7 -> MONEDA7;
            case 8 -> MONEDA8;
            default -> "error";
        };
        return sValor;
    }
}
