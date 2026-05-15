package modelo;

public abstract class Persona {

    protected String nombres;
    protected String apellidos;
    protected String dni;
    protected String contrasena;

    public Persona(String nombres, String apellidos, String dni, String contrasena) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.contrasena = contrasena;
    }

    public boolean iniciarSesion(String dni, String contrasena) {
        return this.dni.equals(dni) && this.contrasena.equals(contrasena);
    }

    public void cerrarSesion() {
        System.out.println("Sesión cerrada.");
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}