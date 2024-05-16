package unidad_10_Colecciones;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio06_10 {
    /*Implementa el control de acceso al área restringida de un programa. Se debe
pedir un nombre de usuario y una contraseña. Si el usuario introduce los
datos correctamente, el programa dirá “Ha accedido al área restringida”. El
usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres
de usuario con sus correspondientes contraseñas deben estar almacenados en
una estructura de la clase HashMap.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> usuarios = new HashMap<>();
        usuarios.put("usuario1", "contraseña1");
        usuarios.put("usuario2", "contraseña2");
        usuarios.put("usuario3", "contraseña3");

        int intentosMaximos = 3;
        boolean accesoConcedido = false;

        for (int intento = 1; intento <= intentosMaximos; intento++) {
            System.out.println("Intento " + intento);
            System.out.print("Nombre de usuario: ");
            String nombreUsuario = scanner.nextLine();
            System.out.print("Contraseña: ");
            String contraseña = scanner.nextLine();

            if (usuarios.containsKey(nombreUsuario) && usuarios.get(nombreUsuario).equals(contraseña)) {
                accesoConcedido = true;
                break;
            } else {
                System.out.println("Nombre de usuario o contraseña incorrectos. Inténtelo de nuevo.");
            }
        }

        if (accesoConcedido) {
            System.out.println("Ha accedido al área restringida.");
        } else {
            System.out.println("Lo siento, no tiene acceso al área restringida.");
        }
    }
}
