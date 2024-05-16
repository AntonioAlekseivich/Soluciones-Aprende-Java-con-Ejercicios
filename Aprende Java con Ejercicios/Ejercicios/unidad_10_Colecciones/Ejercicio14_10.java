package unidad_10_Colecciones;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio14_10 {
//Hecho por ChatGpt
        public static void main(String[] args) {
            Map<String, Double> preciosProductos = new HashMap<>();
            preciosProductos.put("avena", 2.21);
            preciosProductos.put("garbanzos", 2.39);
            preciosProductos.put("tomate", 1.59);
            preciosProductos.put("jengibre", 3.13);
            preciosProductos.put("quinoa", 4.50);
            preciosProductos.put("guisantes", 1.60);

            ArrayList<String> compraProductos = new ArrayList<>();
            ArrayList<Integer> compraCantidades = new ArrayList<>();
            ArrayList<Double> compraSubtotales = new ArrayList<>();

            double total = 0.0;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Bienvenido al supermercado de productos ecológicos.");
            System.out.println("Por favor, introduce los productos que deseas comprar y la cantidad.");
            System.out.println("Cuando hayas terminado, escribe 'fin' para finalizar la compra.");

            while (true) {
                System.out.print("Producto: ");
                String producto = scanner.nextLine().toLowerCase();
                if (producto.equals("fin")) {
                    break;
                }
                if (!preciosProductos.containsKey(producto)) {
                    System.out.println("Error: Producto no disponible.");
                    continue;
                }
                System.out.print("Cantidad: ");
                int cantidad = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer de entrada

                double precioUnitario = preciosProductos.get(producto);
                double subtotal = precioUnitario * cantidad;
                total += subtotal;

                compraProductos.add(producto);
                compraCantidades.add(cantidad);
                compraSubtotales.add(subtotal);
            }

            System.out.println("\nProducto   Precio   Cantidad   Subtotal");
            System.out.println("----------------------------------------");
            for (int i = 0; i < compraProductos.size(); i++) {
                System.out.printf("%-10s %7.2f€ %9d %11.2f€%n", compraProductos.get(i),
                        preciosProductos.get(compraProductos.get(i)), compraCantidades.get(i), compraSubtotales.get(i));
            }
            System.out.println("----------------------------------------");
            System.out.printf("TOTAL: %.2f€%n", total);
        }
    }


