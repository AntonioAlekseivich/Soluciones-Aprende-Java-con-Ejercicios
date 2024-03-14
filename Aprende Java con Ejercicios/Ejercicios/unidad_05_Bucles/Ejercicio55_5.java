package unidad_05_Bucles;

public class Ejercicio55_5 {
        /*
        Realiza un programa que sea capaz de desplazar todos los dígitos de un número
de izquierda a derecha una posición. El dígito de más a la derecha, pasaría a
dar la vuelta y se colocaría a la izquierda. Si el número tiene un solo dígito, se
queda igual.
         */

    public static void main(String[] args) {
        Methods.soutPedirInt();
        int num= Methods.pedirInt();
        String sNum= ""+num,resultado="";

        if(!(Character.getNumericValue(sNum.charAt(sNum.length()-1))==0))
        resultado+=sNum.charAt(sNum.length()-1);
        for (int i = 0; i <sNum.length()-1; i++) {
                resultado+=sNum.charAt(i);
        }

        System.out.println("El número resultado es "+resultado);
    }
}
