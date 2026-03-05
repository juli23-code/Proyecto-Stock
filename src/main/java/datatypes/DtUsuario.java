package datatypes;

public class DtUsuario {
    private int id;
    private String nombre;
    private String password;
    private Rol tipo;

    //Registrar usuario
    public DtUsuario(String nombre, String password, Rol tipo) {
        this.nombre = nombre;
        this.password = password;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
            return password;
    }

    public Rol getTipo() {
        return tipo;
    }


    @Override
    public String toString() {
        return "NOMBRE = " + nombre + "\nCONTRASEÑA = " + password + "\nTIPO = " + tipo;
    }
}
