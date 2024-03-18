package unidad_06_NumerosAleatorios;

/*
Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.
 */
public class Ejercicio11_6 {
    public static void main(String[] args) {
        int nota = 0, numSuspensos = 0, numSuficientes = 0, numBienes = 0, numNotable = 0, numSobresaliente = 0;

        for (int i = 0; i < 20; i++) {
            nota = (int) (Math.random() * 10 )+ 1;

            if (nota < 5) {
                System.out.println("Suspenso");
                numSuspensos++;
            } else if (nota < 6) {
                System.out.println("Suficiente");
                numSuficientes++;
            } else if (nota < 7) {
                System.out.println("Bien");
                numBienes++;
            } else if (nota < 9) {
                System.out.println("Notable");
                numNotable++;
            } else {
                System.out.println("Sobresaliente");
                numSobresaliente++;
            }
        }
        System.out.println("Suspenso: " + numSuspensos + "\n" +
                "Suficiente: " + numSuficientes + "\n" +
                "Bien: " + numBienes + "\n" +
                "Notable: " + numNotable + "\n" +
                "Sobresaliente: " + numSobresaliente
        );
    }


}
