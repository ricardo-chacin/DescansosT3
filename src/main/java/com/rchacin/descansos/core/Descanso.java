package com.rchacin.descansos.core;

import java.time.LocalDate;

    public class Descanso {

        private final int id;
        private final Operador operador;
        private final LocalDate fecha;
        private boolean esIncapacidad;

        public Descanso(int id, Operador operador, LocalDate fecha) {
            this.id = id;
            this.operador = operador;
            this.fecha = fecha;
            this.esIncapacidad = false;
        }

        public int getId() {
            return id;
        }

        public Operador getOperador() {
            return operador;
        }

        public LocalDate getFecha() {
            return fecha;
        }

        public boolean isEsIncapacidad() {
            return esIncapacidad;
        }

        public void setEsIncapacidad(boolean esIncapacidad) {
            this.esIncapacidad = esIncapacidad;
        }

        @Override
        public String toString() {
            return operador.getNombre() + " - " + fecha + (esIncapacidad ? " (incapacidad)" : "");
        }

    }