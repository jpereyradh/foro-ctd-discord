import java.io.Serializable;

class MiObjeto implements Serializable {
    private String mensaje;
    private int valor;

    public MiObjeto(String mensaje, int valor) {
        this.mensaje = mensaje;
        this.valor = valor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public int getValor() {
        return valor;
    }
}
