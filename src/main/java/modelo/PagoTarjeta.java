package modelo;

import java.time.LocalDateTime;

public class PagoTarjeta {

    private static int contadorPagos = 1;

    private int idPago;
    private Tarjeta tarjeta;
    private double monto;
    private LocalDateTime fechaPago;
    private String estadoPago;
    private String codigoAutorizacion;

    public PagoTarjeta(Tarjeta tarjeta, double monto) {
        this.idPago = contadorPagos++;
        this.tarjeta = tarjeta;
        this.monto = monto;
        this.fechaPago = LocalDateTime.now();
        this.estadoPago = "Pendiente";
        this.codigoAutorizacion = "";
    }

    public boolean validarPago() {
        return monto > 0 && tarjeta != null && tarjeta.validarTarjeta();
    }

    public boolean procesarPago() {
        if (validarPago()) {
            confirmarPago();
            return true;
        } else {
            rechazarPago();
            return false;
        }
    }

    public void confirmarPago() {
        this.estadoPago = "Confirmado";
        this.codigoAutorizacion = "AUTH-" + idPago + "-" + tarjeta.obtenerUltimosDigitos();
    }

    public void rechazarPago() {
        this.estadoPago = "Rechazado";
        this.codigoAutorizacion = "";
    }

    public String mostrarDetallePago() {
        return "Pago N° " + idPago
                + "\nMonto: S/ " + monto
                + "\nEstado: " + estadoPago
                + "\nFecha: " + fechaPago
                + "\nTarjeta: **** **** **** " + tarjeta.obtenerUltimosDigitos()
                + "\nCódigo de autorización: " + codigoAutorizacion;
    }

    public int getIdPago() {
        return idPago;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public double getMonto() {
        return monto;
    }

    public LocalDateTime getFechaPago() {
        return fechaPago;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public String getCodigoAutorizacion() {
        return codigoAutorizacion;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }
}