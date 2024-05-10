package presencial;

public interface AlmacenamientoProductos {
    void guardarProducto(Producto producto);
    Producto obtenerProducto(int id);
    void eliminarProducto(int id);
}
