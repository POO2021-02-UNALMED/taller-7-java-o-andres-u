package comunicacion;

public class Alfabeto extends Pictograma {

    private final String[] letras;
    private final String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras() {
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

    public String[] getLetras() {
        return letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }
}
