package unidad_09_ProgramacionOrientadaAObjetos.Arrays.Ejercicio04_09;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    //Hecho por ChatGpt
    //Prompt:
  /*  En java. hazme un programa que se llame coleccion de discos. Con la posibilidad de dar de baja, hacer listado y modificación de los discos. Los discos tendran los siguientes atributos:
        public class Disco {
        private String codigo = "LIBRE";
        private String autor;
        private String titulo;
        private String genero;
        private int duracion; // duración total en minutos
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Disco> discos = new ArrayList<>();

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar disco");
            System.out.println("2. Eliminar disco");
            System.out.println("3. Listar discos");
            System.out.println("4. Modificar disco");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    agregarDisco(scanner, discos);
                    break;
                case 2:
                    eliminarDisco(scanner, discos);
                    break;
                case 3:
                    listarDiscos(discos, scanner);
                    break;
                case 4:
                    modificarDisco(scanner, discos);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    //Prompt:
    /*    Implementa un equals en la clase disco que compare codigo y titulo.
    Despues en el metodo agregar usalo en un bucle para garantizar que antes de agregarlo a la lista de discos, sea unico*/
    private static void agregarDisco(Scanner scanner, ArrayList<Disco> discos) {
        if (discos.size() >= Disco.MAX_DISCOS) {
            System.out.println("La colección de discos está llena. Por favor, elimine un disco antes de agregar uno nuevo.");
            return;
        }

        while (true) {
            System.out.print("Código: ");
            String codigo = scanner.nextLine();
            System.out.print("Título: ");
            String titulo = scanner.nextLine();

            Disco nuevoDisco = new Disco(codigo, "", titulo, "", 0);

            if (discos.contains(nuevoDisco)) {
                System.out.println("El disco ya existe en la colección. Por favor, ingrese un código y título únicos.");
            } else {
                System.out.print("Autor: ");
                String autor = scanner.nextLine();
                System.out.print("Género: ");
                String genero = scanner.nextLine();
                System.out.print("Duración (minutos): ");
                int duracion = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer de entrada

                Disco disco = new Disco(codigo, autor, titulo, genero, duracion);
                discos.add(disco);
                System.out.println("Disco agregado correctamente.");
                break;
            }
        }


    }

    private static void eliminarDisco(Scanner scanner, ArrayList<Disco> discos) {
        System.out.println("\nEliminar disco:");
        System.out.print("Ingrese el código del disco a eliminar: ");
        String codigo = scanner.nextLine();

        boolean discoEncontrado = false;
        for (int i = 0; i < discos.size(); i++) {
            if (discos.get(i).getCodigo().equals(codigo)) {
                discos.remove(i);
                System.out.println("Disco eliminado correctamente.");
                discoEncontrado = true;
                break;
            }
        }
        if (!discoEncontrado) {
            System.out.println("No se encontró ningún disco con ese código.");
        }
    }

    private static void listarDiscos(ArrayList<Disco> discos, Scanner scanner) {
        System.out.println("\nListado de discos:");

        System.out.println("Seleccione el tipo de listado:");
        System.out.println("1. Listado completo");
        System.out.println("2. Listado por autor");
        System.out.println("3. Listado por género");
        System.out.println("4. Listado por duración en rango");

        System.out.print("Elija una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer de entrada

        switch (opcion) {
            case 1:
                listarCompleto(discos);
                break;
            case 2:
                listarPorAutor(discos, scanner);
                break;
            case 3:
                listarPorGenero(discos, scanner);
                break;
            case 4:
                listarPorDuracionEnRango(discos, scanner);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void listarCompleto(ArrayList<Disco> discos) {
        System.out.println("Listado completo de discos:");
        for (Disco disco : discos) {
            System.out.println(disco);
        }
    }

    private static void listarPorAutor(ArrayList<Disco> discos, Scanner scanner) {
        System.out.print("Ingrese el autor: ");
        String autor = scanner.nextLine();

        System.out.println("Listado de discos del autor '" + autor + "':");
        for (Disco disco : discos) {
            if (disco.getAutor().equalsIgnoreCase(autor)) {
                System.out.println(disco);
            }
        }
    }

    private static void listarPorGenero(ArrayList<Disco> discos, Scanner scanner) {
        System.out.print("Ingrese el género: ");
        String genero = scanner.nextLine();

        System.out.println("Listado de discos del género '" + genero + "':");
        for (Disco disco : discos) {
            if (disco.getGenero().equalsIgnoreCase(genero)) {
                System.out.println(disco);
            }
        }
    }

    private static void listarPorDuracionEnRango(ArrayList<Disco> discos, Scanner scanner) {
        System.out.print("Ingrese la duración mínima (en minutos): ");
        int duracionMin = scanner.nextInt();
        System.out.print("Ingrese la duración máxima (en minutos): ");
        int duracionMax = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer de entrada

        System.out.println("Listado de discos con duración entre " + duracionMin + " y " + duracionMax + " minutos:");
        for (Disco disco : discos) {
            if (disco.getDuracion() >= duracionMin && disco.getDuracion() <= duracionMax) {
                System.out.println(disco);
            }
        }
    }


    private static void modificarDisco(Scanner scanner, ArrayList<Disco> discos) {
        System.out.println("\nModificar disco:");
        System.out.print("Ingrese el código del disco a modificar: ");
        String codigo = scanner.nextLine();

        for (Disco disco : discos) {
            if (disco.getCodigo().equals(codigo)) {
                System.out.print("Nuevo autor (deje en blanco para mantener el actual): ");
                String autor = scanner.nextLine();
                if (!autor.isEmpty()) {
                    disco.setAutor(autor);
                }

                System.out.print("Nuevo título (deje en blanco para mantener el actual): ");
                String titulo = scanner.nextLine();
                if (!titulo.isEmpty()) {
                    disco.setTitulo(titulo);
                }

                System.out.print("Nuevo género (deje en blanco para mantener el actual): ");
                String genero = scanner.nextLine();
                if (!genero.isEmpty()) {
                    disco.setGenero(genero);
                }

                System.out.print("Nueva duración en minutos (0 para mantener la actual): ");
                int duracion = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer de entrada
                if (duracion > 0) {
                    disco.setDuracion(duracion);
                }

                System.out.println("Disco modificado correctamente.");
                return;
            }
        }
        System.out.println("No se encontró ningún disco con ese código.");
    }
}
