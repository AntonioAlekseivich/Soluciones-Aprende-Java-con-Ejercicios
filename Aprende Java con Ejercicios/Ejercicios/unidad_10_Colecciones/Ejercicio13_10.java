package unidad_10_Colecciones;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio13_10 {
    /*
    Modifica el programa Gestisimal realizado anteriormente añadiendo las siguientes
mejoras:
• Utiliza una lista en lugar de un array para el almacenamiento de los datos.
• Comprueba la existencia del código en el alta, la baja y la modificación de
artículos para evitar errores.
• Cambia la opción “Salida de stock” por “Venta”. Esta nueva opción permitirá
hacer una venta de varios artículos y emitir la factura correspondiente.
Se debe preguntar por los códigos y las cantidades de cada artículo que
se quiere comprar. Aplica un 21% de IVA.
     */

        static ArrayList<Articulo> almacen = new ArrayList<>();
        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int opcion;

            do {
                mostrarMenu();
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer de entrada

                switch (opcion) {
                    case 1:
                        altaArticulo();
                        break;
                    case 2:
                        bajaArticulo();
                        break;
                    case 3:
                        modificarArticulo();
                        break;
                    case 4:
                        listarArticulos();
                        break;
                    case 5:
                        realizarVenta();
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } while (opcion != 6);
        }

        public static void mostrarMenu() {
            System.out.println("\n*** GESTISIMAL - Menú Principal ***");
            System.out.println("1. Alta de artículo");
            System.out.println("2. Baja de artículo");
            System.out.println("3. Modificación de artículo");
            System.out.println("4. Listado de artículos");
            System.out.println("5. Venta de artículo");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
        }

        public static void altaArticulo() {
            System.out.println("\n*** Alta de Artículo ***");
            System.out.print("Introduce el código del artículo: ");
            String codigo = scanner.nextLine();

            if (existeArticulo(codigo)) {
                System.out.println("Error: El código ya existe.");
                return;
            }

            System.out.print("Introduce la descripción del artículo: ");
            String descripcion = scanner.nextLine();
            System.out.print("Introduce el precio de compra: ");
            double precioCompra = scanner.nextDouble();
            System.out.print("Introduce el precio de venta: ");
            double precioVenta = scanner.nextDouble();
            System.out.print("Introduce el stock del artículo: ");
            int stock = scanner.nextInt();

            almacen.add(new Articulo(codigo, descripcion, precioCompra, precioVenta, stock));
            System.out.println("Artículo dado de alta correctamente.");
        }

        public static void bajaArticulo() {
            System.out.println("\n*** Baja de Artículo ***");
            System.out.print("Introduce el código del artículo a dar de baja: ");
            String codigo = scanner.nextLine();

            if (!existeArticulo(codigo)) {
                System.out.println("Error: El código no existe.");
                return;
            }

            for (Articulo articulo : almacen) {
                if (articulo.getCodigo().equals(codigo)) {
                    almacen.remove(articulo);
                    System.out.println("Artículo dado de baja correctamente.");
                    return;
                }
            }
        }

        public static void modificarArticulo() {
            System.out.println("\n*** Modificación de Artículo ***");
            System.out.print("Introduce el código del artículo a modificar: ");
            String codigo = scanner.nextLine();

            if (!existeArticulo(codigo)) {
                System.out.println("Error: El código no existe.");
                return;
            }

            for (Articulo articulo : almacen) {
                if (articulo.getCodigo().equals(codigo)) {
                    System.out.println("Introduce los nuevos datos del artículo:");
                    System.out.print("Descripción: ");
                    articulo.setDescripcion(scanner.nextLine());
                    System.out.print("Precio de compra: ");
                    articulo.setPrecioCompra(scanner.nextDouble());
                    System.out.print("Precio de venta: ");
                    articulo.setPrecioVenta(scanner.nextDouble());
                    System.out.print("Stock: ");
                    articulo.setStock(scanner.nextInt());
                    System.out.println("Artículo modificado correctamente.");
                    return;
                }
            }
        }

        public static void listarArticulos() {
            System.out.println("\n*** Listado de Artículos ***");
            for (Articulo articulo : almacen) {
                System.out.println(articulo);
            }
        }

        public static void realizarVenta() {
            System.out.println("\n*** Venta de Artículo ***");
            System.out.print("Introduce el código del artículo que deseas vender: ");
            String codigo = scanner.nextLine();

            if (!existeArticulo(codigo)) {
                System.out.println("Error: El código no existe.");
                return;
            }

            for (Articulo articulo : almacen) {
                if (articulo.getCodigo().equals(codigo)) {
                    System.out.print("Introduce la cantidad que deseas vender: ");
                    int cantidad = scanner.nextInt();
                    if (cantidad > articulo.getStock()) {
                        System.out.println("Error: No hay suficiente stock para la venta.");
                        return;
                    }

                    double totalSinIVA = articulo.getPrecioVenta() * cantidad;
                    double totalConIVA = totalSinIVA * 1.21; // Aplicar un 21% de IVA

                    System.out.println("Factura:");
                    System.out.println("Descripción: " + articulo.getDescripcion());
                    System.out.println("Precio unitario: " + articulo.getPrecioVenta());
                    System.out.println("Cantidad: " + cantidad);
                    System.out.println("Total (sin IVA): " + totalSinIVA);
                    System.out.println("Total (con IVA): " + totalConIVA);

                    articulo.setStock(articulo.getStock() - cantidad);
                    System.out.println("Venta realizada correctamente.");
                    return;
                }
            }
        }

        public static boolean existeArticulo(String codigo) {
            for (Articulo articulo : almacen) {
                if (articulo.getCodigo().equals(codigo)) {
                    return true;
                }
            }
            return false;
        }
    }

    class Articulo {
        private String codigo;
        private String descripcion;
        private double precioCompra;
        private double precioVenta;
        private int stock;

        public Articulo(String codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
            this.codigo = codigo;
            this.descripcion = descripcion;
            this.precioCompra = precioCompra;
            this.precioVenta = precioVenta;
            this.stock = stock;
        }

        // Getters y setters

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public double getPrecioCompra() {
            return precioCompra;
        }

        public void setPrecioCompra(double precioCompra) {
            this.precioCompra = precioCompra;
        }

        public double getPrecioVenta() {
            return precioVenta;
        }

        public void setPrecioVenta(double precioVenta) {
            this.precioVenta = precioVenta;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        @Override
        public String toString() {
            return "Código: " + codigo + ", Descripción: " + descripcion + ", Precio de compra: " + precioCompra +
                    ", Precio de venta: " + precioVenta + ", Stock: " + stock;
        }
    }


