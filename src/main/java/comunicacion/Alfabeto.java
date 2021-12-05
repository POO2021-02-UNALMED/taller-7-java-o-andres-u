package comunicacion;

public class Alfabeto extends Pictograma {

    private static String[] letras;

    private final String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.interpretacion = interpretacion;
        Alfabeto.letras = letras;
    }

    public int cantidadLetras() {
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
}
