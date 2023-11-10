package com.example.ListarPersonas.model;

public class Usuario {
private int Usuario_id;
private String Nombre;
private String Apellido;

 public Usuario(int usuario_id, String nombre, String apellido) {
        Usuario_id = usuario_id;
        Nombre = nombre;
        Apellido = apellido;
    }


    public int getUsuario_id() {
        return Usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        Usuario_id = usuario_id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }
}
