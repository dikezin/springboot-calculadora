package com.dike.calculadoraapi.model;

public class Usuario {
    private String nombre;
    private String correo;
    private Long id;
    public Usuario (String nombre, String correo, Long id){
        this.correo=correo;
        this.id=id;
        this.nombre=nombre;
    }

    public Long getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
