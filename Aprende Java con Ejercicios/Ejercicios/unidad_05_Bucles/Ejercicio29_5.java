package unidad_05_Bucles;

public class Ejercicio29_5 {
    public static void main(String[] args) {
        int n1 = Methods.pedirInt();
        int n2 = Methods.pedirInt();
        for (int i = 0; i < n1; i++) {
            if(i%n2!=0){
                System.out.println(i);
            }
        }
    }
}

