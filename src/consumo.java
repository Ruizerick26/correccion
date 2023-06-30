public class consumo extends especie{
    private String consu;
    public  consumo(){
        super();
    }
    public consumo(String nombre, String color, String tipo, String n_familia, String n_cientifico, String consu) {
        super(nombre, color, tipo, n_familia, n_cientifico);
        this.consu = consu;
    }

    public String getConsu() {
        return consu;
    }

    public void setConsu(String consu) {
        this.consu = consu;
    }
}
