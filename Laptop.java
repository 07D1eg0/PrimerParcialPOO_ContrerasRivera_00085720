class Laptop extends Articulo {
    private int ram;
    private String procesador;

    public Laptop(String nombre, String modelo, String descripcion, double precio, int ram, String procesador) {
        super(nombre, modelo, descripcion, precio);
        this.ram = ram;
        this.procesador = procesador;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    public int getRam() {
        return ram;
    }

    public String getProcesador() {
        return procesador;
    }
}