package com.travelocity.models;

public class Usuario {

    private final String nombre;
    private final String apellido;
    private final String password;

    public Usuario(String nombre, String apellido, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPassword() {
        return password;
    }
}
