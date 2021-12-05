package comunicacion;

public class Periodico extends Escrito {

    private final String fecha;
    private final String primicia;
    private final String interpretacion;

    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return 0;
    }

    @Override
    public String interpretacion() {
        return this.interpretacion;
    }

    @Override
    public String toString() {
        return null;
    }

    public String getFecha() {
        return fecha;
    }

    public String getPrimicia() {
        return primicia;
    }
}
