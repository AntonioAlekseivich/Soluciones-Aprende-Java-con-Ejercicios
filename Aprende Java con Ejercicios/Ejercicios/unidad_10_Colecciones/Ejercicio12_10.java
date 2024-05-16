package unidad_10_Colecciones;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
public class Ejercicio12_10 {
//Hecho por chatGpt

        public static void main(String[] args) {
            // Definir los valores de las cartas
            HashMap<String, Integer> valoresCartas = new HashMap<>();
            valoresCartas.put("as", 11);
            valoresCartas.put("tres", 10);
            valoresCartas.put("sota", 2);
            valoresCartas.put("caballo", 3);
            valoresCartas.put("rey", 4);

            // Generar una secuencia de 5 cartas de la baraja española
            ArrayList<Carta3> secuencia = generarSecuenciaCartas();

            // Calcular la puntuación total
            int puntuacionTotal = calcularPuntuacion(secuencia, valoresCartas);

            // Mostrar la secuencia de cartas y la puntuación total
            System.out.println("Secuencia de cartas:");
            for (Carta3 carta : secuencia) {
                System.out.println(carta);
            }
            System.out.println("Puntuación total: " + puntuacionTotal);
        }

        // Método para generar una secuencia de 5 cartas de la baraja española
        private static ArrayList<Carta3> generarSecuenciaCartas() {
            ArrayList<Carta3> secuencia = new ArrayList<>();
            Random random = new Random();

            String[] palos = {"oros", "copas", "espadas", "bastos"};
            String[] numeros = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};

            for (int i = 0; i < 5; i++) {
                String palo = palos[random.nextInt(palos.length)];
                String numero = numeros[random.nextInt(numeros.length)];
                secuencia.add(new Carta3(numero, palo));
            }

            return secuencia;
        }

        // Método para calcular la puntuación total de la secuencia de cartas
        private static int calcularPuntuacion(ArrayList<Carta3> secuencia, HashMap<String, Integer> valoresCartas) {
            int puntuacionTotal = 0;
            for (Carta3 carta3 : secuencia) {
                Integer valor = valoresCartas.get(carta3.getNumero());
                if (valor != null) {
                    puntuacionTotal += valor;
                }
            }
            return puntuacionTotal;
        }
    }

    class Carta3 {
        private String numero;
        private String palo;

        public Carta3(String numero, String palo) {
            this.numero = numero;
            this.palo = palo;
        }

        public String getNumero() {
            return numero;
        }

        public String getPalo() {
            return palo;
        }

        @Override
        public String toString() {
            return numero + " de " + palo;
        }
    }


