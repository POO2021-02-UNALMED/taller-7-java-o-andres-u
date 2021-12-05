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

    public String getEnsenanza() {
        return ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }
}
