package comunicacion;

public class Tesis extends Escrito {

    private static String[] argumentos;

    private final String idea;
    private final String conclusion;
    private final String referencias;
    private final String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
        Tesis.argumentos = argumentos;
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

    public String getIdea() {
        return idea;
    }

    public String[] getArgumentos() {
        return argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public String getReferencias() {
        return referencias;
    }
}
