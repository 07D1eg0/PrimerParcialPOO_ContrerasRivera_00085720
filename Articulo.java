
abstract class Articulo implements Producto {
    protected String nombre;
    protected String modelo;
    protected String descripcion;
    protected double precio;
    protected int codigo;
    private static int codigoBase = 0;

    public Articulo(String nombre, String modelo, String descripcion, double precio) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.codigo = ++codigoBase; // Aument el codigo con cada articulo
    }

    // Getter y setters
    public int getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}