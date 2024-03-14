package unidad_05_Bucles;

public class Ejercicio51_5 {
 /*
 El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8
(todos los que encuentre). Realiza un programa que muestre un número antes
y después de haber sido comido por el gusano. Si el animalito no se ha comido
ningún dígito, el programa debe indicarlo.
  */

    public static void main(String[] args) {
        Methods.soutPedirInt();
        int num = Methods.pedirInt();
        String sNum = "" + num,resultado="";

        boolean encontrado = false;

        for (int i = 0; i < sNum.length(); i++) {
            if(Character.getNumericValue(sNum.charAt(i))==8||Character.getNumericValue(sNum.charAt(i))==0)
                encontrado=true;
            else
                resultado+=sNum.charAt(i);
        }
        if(encontrado)
            System.out.println("Después de haber sido comido por el gusano numérico se queda en "+resultado);
        else
            System.out.println("El gusano numérico no se ha comido ningún dígito.");

    }
}
