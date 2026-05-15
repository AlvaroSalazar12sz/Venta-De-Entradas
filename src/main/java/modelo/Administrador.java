package modelo;

public class Administrador extends Persona {

    private boolean estado;

    public Administrador(String nombres, String apellidos, String dni, String contrasena) {
        super(nombres, apellidos, dni, contrasena);
        this.estado = true;
    }

    public void registrarZona() {
        System.out.println("Registrando zona...");
    }

    public void modificarZona() {
        System.out.println("Modificando zona...");
    }

    public void eliminarZona() {
        System.out.println("Eliminando zona...");
    }

    public void consultarVentas() {
        System.out.println("Consultando ventas...");
    }

    public void supervisarCapacidad() {
        System.out.println("Supervisando capacidad de zonas...");
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}