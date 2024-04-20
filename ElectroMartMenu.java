import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElectroMartMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Articulo> inventario = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearArticulo();
                    break;
                case 2:
                    modificarArticulo();
                    break;
                case 3:
                    consultarArticulos();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, seleccione nuevamente.");
            }
        } while (opcion != 4);
    }

    // Menu
    private static void mostrarMenu() {
        System.out.println("=====****** Electro Mart ******=====");
        System.out.println("1. Crear articulo");
        System.out.println("2. Modificar articulo");
        System.out.println("3. Consultar articulos");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    // Crea articulos
    private static void crearArticulo() {
        System.out.println("Ingrese los detalles del articulo:");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Descripcion: ");
        String descripcion = scanner.nextLine();

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();

        System.out.print("RAM (en GB): ");
        int ram = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Procesador: ");
        String procesador = scanner.nextLine();

        System.out.println("Tipo de articulo (1: Telefono movil, 2: Laptop): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        Articulo articulo;
        if (tipo == 1) {
            articulo = new TelefonoMovil(nombre, modelo, descripcion, precio, 8, 128);
        } else if (tipo == 2) {
            articulo = new Laptop(nombre, modelo, descripcion, precio, ram, procesador);
        } else {
            System.out.println("Tipo de articulo no valido. No se ha creado el articulo.");
            return;
        }

        inventario.add(articulo);
        System.out.println("Articulo creado con exito. Codigo unico: " + articulo.getCodigo());
    }


    // Modifica articulos
    private static void modificarArticulo() {
        System.out.print("Ingrese el codigo del articulo a modificar: ");
        String codigo = scanner.nextLine();

        Articulo articulo = buscarArticuloPorCodigo(codigo);
        if (articulo == null) {
            System.out.println("No se encontro ningun articulo con ese codigo.");
            return;
        }

        System.out.println("Ingrese los nuevos detalles del articulo:");

        System.out.print("Nuevo precio: ");
        double precio = scanner.nextDouble();
        articulo.setPrecio(precio);

        System.out.println("Articulo modificado con exito.");
    }

    // Consulta articulos
    private static void consultarArticulos() {
        System.out.println("Lista de articulos:");

        for (Articulo articulo : inventario) {
            System.out.println("Codigo: " + articulo.getCodigo());
            System.out.println("Nombre: " + articulo.nombre);
            System.out.println("Precio: " + articulo.precio);
            System.out.println("Descripcion: " + articulo.descripcion);
            System.out.println("--------------------");
        }
    }

// Busca un articulo con el codigo
    private static Articulo buscarArticuloPorCodigo(String codigo) {
        int codigoBuscado = Integer.parseInt(codigo);
        for (Articulo articulo : inventario) {
            if (articulo.getCodigo() == codigoBuscado) {
                return articulo;
            }
        }
        return null;
    }

}