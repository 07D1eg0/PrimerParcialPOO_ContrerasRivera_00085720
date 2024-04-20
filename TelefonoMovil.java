class TelefonoMovil extends Articulo {
    private int ram;
    private int almacenamiento;

    public TelefonoMovil(String nombre, String modelo, String descripcion, double precio, int ram, int almacenamiento) {
        super(nombre, modelo, descripcion, precio);
        this.ram = ram;
        this.almacenamiento = almacenamiento;
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

    public int getAlmacenamiento() {
        return almacenamiento;
    }

}