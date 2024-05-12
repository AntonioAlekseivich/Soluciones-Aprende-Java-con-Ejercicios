package unidad_08_Funciones;

public class Figuras {
    public static void valle(char caracter, int altura) {
        for (int i = altura; i > 0; i--) {
            // Print the line for the first triangle (faces right)
            Figuras.linea(caracter, altura - i);

            Figuras.linea(' ', i-1);//empty spaces
            Figuras.linea(' ', i-1);

            // Print the line for the second triangle (faces left)
            Figuras.linea(caracter, altura - i);

            System.out.println(); // Move to the next line
        }
    }
    public static void trianguloDerechaHueco(char caracter, int altura) {
        for (int i = 0; i < altura; i++) {
            Figuras.linea(' ', i); // Print spaces before asterisks
            if(i==0)
                Figuras.linea('*', altura - i);
            else
                Figuras.lineaHueca('*', altura - i); // Print asterisks
            System.out.println(); // Move to the next line
        }
    }
    public static void trianguloDerecha(char caracter, int altura) {
        for (int i = 0; i < altura; i++) {
            Figuras.linea(' ', i); // Print spaces before asterisks
            Figuras.linea('*', altura - i); // Print asterisks
            System.out.println(); // Move to the next line
        }
    }
    public static void trianguloRelleno(char caracter, int altura) {

        for (int i = altura; i > 0; i--) {
            linea(caracter, i);
        }
    }

    public static void trianguloHueco(char caracter, int altura){
        for (int i = altura; i > 0; i--) {
            if(i==0||i==altura)
                linea(caracter,i);
            else
                lineaHueca(caracter,i);
        }
    }
    public static void lineaHueca(char caracter, int repeticiones){
        for (int i = 0; i < repeticiones; i++) {
            if(i==0||i==repeticiones-1)
                System.out.print(caracter);
            else
                System.out.print(" ");
        }

    }
    public static void linea (char caracter, int repeticiones){
        for (int i = 0; i < repeticiones; i++) {
            System.out.print(caracter);
        }

    }
}
