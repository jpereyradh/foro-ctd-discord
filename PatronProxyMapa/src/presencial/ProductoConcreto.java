package presencial;

public class ProductoConcreto implements Producto{
    private int id;
    private String nombre;
    private double precio;

    public ProductoConcreto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
