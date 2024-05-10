package presencial;

public class Main {
    public static void main(String[] args) {
        // Crear un almacenamiento de productos
        AlmacenamientoProductos almacenamiento = new AlmacenamientoProductosConcreto();

// Crear productos y guardarlos en el almacenamiento
        Producto producto1 = new ProductoConcreto(1, "Camiseta", 20.0);
        Producto producto2 = new ProductoConcreto(2, "Pantalón", 35.0);

        almacenamiento.guardarProducto(producto1);
        almacenamiento.guardarProducto(producto2);

// Crear proxies para los productos
        ProxyProducto proxyProducto1 = new ProxyProducto(1, almacenamiento);
        ProxyProducto proxyProducto2 = new ProxyProducto(2, almacenamiento);

// Acceder a los productos a través de los proxies
        System.out.println("Nombre producto 1: " + proxyProducto1.getNombre());
        System.out.println("Precio producto 2: " + proxyProducto2.getPrecio());
    }
}
