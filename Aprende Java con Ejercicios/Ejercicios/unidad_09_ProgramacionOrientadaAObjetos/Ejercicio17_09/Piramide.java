package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio17_09;

public class Piramide {
    //Chatgpt
    private int altura;
    private static int piramidesCreadas = 0;

    public Piramide(int altura) {
        this.altura = altura;
        piramidesCreadas++;
    }

    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }

    @Override
    public String toString() {
        StringBuilder piramideString = new StringBuilder();
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                piramideString.append("*");
            }
            piramideString.append("\n");
        }
        return piramideString.toString();
    }

}
