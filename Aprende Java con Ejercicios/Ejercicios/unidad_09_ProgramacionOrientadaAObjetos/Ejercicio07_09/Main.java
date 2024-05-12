package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio07_09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Chatgpt
        Scanner scanner = new Scanner(System.in);

        // Crear instancias de las tres zonas con sus respectivas entradas disponibles
        Zona salaPrincipal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);

        int opcion;
        do {
            // Mostrar menú
            System.out.println("Menú:");
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Mostrar número de entradas libres para cada zona
                    System.out.println("Entradas disponibles:");
                    System.out.println("Sala Principal: " + salaPrincipal.getEntradasPorVender());
                    System.out.println("Compra-Venta: " + compraVenta.getEntradasPorVender());
                    System.out.println("VIP: " + vip.getEntradasPorVender());
                    break;
                case 2:
                    // Vender entradas
                    System.out.println("Seleccione la zona (1. Sala Principal, 2. Compra-Venta, 3. VIP): ");
                    int zonaSeleccionada = scanner.nextInt();
                    System.out.println("¿Cuántas entradas desea comprar?");
                    int cantidadEntradas = scanner.nextInt();

                    // Vender entradas según la zona seleccionada
                    switch (zonaSeleccionada) {
                        case 1:
                            salaPrincipal.vender(cantidadEntradas);
                            break;
                        case 2:
                            compraVenta.vender(cantidadEntradas);
                            break;
                        case 3:
                            vip.vender(cantidadEntradas);
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}
