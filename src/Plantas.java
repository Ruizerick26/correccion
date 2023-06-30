public class Plantas {
    private String nombre;
    private String color;
    private String tipo;

    public Plantas(String nombre, String color, String tipo) {
        this.nombre = nombre;
        this.color = color;
        this.tipo = tipo;
    }

    public Plantas() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
