package unidad_05_Bucles;

import java.util.Scanner;

public class Ejercicio24_5 {

    /*
    Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
     */
    public static void main(String[] args) {


        System.out.println("Introduzca un numero");
        Scanner sInt = new Scanner(System.in);
        int n = sInt.nextInt();

            String piramide = "";
            int asterisco = n, bloque = 1;

            if (n > 9) {
                asterisco += (n - 9);//si tenemos mas de 9 asteriscos
                //sumamos la diferencia a los asteriscos
            }

            //loop total
            for (int i = n; i > 0; i--) {
                if (bloque > 9) {//una vez empecemos con las decimas, restamos el asterisco sobrante del loop
                    asterisco -= 1;
                }
                //pintamos la primera parte asterisco
                for (int u = asterisco; u > 0; u--) {
                    piramide += " ";
                }
                //pintamos primera parte bloque
                for (int u = 1; u < bloque; u++) {
                    if (u == 1 && bloque > 9) {//como en las decimas los numeros se vuelven impares y los asteriscos quedan pares, agregamos un 0 para igualar el rectangulo
                        piramide += 0;
                    }
                    piramide += u;
                }
                //pintamos segunda parte bloque
                for (int u = bloque; u > 0; u--) {
                    piramide += u;
                }
                //pintamos segunda parte asterisco
                for (int u = asterisco; u > 0; u--) {
                    piramide += " ";
                }
                //modificamos los contadores
                bloque++;
                asterisco--;
                //agregamos un salto de linea
                piramide += "\n";
            }

            //agregamos el ultimo nivel

            if (n > 9) {//Si estamos en decimas, agregamos la diferencia en asteriscos
                for (int i = (((n + (n - 9)) * 2) + 1); i > 0; i--) {
                    piramide += " ";
                }
            } else {
                for (int i = ((n * 2) + 1); i > 0; i--) {
                    piramide += " ";
                }
            }
            System.out.println(piramide);

        }
    }

