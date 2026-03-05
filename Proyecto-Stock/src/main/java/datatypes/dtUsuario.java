package datatypes;

public class dtUsuario {
    private String nombre;
    private String correo;
    private String password;

    public dtUsuario(String nombre, String correo, String password) {
        super();
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "NOMBRE = " + nombre + "\nCORREO = " + correo + "\nCONTRASEÑA = " + password;

    }
}
