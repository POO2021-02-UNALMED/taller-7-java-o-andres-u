package comunicacion;

public class Libro extends Escrito {

    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    public Libro(String origen, String titulo, String autor, int paginas) {
        super(origen, titulo, autor, paginas);
    }

    @Override
    public int palabrasTotales(int input) {
        return 0;
    }

    @Override
    public String interpretacion() {
        return null;
    }

    @Override
    public String toString() {
        return null;
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
