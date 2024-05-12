package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio17_09;

public class Rectangulo {
    //Chatgpt
    private int base;
    private int altura;
    private static int rectangulosCreados = 0;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        rectangulosCreados++;
    }

    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }

    @Override
    public String toString() {
        StringBuilder rectanguloString = new StringBuilder();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                rectanguloString.append("*");
            }
            rectanguloString.append("\n");
        }
        return rectanguloString.toString();
    }
}
