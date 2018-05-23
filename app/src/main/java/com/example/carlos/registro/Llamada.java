package com.example.carlos.registro;

public class Llamada {
    private  String id;
    private String tipo;
    private String telefono;

    public Llamada(String id, String tipo, String telefono) {
        this.id = id;
        this.tipo = tipo;
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}


