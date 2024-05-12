package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio14y15_09;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        FichaDomino f1 = new FichaDomino(6, 1);
        FichaDomino f2 = new FichaDomino(0, 4);
        FichaDomino f3 = new FichaDomino(3, 3);
        FichaDomino f4 = new FichaDomino(0, 1);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);

        System.out.println(f2.voltea());
        System.out.println(f2.encaja(f4));
        System.out.println(f1.encaja(f4));
        System.out.println(f1.encaja(f3));
        System.out.println(f1.encaja(f2));

        System.out.println();

        Random random = new Random();
        FichaDomino fichaAnterior = null;

        for (int i = 0; i < 8; i++) {
            FichaDomino ficha;

            if (i == 0) {
                ficha = generarFichaAleatoria(random);
            } else {
                int ladoIzquierdo = fichaAnterior.getLadoB();
                ficha = generarFichaAleatoriaConLadoIzquierdo(random, ladoIzquierdo);
            }

            System.out.print(ficha);
            fichaAnterior = ficha;
        }
    }

    public static FichaDomino generarFichaAleatoria (Random random){
        int ladoA = random.nextInt(7); // Valores del 0 al 6
        int ladoB = random.nextInt(7); // Valores del 0 al 6
        return new FichaDomino(ladoA, ladoB);
    }

    public static FichaDomino generarFichaAleatoriaConLadoIzquierdo (Random random,int ladoIzquierdo){
        int ladoDerecho = random.nextInt(7); // Valores del 0 al 6
        return new FichaDomino(ladoIzquierdo, ladoDerecho);
    }
}
