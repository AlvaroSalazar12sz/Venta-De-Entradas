package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Concierto {

    private String nombre;
    private LocalDate fecha;
    private String lugar;
    private ArrayList<Zona> zonas;

    public Concierto(String nombre, LocalDate fecha, String lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.zonas = new ArrayList<>();
    }

    public boolean agregarZona(Zona zona) {
        if (zonas.size() < 4) {
            zonas.add(zona);
            return true;
        }
        return false;
    }

    public boolean eliminarZona(String nombreZona) {
        for (Zona zona : zonas) {
            if (zona.getNombre().equalsIgnoreCase(nombreZona)) {
                zonas.remove(zona);
                return true;
            }
        }
        return false;
    }

    public Zona buscarZona(String nombreZona) {
        for (Zona zona : zonas) {
            if (zona.getNombre().equalsIgnoreCase(nombreZona)) {
                return zona;
            }
        }
        return null;
    }

    public int obtenerCapacidadTotal() {
        int total = 0;

        for (Zona zona : zonas) {
            total = total + zona.getCapacidad();
        }

        return total;
    }

    public int obtenerCapacidadDisponibleTotal() {
        int total = 0;

        for (Zona zona : zonas) {
            total = total + zona.getCapacidadDisponible();
        }

        return total;
    }

    public String mostrarZonas() {
        String texto = "";

        for (Zona zona : zonas) {
            texto = texto + "Zona: " + zona.getNombre()
                    + " | Precio: S/ " + zona.getPrecio()
                    + " | Disponible: " + zona.getCapacidadDisponible()
                    + "\n";
        }

        return texto;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public ArrayList<Zona> getZonas() {
        return zonas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setZonas(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }
}