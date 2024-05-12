package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio06_09;

public class main {
    public static void main(String[] args) {
        //Chatgpt
        // Test the class
        Tiempo t1 = new Tiempo(0, 30, 40);
        Tiempo t2 = new Tiempo(0, 35, 20);

        System.out.println("Tiempo 1: " + t1);
        System.out.println("Tiempo 2: " + t2);

        t1.suma(t2);
        System.out.println("Suma: " + t1);

        t1 = new Tiempo(1, 0, 0);
        t2 = new Tiempo(0, 35, 20);
        t1.resta(t2);
        System.out.println("Resta: " + t1);
    }
}
