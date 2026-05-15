package modelo;

public class Cliente extends Persona {

    private int puntos;

    public Cliente(String nombres, String apellidos, String dni, String contrasena) {
        super(nombres, apellidos, dni, contrasena);
        this.puntos = 0;
    }

    public void consultarZonas() {
        System.out.println("Consultando zonas disponibles...");
    }

    public void realizarCompra() {
        System.out.println("Realizando compra...");
    }

    public void consultarCompras() {
        System.out.println("Consultando compras del cliente...");
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}