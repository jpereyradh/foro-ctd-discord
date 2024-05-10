package presencial;

public class ProxyProducto implements Producto{
    private int id;
    private AlmacenamientoProductos almacenamiento;

    public ProxyProducto(int id, AlmacenamientoProductos almacenamiento) {
        this.id = id;
        this.almacenamiento = almacenamiento;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNombre() {
        Producto producto = almacenamiento.obtenerProducto(id);
        if (producto != null) {
            return producto.getNombre();
        } else {
            return "Producto no encontrado";
        }
    }

    @Override
    public double getPrecio() {
        Producto producto = almacenamiento.obtenerProducto(id);
        if (producto != null) {
            return producto.getPrecio();
        } else {
            return 0.0;
        }

    }
}
