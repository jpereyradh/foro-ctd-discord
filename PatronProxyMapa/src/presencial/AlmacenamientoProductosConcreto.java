package presencial;

import java.util.HashMap;
import java.util.Map;

public class AlmacenamientoProductosConcreto implements AlmacenamientoProductos{
    private Map<Integer, Producto> productos;

    public AlmacenamientoProductosConcreto() {
        this.productos = new HashMap<>();
    }

    @Override
    public void guardarProducto(Producto producto) {
        productos.put(producto.getId(), producto);

    }

    @Override
    public Producto obtenerProducto(int id) {
        return productos.get(id);
    }

    @Override
    public void eliminarProducto(int id) {
        productos.remove(id);
    }
}
