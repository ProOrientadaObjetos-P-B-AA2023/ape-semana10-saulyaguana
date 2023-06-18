import java.util.Date;

public class PrestamosAutomovil extends Prestamo{
    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante1;
    private double valorAutomovil;
    private double pagoMensualAutomovil;

    // Constructor
    public PrestamosAutomovil(String tipoAutomovil, String marcaAutomovil, Persona garante1, double valorAutomovil) {
        super(new Persona("Carlos", "Guerrero"), new Date(), "Abu Dhabi");
        this.tipoAutomovil = tipoAutomovil;
        this.marcaAutomovil = marcaAutomovil;
        this.garante1 = garante1;
        this.valorAutomovil = valorAutomovil;
    }

    // Setters
    public void setTipoAutomovil(String tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public void setMarcaAutomovil(String marcaAutomovil) {
        this.marcaAutomovil = marcaAutomovil;
    }

    public void setGarante1(Persona garante1) {
        this.garante1 = garante1;
    }

    public void setValorAutomovil(double valorAutomovil) {
        this.valorAutomovil = valorAutomovil;
    }

    // Calculos
    public void calcularValorMensual() {
        this.pagoMensualAutomovil = this.valorAutomovil / super.getTiempoPrestamo().getTime();
    }

    // Getters
    public String getTipoAutomovil() {
        return tipoAutomovil;
    }

    public String getMarcaAutomovil() {
        return marcaAutomovil;
    }

    public Persona getGarante1() {
        return garante1;
    }

    public double getValorAutomovil() {
        return valorAutomovil;
    }

    public double getPagoMensualAutomovil() {
        return pagoMensualAutomovil;
    }

    // ToString

    public String toString () {
        return String.format("PRÉSTAMOS AUTOMOVIL\n" +
                "DATOS DE LA PERSONA" +
                "\nNombre: " +
                "\nApellido: " +
                "\nFECHA" +
                "\nFecha: " +
                "\nLUGAR" +
                "\nCiudad del Prestamo: " +
                "\nDATOS AUTOMÓVIL" +
                "\nTipo de Automóvil: " +
                "\nMarca de Automóvil: " +
                "\nGarante: " +
                "\nValor del Automóvil: " +
                "\nPago Mensual del Automóvil: ",
                super.getBeneficiario().getNombre(), super.getBeneficiario().getApellido(), super.getTiempoPrestamo().getTime(),
                super.getCiudadPrestamo(), this.getTipoAutomovil(), this.getMarcaAutomovil(), this.getGarante1(), this.getValorAutomovil(),
                this.getPagoMensualAutomovil());
    }
}
