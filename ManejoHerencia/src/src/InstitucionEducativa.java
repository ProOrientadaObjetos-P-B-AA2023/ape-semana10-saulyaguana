public class InstitucionEducativa {
    private String nombre;
    private String siglas;

    // Constructor
    public InstitucionEducativa(String nombre, String siglas) {
        this.nombre = nombre;
        this.siglas = siglas;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    // Getters
    public String getNombre() {
        return  nombre;
    }

    public String getSiglas() {
        return siglas;
    }

}
