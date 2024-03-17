package unidad_05_Bucles;

/*
Realiza un programa que pinte una pirámide maya. Por los lados, se trata
de una pirámide normal y corriente. Por el centro se van pintando líneas de
asteriscos de forma alterna (empezando por la superior): la primera se pinta,
la segunda no, la tercera sí, la cuarta no, etc. La terraza de la pirámide siempre
tiene 6 asteriscos, por tanto, las líneas centrales que se añaden a la pirámide
normal tienen 4 asteriscos. El programa pedirá la altura. Se supone que el
usuario introducirá un número entero mayor o igual a 3; no es necesario
comprobar los datos de entrada.
 */
public class Ejercicio69_5 {
    public static final int ANCHURA = 4;

    public static void main(String[] args) {
        System.out.println("Introduzca la altura de la pirámide maya:");
        int altura = Methods.pedirInt();
        String caracter = "";

        for (int i = 0; i < altura; i++) {
            System.out.print(" ".repeat(altura - i));

            if (Methods.esPar(i))
               caracter="*";
            else
                caracter=" ";

            System.out.println("*".repeat(i+1)+caracter.repeat(ANCHURA)+"*".repeat(i + 1));
        }
    }
}
