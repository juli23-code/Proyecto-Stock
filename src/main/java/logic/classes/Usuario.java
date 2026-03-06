package logic.classes;

import java.pesistence.*;

public class Usuario {
    private int id; //va ser autogenerado por la base de datos
    private String nombre;
    private String password;
    private Rol tipo;

    public Usuario(String nombre, String password, Rol tipo) {
        this.nombre = nombre;
        this.password = password;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
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

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void setPassword(String password) {
        this.password = password;
    }

    void setTipo(Rol tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "NOMBRE = " + nombre + "\nCONTRASEÑA = " + password + "\nTIPO = " + tipo;
    }


}