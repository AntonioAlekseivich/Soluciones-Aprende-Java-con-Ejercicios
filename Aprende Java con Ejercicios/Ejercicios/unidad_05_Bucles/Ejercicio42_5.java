package unidad_05_Bucles;

public class Ejercicio42_5 {
    public static void main (String[] args) {
        Methods.soutPedirInt();
        int num =Methods.pedirInt();
        for (int i = num; i < num +5 ; i++) {
            boolean primo = Methods.esPrimo(i);
            if(primo)
                System.out.println(i+ " es primo.");
            else
                System.out.println(i+ " no es primo.");
        }

    }
}

