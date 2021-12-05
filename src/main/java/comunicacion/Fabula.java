package comunicacion;

public class Fabula extends Escrito {

    private final String ensenanza;
    private final String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
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
        return String.format("%s\n%s\n%s\n%d\n%s", super.getOrigen(), super.getTitulo(), super.getAutor(), super.getPaginas(), this.getEnsenanza());
    }

    public String getEnsenanza() {
        return ensenanza;
    }
}
