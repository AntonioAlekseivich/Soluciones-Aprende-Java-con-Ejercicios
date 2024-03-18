package unidad_06_NumerosAleatorios;

public class Methods {
    public static int numAleatorioEnRango(int num1, int num2){
        return (int)(Math.random()*(num2-num1+1))+num2;
    }
}
