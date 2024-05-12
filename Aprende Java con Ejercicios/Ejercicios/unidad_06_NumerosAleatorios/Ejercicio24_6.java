package unidad_06_NumerosAleatorios;
/*
Escribe un programa que, dado un número introducido por teclado, elija al azar
uno de sus dígitos.
 */
public class Ejercicio24_6 {
    public static void main(String[] args) {
        Methods.soutPedirInt();
        int num = Methods.pedirInt();
        String sNum = ""+num;
        int posicion=Methods.numAleatorioEnRango(0,sNum.length()-1);
        for (int i = 0; i < sNum.length(); i++) {
            if(i==posicion){
                System.out.println(sNum.charAt(i));
            }
        }
    }
}
