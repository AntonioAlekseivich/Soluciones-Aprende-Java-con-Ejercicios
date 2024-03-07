package unidad_05_Bucles;

public class Ejercicio32_5 {
    public static void main(String[] args) {
        System.out.println("Por favor, introduzca un número entero positivo:");
        long num = Methods.pedirInt();
        String numS = "" + num;
        String numPar = "";
        int sumatorio = 0;
        for (int i = 0; i < numS.length(); i++) {
            int numAux = Character.getNumericValue(numS.charAt(i));
            if (numAux % 2 == 0) {
                numPar += numAux + " ";
                sumatorio += numAux;
            }
        }
        System.out.println("Digitos pares: " + numPar + "\n"
                +"Suma de los digitos pares: "+sumatorio);
    }
}
