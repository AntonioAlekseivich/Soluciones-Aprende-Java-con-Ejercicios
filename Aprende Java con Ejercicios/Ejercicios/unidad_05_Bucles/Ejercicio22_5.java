package unidad_05_Bucles;

public class Ejercicio22_5 {

    public static void main (String[] args){
//        Muestra por pantalla todos los números esPrimos entre 2 y 100, ambos incluidos.
        for (int i  = 2; i < 100 ; i++){
            if(esPrimo(i)) {
                System.out.println(i);
            }
            }
    }
    public static boolean esPrimo(int n){
        boolean esPrimo=true;
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                esPrimo=false;
                break;
            }
        }
        return esPrimo;
    }

}
