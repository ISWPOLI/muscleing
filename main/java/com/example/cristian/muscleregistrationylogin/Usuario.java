package com.example.cristian.muscleregistrationylogin;

/**
 * Created by Yeison Fernando on 20/10/2016.
 */
public class Usuario {
    private String nombre;
    private String contraseña;
    private String id;

    public Usuario(String n, String c, String i){
        this.nombre=n;
        this.contraseña=c;
        this.id=i;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setId(String id) {
        this.id = id;
    }
}
