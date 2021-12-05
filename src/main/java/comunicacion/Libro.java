package comunicacion;

public class Libro extends Escrito {

    private final String co_autor;
    private final String editorial;
    private final String edicion;
    private final String interpretacion;

    public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.co_autor = co_autor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.interpretacion = interpretacion;
    }

    @Override
    public int palabrasTotales(int input) {
        return 0;
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
                %s
                %s""", super.getOrigen(), super.getTitulo(), super.getAutor(), super.getPaginas(), this.getCo_autor(), this.getEditorial(), this.getEdicion());
    }

    public String getCo_autor() {
        return co_autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getEdicion() {
        return edicion;
    }
}
