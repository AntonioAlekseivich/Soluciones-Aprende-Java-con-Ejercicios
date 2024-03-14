package unidad_05_Bucles;

public class Ejercicio52_5 {
    public static void main(String[] args) {
        /*
        Realiza un programa que sea capaz de desplazar todos los dígitos de un número
        de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría a
        dar la vuelta y se colocaría a la derecha. Si el número tiene un solo dígito, se
        queda igual.
        */
         Methods.soutPedirInt();
         int num= Methods.pedirInt();
         String sNum= ""+num,resultado="";
        for (int i = 1; i < sNum.length(); i++) {
            if(!(i==1&&Character.getNumericValue(sNum.charAt(i))==0))
            resultado+=sNum.charAt(i);
        }
        resultado+=sNum.charAt(0);
        System.out.println("El número resultado es "+resultado);
    }
}
