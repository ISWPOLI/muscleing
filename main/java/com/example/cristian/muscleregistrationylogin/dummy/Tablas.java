package com.example.cristian.muscleregistrationylogin.dummy;

/**
 * Created by Yeison Fernando on 26/09/2016.
 */

public class Tablas {
    public static final String TABLE_NAME = "Datos";
    public static final String id = "ID";
    public static final String nombre = "NOMBRE";
    public static final String user ="USUARIO";
    public static final String contraseña = "CONTRASEÑA";
    public static final String edad = "EDAD";
    public static final String peso = "PESO";
    public static final String talla = "ALTURA";
    public static final String tel = "TELEFONO";
    public static final String TABLA = "create table" +  TABLE_NAME + "("+id+"integer primary key autoincrement,"+nombre+"text,"+user+"text,"+contraseña+"text,"+edad+"INTEGER DEFAULT 0"+peso+"INTEGER DEFAULT 0"+ talla + "text,"+tel+"text,"+");";
    private int key;
    private String name;
    private String usuario;
    private String pass;
    private int age;
    private int weigth;
    private String altura;
    private String phone;

    public Tablas(String name, String usuario, String pass, int age, int weigth, String altura, String phone) {
        this.name = name;
        this.usuario = usuario;
        this.pass = pass;
        this.age = age;
        this.weigth = weigth;
        this.altura = altura;
        this.phone = phone;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
