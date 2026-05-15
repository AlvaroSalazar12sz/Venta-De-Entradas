package modelo;

public class Tarjeta {

    private String numero;
    private String nombreTitular;
    private String fechaVencimiento;
    private int cvv;

    public Tarjeta(String numero, String nombreTitular, String fechaVencimiento, int cvv) {
        this.numero = numero;
        this.nombreTitular = nombreTitular;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
    }

    public boolean validarTarjeta() {
        return numero.length() == 16 && cvv >= 100 && cvv <= 999;
    }

    public String obtenerUltimosDigitos() {
        if (numero.length() >= 4) {
            return numero.substring(numero.length() - 4);
        }
        return numero;
    }

    public String getNumero() {
        return numero;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getCvv() {
        return cvv;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
}