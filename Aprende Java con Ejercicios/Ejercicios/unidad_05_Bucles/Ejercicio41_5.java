package unidad_05_Bucles;

public class Ejercicio41_5 {

  /*  Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
    hay dentro de un número. Se recomienda usar long en lugar de int ya que el
    primero admite números más largos.*/

    public static void main (String[] args) {

        Methods.soutPedirInt();
        String num = "" +Methods.pedirInt();
        int contadorPar=0;
        int contadorImpar=0;
        for (int i = 0; i < num.length(); i++) {
            if(Methods.esPar(Character.valueOf(num.charAt(i)))){
                contadorPar++;
            }
            else{
                contadorImpar++;
            }

        }
        System.out.println("El "+num+" contiene "+contadorPar+" digitos pares y "+contadorImpar+" digitos impares.");
    }

}
