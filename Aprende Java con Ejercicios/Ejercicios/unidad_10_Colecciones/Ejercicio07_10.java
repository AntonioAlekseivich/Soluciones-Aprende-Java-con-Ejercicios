package unidad_10_Colecciones;
import java.util.ArrayList;
import java.util.Random;

public class Ejercicio07_10 {
    /*
    La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa
un botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda
anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25
céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la posición – cara o
cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias
siguiendo la pauta correcta. Cada moneda generada debe ser una instancia de
la clase Moneda y la secuencia se debe ir almacenando en una lista.

     */
    public static void main(String[] args) {
        //Con el enunciado primeramente me dio este codigo. El cual trata de acceder a un objeto nulo.
        /*ArrayList<Moneda> secuencia = new ArrayList<>();
        Moneda monedaAnterior = null;
        Random rand = new Random();

        for (int i = 0; i < 6; i++) {
            Moneda nuevaMoneda;
            if (monedaAnterior == null || rand.nextBoolean()) {
                // Generar una nueva moneda basada en el valor
                int valor;
                do {
                    valor = rand.nextInt(9) + 1;
                } while (valor == monedaAnterior.getValor());
                nuevaMoneda = new Moneda(valor);
            } else {
                // Generar una nueva moneda basada en la posición (cara o cruz)
                nuevaMoneda = new Moneda(!monedaAnterior.isCara());
            }
            secuencia.add(nuevaMoneda);
            monedaAnterior = nuevaMoneda;
        }

        // Mostrar la secuencia de monedas generadas
        System.out.println("Secuencia de monedas generadas:");
        for (Moneda moneda : secuencia) {
            System.out.println(moneda);
        }
    }
}

class Moneda {
    private int valor; // 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25 céntimos, 50 céntimos, 1 euro, 2 euros
    private boolean cara; // true: cara, false: cruz

    public Moneda(int valor) {
        this.valor = valor;
        this.cara = false; // Valor predeterminado para monedas basadas en el valor
    }

    public Moneda(boolean cara) {
        this.cara = cara;
        this.valor = -1; // Valor predeterminado para monedas basadas en la posición
    }

    public int getValor() {
        return valor;
    }

    public boolean isCara() {
        return cara;
    }

    @Override
    public String toString() {
        if (valor != -1) {
            return valor + " céntimos";
        } else {
            return cara ? "Cara" : "Cruz";
        }
    }*/

        //Al meterle la siguiente prompt, lo corrigio.
        //Prompt: Este codigo esta mal. Trata de acceder a getValor en un objeto nulo
        ArrayList<Moneda> secuencia = new ArrayList<>();
        Moneda monedaAnterior = null;
        Random rand = new Random();

        for (int i = 0; i < 6; i++) {
            Moneda nuevaMoneda;
            if (monedaAnterior == null || rand.nextBoolean()) {
                // Generar una nueva moneda basada en el valor
                int valor;
                do {
                    valor = generarValorAleatorio(rand);
                } while (monedaAnterior != null && valor == monedaAnterior.getValor());
                nuevaMoneda = new Moneda(valor, rand.nextBoolean());
            } else {
                // Generar una nueva moneda basada en la posición (cara o cruz)
                nuevaMoneda = new Moneda(monedaAnterior.getValor(), !monedaAnterior.isCara());
            }
            secuencia.add(nuevaMoneda);
            monedaAnterior = nuevaMoneda;
        }

        // Mostrar la secuencia de monedas generadas
        System.out.println("Secuencia de monedas generadas:");
        for (Moneda moneda : secuencia) {
            System.out.println(moneda);
        }
    }

    private static int generarValorAleatorio(Random rand) {
        int[] valores = {1, 2, 5, 10, 25, 50, 100, 200};
        return valores[rand.nextInt(valores.length)];
    }
}

class Moneda {
    private int valor; // en céntimos: 1, 2, 5, 10, 25, 50, 100 (1 euro), 200 (2 euros)
    private boolean cara; // true: cara, false: cruz

    public Moneda(int valor, boolean cara) {
        this.valor = valor;
        this.cara = cara;
    }

    public int getValor() {
        return valor;
    }

    public boolean isCara() {
        return cara;
    }

    @Override
    public String toString() {
        String valorString;
        switch (valor) {
            case 100:
                valorString = "1 euro";
                break;
            case 200:
                valorString = "2 euros";
                break;
            default:
                valorString = valor + " céntimos";
                break;
        }
        return valorString + " - " + (cara ? "Cara" : "Cruz");
    }
    }
