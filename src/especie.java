public class especie extends Familia{
    private String n_cientifico;

    public especie() {
        super();
    }

    public especie(String nombre, String color, String tipo, String n_familia, String n_cientifico) {
        super(nombre, color, tipo, n_familia);
        this.n_cientifico = n_cientifico;
    }

    public String getN_cientifico() {
        return n_cientifico;
    }

    public void setN_cientifico(String n_cientifico) {
        this.n_cientifico = n_cientifico;
    }
}
