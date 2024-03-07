package unidad_05_Bucles;

public class Ejercicio34_5 {
    /*
    Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando los
dígitos de la siguiente manera: primer dígito del primer número, primer dígito
del segundo número, segundo dígito del primer número, segundo dígito del
segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
podemos suponer que el usuario introducirá dos números de la misma longitud
y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
int donde sea necesario para admitir números largos.
     */
    public static void main(String[] args) {

        System.out.println("Por favor, introduzca un número:");
        long n1 = Methods.pedirInt();
        System.out.println("Introduzca otro número:");
        long n2 = Methods.pedirInt();
        String par="", impar="", s1 = ""+n1, s2=""+n2;

        for (int i = 0; i < s1.length(); i++) {
            if(Methods.esPar(Integer.parseInt(String.valueOf(s1.charAt(i))))){
                par+=s1.charAt(i);
            }else{
                impar+=s1.charAt(i);
            }
            if(Methods.esPar(Integer.parseInt(String.valueOf(s2.charAt(i))))){
                par+=s2.charAt(i);
            }else{
                impar+=s2.charAt(i);
            }
        }
        System.out.println("El numero formado por los digitos pares es "+par+"\n"
                +"El número formado por los dígitos impares es "+impar
        );
    }

}
