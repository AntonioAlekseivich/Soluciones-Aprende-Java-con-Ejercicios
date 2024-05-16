package unidad_10_Colecciones;
import java.util.ArrayList;
import java.util.Collections;
public class Ejercicio08_10 {
    /*Realiza un programa que escoja al azar 10 cartas de la baraja española
(10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
almacenarlas y asegúrate de que no se repite ninguna.
     */

        public static void main(String[] args) {
            ArrayList<Carta2> baraja = new ArrayList<>();

            // Crear la baraja española
            for (int palo = 0; palo < 4; palo++) {
                for (int numero = 1; numero <= 12; numero++) {
                    Carta2 carta = new Carta2(numero, palo);
                    baraja.add(carta);
                }
            }

            // Mezclar la baraja
            Collections.shuffle(baraja);

            // Seleccionar las primeras 10 cartas asegurándose de que no se repitan
            ArrayList<Carta2> mano = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                Carta2 nuevaCarta = baraja.remove(0); // Tomar la primera carta de la baraja
                if (!mano.contains(nuevaCarta)) {
                    mano.add(nuevaCarta);
                } else {
                    i--; // Si la carta ya está en la mano, intentar nuevamente
                }
            }

            // Mostrar las cartas seleccionadas
            System.out.println("Cartas seleccionadas:");
            for (Carta2 carta : mano) {
                System.out.println(carta);
            }
        }
    }

    class Carta {
        private int numero; // 1 al 12
        private int palo;   // 0: Oros, 1: Copas, 2: Espadas, 3: Bastos

        public Carta(int numero, int palo) {
            this.numero = numero;
            this.palo = palo;
        }

        @Override
        public String toString() {
            String nombreNumero;
            switch (numero) {
                case 1:
                    nombreNumero = "As";
                    break;
                case 10:
                    nombreNumero = "Sota";
                    break;
                case 11:
                    nombreNumero = "Caballo";
                    break;
                case 12:
                    nombreNumero = "Rey";
                    break;
                default:
                    nombreNumero = String.valueOf(numero);
            }

            String nombrePalo;
            switch (palo) {
                case 0:
                    nombrePalo = "Oros";
                    break;
                case 1:
                    nombrePalo = "Copas";
                    break;
                case 2:
                    nombrePalo = "Espadas";
                    break;
                case 3:
                    nombrePalo = "Bastos";
                    break;
                default:
                    nombrePalo = "Desconocido";
            }

            return nombreNumero + " de " + nombrePalo;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Carta otraCarta = (Carta) obj;
            return numero == otraCarta.numero && palo == otraCarta.palo;
        }

        @Override
        public int hashCode() {
            return 31 * numero + palo;
        }
    }



