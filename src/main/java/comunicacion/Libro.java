package comunicacion;

public class Libro extends Escrito {

    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    public Libro(String origen, String titulo, String autor, int paginas) {
        super(origen, titulo, autor, paginas);
    }

    public int palabrasTotales(int input) {
        return 0;
    }

    public String interpretacion() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}
