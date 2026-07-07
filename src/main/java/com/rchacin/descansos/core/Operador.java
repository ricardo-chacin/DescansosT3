package com.rchacin.descansos.core;

import java.util.ArrayList;
import java.util.List;

public class Operador {

    private final int id;
    private final String nombre;
    private int saldoPendiente;
    private boolean reservaEspecial;
    private  final List<Habilidad> habilidades;

    public Operador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.saldoPendiente = 0;
        this.reservaEspecial = false;
        this.habilidades = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSaldoPendiente() {
        return saldoPendiente;
    }

    public void setSaldoPendiente(int saldoPendiente) {
        this.saldoPendiente = saldoPendiente;
    }

    public boolean isReservaEspecial(){
        return reservaEspecial;
    }

    public void setReservaEspecial(boolean reservaEspecial) {
        this.reservaEspecial = reservaEspecial;
    }

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }

    public  void agregarHabilidad(Habilidad habilidad){
        habilidades.add(habilidad);
    }

    @Override
    public String toString(){
        return nombre + "(saldo: " + saldoPendiente + ")";
    }
}
