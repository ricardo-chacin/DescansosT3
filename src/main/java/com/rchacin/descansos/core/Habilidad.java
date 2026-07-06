package com.rchacin.descansos.core;

public class Habilidad {

    private final Puesto puesto;
    private  final int prioridad; //1 = principal, 2 = secundaria, ....

    public Habilidad(Puesto puesto, int prioridad) {
        this.puesto = puesto;
        this.prioridad = prioridad;

    }

    public Puesto getPuesto() {
        return puesto;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override

    public String toString() {
        return puesto.getNombre() + "(prioridad" + prioridad + ")";
    }
}
