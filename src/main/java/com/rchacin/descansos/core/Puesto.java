package com.rchacin.descansos.core;

public class Puesto {

    private final int id;
    private final String nombre;
    private final boolean esPiloto;

    public Puesto(int id, String nombre, boolean esPiloto) {

        this.id = id;
        this.nombre = nombre;
        this.esPiloto = esPiloto;

    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEsPiloto() {
        return esPiloto;
    }

    @Override
    public String toString() {
        return  nombre;
    }
}
