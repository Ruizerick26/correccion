public class Familia extends Plantas{
    private String n_familia;

    public Familia() {
        super();
    }

    public Familia(String nombre, String color, String tipo, String n_familia) {
        super(nombre, color, tipo);
        this.n_familia = n_familia;
    }

    public String getN_familia() {
        return n_familia;
    }

    public void setN_familia(String n_familia) {
        this.n_familia = n_familia;
    }
}
