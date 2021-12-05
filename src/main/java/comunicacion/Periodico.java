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
        return super.getPaginas() * palabrasPagina;
    }

    @Override
    public String interpretacion() {
        return this.interpretacion;
    }

    @Override
    public String toString() {
        return String.format("""
                %s
                %s
                %s
                %d
                %s
                %s""", super.getOrigen(), super.getTitulo(), super.getAutor(), super.getPaginas(), this.getFecha(), this.getPrimicia());
    }

    public String getFecha() {
        return fecha;
    }

    public String getPrimicia() {
        return primicia;
    }
}
