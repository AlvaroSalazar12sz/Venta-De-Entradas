package modelo;

public class Zona {

    private String nombre;
    private int capacidad;
    private int capacidadDisponible;
    private double precio;

    public Zona(String nombre, int capacidad, double precio) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.capacidadDisponible = capacidad;
        this.precio = precio;
    }

    public boolean verificarCapacidad(int cantidad) {
        return cantidad > 0 && cantidad <= capacidadDisponible;
    }

    public boolean disminuirCapacidad(int cantidad) {
        if (verificarCapacidad(cantidad)) {
            capacidadDisponible = capacidadDisponible - cantidad;
            return true;
        }
        return false;
    }

    public void aumentarCapacidad(int cantidad) {
        if (cantidad > 0 && capacidadDisponible + cantidad <= capacidad) {
            capacidadDisponible = capacidadDisponible + cantidad;
        }
    }

    public void mostrarDisponibilidad() {
        System.out.println("Zona: " + nombre);
        System.out.println("Precio: S/ " + precio);
        System.out.println("Capacidad disponible: " + capacidadDisponible);
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getCapacidadDisponible() {
        return capacidadDisponible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setCapacidadDisponible(int capacidadDisponible) {
        this.capacidadDisponible = capacidadDisponible;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}