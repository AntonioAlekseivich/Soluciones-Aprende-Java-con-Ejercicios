package unidad_10_Colecciones;
import java.util.Random;
public class Ejercicio23_10 {
/*
En ajedrez, el valor de las piezas se mide en peones. Una dama vale 9 peones,
una torre 5 peones, un alfil 3, un caballo 2 y un péon vale, lógicamente,
1 peón. Realiza un programa que genere al azar las capturas que ha hecho
un jugador durante una partida. El número de capturas será un valor aleatorio
entre 0 y 15. Hay que tener en cuenta que cada jugador tiene la posibilidad de
capturar algunas de las siguientes piezas (no más): 1 dama, 2 torres, 2 alfiles,
2 caballos y 8 peones. Al final debe aparecer la puntuación total.
 */
//Hecho por chatGpt

        public static void main(String[] args) {
            // Generar aleatoriamente el número de capturas entre 0 y 15
            Random random = new Random();
            int numCapturas = random.nextInt(16);

            // Inicializar contadores para las piezas capturadas
            int numDamas = 0;
            int numTorres = 0;
            int numAlfiles = 0;
            int numCaballos = 0;
            int numPeones = 0;

            // Generar aleatoriamente las piezas capturadas
            for (int i = 0; i < numCapturas; i++) {
                int pieza = random.nextInt(6); // 0: Dama, 1-2: Torre, 3-4: Alfil, 5: Caballo

                switch (pieza) {
                    case 0:
                        if (numDamas < 1) {
                            numDamas++;
                        }
                        break;
                    case 1:
                    case 2:
                        if (numTorres < 2) {
                            numTorres++;
                        }
                        break;
                    case 3:
                    case 4:
                        if (numAlfiles < 2) {
                            numAlfiles++;
                        }
                        break;
                    case 5:
                        if (numCaballos < 2) {
                            numCaballos++;
                        }
                        break;
                    default:
                        break;
                }
            }

            // Calcular la puntuación total
            int puntuacionTotal = numDamas * 9 + numTorres * 5 + numAlfiles * 3 + numCaballos * 2 + numPeones;

            // Mostrar resultados
            System.out.println("Número de capturas realizadas: " + numCapturas);
            System.out.println("Número de damas capturadas: " + numDamas);
            System.out.println("Número de torres capturadas: " + numTorres);
            System.out.println("Número de alfiles capturados: " + numAlfiles);
            System.out.println("Número de caballos capturados: " + numCaballos);
            System.out.println("Número de peones capturados: " + numPeones);
            System.out.println("Puntuación total: " + puntuacionTotal + " peones.");
        }
    }


