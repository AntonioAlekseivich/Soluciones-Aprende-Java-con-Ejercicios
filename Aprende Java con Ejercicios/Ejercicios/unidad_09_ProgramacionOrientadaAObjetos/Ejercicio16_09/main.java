package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio16_09;

public class main {
    public static void main(String[] args) {
        //ChatGpt
        Punto p1 = new Punto(3, 4);
        Punto p2 = new Punto(7, 9);
        Linea l = new Linea(p1, p2);

        System.out.println("Coordenadas del punto 1: " + p1.getX() + ", " + p1.getY());
        System.out.println("Coordenadas del punto 2: " + p2.getX() + ", " + p2.getY());
        System.out.println(l);
    }

}
