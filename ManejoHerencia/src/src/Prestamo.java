import java.util.Date;

public class Prestamo {
    private Persona beneficiario;
    private Date tiempoPrestamo;
    private String ciudadPrestamo;

    // Constructor
    public Prestamo(Persona beneficiario, Date tiempoPrestamo, String ciudadPrestamo) {
        this.beneficiario = beneficiario;
        this.tiempoPrestamo = tiempoPrestamo;
        this.ciudadPrestamo = ciudadPrestamo;
    }

    // Setters
    public void setBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public void setTiempoPrestamo(Date tiempoPrestamo) {
        this.tiempoPrestamo = tiempoPrestamo;
    }

    public void setCiudadPrestamo(String ciudadPrestamo) {
        this.ciudadPrestamo = ciudadPrestamo;
    }

    // Getters
    public Persona getBeneficiario() {
        return beneficiario;
    }

    public Date getTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public String getCiudadPrestamo() {
        return ciudadPrestamo;
    }

}
