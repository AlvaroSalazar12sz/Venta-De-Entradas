package modelo;

public class Entrada {

    private int numero;
    private String estado;
    private Zona zona;
    private double precio;

    public Entrada(int numero, Zona zona) {
        this.numero = numero;
        this.zona = zona;
        this.precio = zona.getPrecio();
        this.estado = "Vendida";
    }

    public boolean validar() {
        return estado.equals("Vendida");
    }

    public boolean anular() {
        if (estado.equals("Vendida")) {
            estado = "Anulada";
            return true;
        }
        return false;
    }

    public String mostrarDatos() {
        return "Entrada N° " + numero
                + " | Zona: " + zona.getNombre()
                + " | Precio: S/ " + precio
                + " | Estado: " + estado;
    }

    public int getNumero() {
        return numero;
    }

    public String getEstado() {
        return estado;
    }

    public Zona getZona() {
        return zona;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
        this.precio = zona.getPrecio();
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}