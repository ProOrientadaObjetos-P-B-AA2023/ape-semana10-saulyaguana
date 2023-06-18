import java.util.Date;

public class PrestamoEducativo extends Prestamo{
    private String nivelEstudio;
    private String centroEducativo;
    private double valorCarrera;
    private double valorMensual;

    // Constructor
    public PrestamoEducativo(String nivelEstudio, String centroEducativo, double valorCarrera) {
        super(new Persona("Alan", "Wake"), new Date(), "Oregon");
        this.nivelEstudio = nivelEstudio;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;
    }

    // Setters
    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public void setCentroEducativo(String centroEducativo) {
        this.centroEducativo = centroEducativo;
    }

    public void setValorCarrera(double valorCarrera) {
        this.valorCarrera = valorCarrera;
    }

    // Calculos
    public void calcularValorMensual() {
        this.valorMensual = (this.valorCarrera / super.getTiempoPrestamo().getTime()) - 0.1 * (this.valorCarrera / super.getTiempoPrestamo().getTime());
    }

    // Getters
    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public String getCentroEducativo() {
        return centroEducativo;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public double getValorMensual() {
        return valorMensual;
    }

    // ToString

    public String toString() {
        return String.format("Nombre: " +
                "\nApellido: " +
                "\nFecha: " +
                "\nCiudad del Prestamo: " +
                "\nNivel de Estudios: " +
                "\nCentro Educativo; " +
                "\nValor de la Carrera: " +
                "\nValor Mensual: ",
                super.getBeneficiario().getNombre(), super.getBeneficiario().getApellido(), super.getTiempoPrestamo().getTime(),
                this.getNivelEstudio(), this.getCentroEducativo(), this.getValorCarrera(), this.getValorMensual());
    }

}
