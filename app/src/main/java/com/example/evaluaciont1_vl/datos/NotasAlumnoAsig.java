package com.example.evaluaciont1_vl.datos;

import java.io.Serializable;

public class NotasAlumnoAsig implements Serializable { // Se requiere para poder pasar de un intent a otro la clase

    private String nombre;
    private String asignatura;
    private double notaExamen;
    private double notaActividades;
    private double notaFinal;

    public NotasAlumnoAsig(double notaExamen, double notaActividades){
        this.notaExamen = notaExamen;
        this.notaActividades = notaActividades;
    }

    public NotasAlumnoAsig(String nombre, String asignatura, double notaExamen, double notaActividades, double notaFinal){
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.notaExamen = notaExamen;
        this.notaActividades = notaActividades;
        this.notaFinal = notaFinal;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getAsignatura(){
        return this.asignatura;
    }

    public double getNotaExamen(){
        return this.notaExamen;
    }

    public double getNotaFinal(){
        return this.notaFinal;
    }

    public double getNotaActividades(){
        return this.notaActividades;
    }

    public double calcularNotaFinal(){
        if (notaExamen >= 4 && notaActividades >= 7) {
            this.notaFinal = (notaExamen * 0.6) + (notaActividades * 0.4);
        } else if (notaExamen < 4) {
            this.notaFinal = notaExamen;
        } else if (notaActividades < 7) {
            this.notaFinal = (notaExamen * 0.7) + (notaActividades * 0.3);
        }
        return this.notaFinal;
    }
}
