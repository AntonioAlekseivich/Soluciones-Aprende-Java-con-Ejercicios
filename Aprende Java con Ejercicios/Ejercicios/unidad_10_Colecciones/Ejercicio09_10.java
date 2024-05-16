package unidad_10_Colecciones;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ejercicio09_10 {
    /*
    Modifica el programa anterior de tal forma que las cartas se muestren ordenadas.
Primero se ordenarán por palo: bastos, copas, espadas, oros. Cuando
coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
     */
        public static void main(String[] args) {
            //Hecho por chatGpt.
            //Le faltaron los getters y los setters. Pero eso es facil de generar

            ArrayList<Carta2> baraja = new ArrayList<>();

            // Crear la baraja española
            for (int palo = 0; palo < 4; palo++) {
                for (int numero = 1; numero <= 12; numero++) {
                    Carta2 carta = new Carta2(numero, palo);
                    baraja.add(carta);
                }
            }

            // Mezclar la baraja (opcional)
            Collections.shuffle(baraja);

            // Ordenar las cartas por palo y número
            Collections.sort(baraja, new ComparadorCartas());

            // Mostrar las cartas seleccionadas
            System.out.println("Cartas seleccionadas:");
            for (Carta2 carta : baraja) {
                System.out.println(carta);
            }
        }
    }

    class Carta2 {
        private int numero; // 1 al 12
        private int palo;   // 0: Oros, 1: Copas, 2: Espadas, 3: Bastos

        public Carta2(int numero, int palo) {
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

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public int getPalo() {
            return palo;
        }

        public void setPalo(int palo) {
            this.palo = palo;
        }
    }

    class ComparadorCartas implements Comparator<Carta2> {
        @Override
        public int compare(Carta2 carta1, Carta2 carta2) {
            // Primero comparar por palo
            int comparacionPalo = Integer.compare(carta1.getPalo(), carta2.getPalo());
            if (comparacionPalo != 0) {
                return comparacionPalo;
            }

            // Si los palos son iguales, comparar por número
            return Integer.compare(carta1.getNumero(), carta2.getNumero());
        }
    }


