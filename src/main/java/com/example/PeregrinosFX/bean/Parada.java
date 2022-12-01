package com.example.PeregrinosFX.bean;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "Parada")
public class Parada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idParada", updatable = false, nullable = false)
    private long idParada;
    private String nombre;
    private char region;

    @ManyToMany(mappedBy = "paradas")
    private ArrayList<Peregrino> peregrinos;

    public Parada() {

    }

    public long getIdParada() {
        return idParada;
    }

    public void setIdParada(long idParada) {
        this.idParada = idParada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getRegion() {
        return region;
    }

    public void setRegion(char region) {
        this.region = region;
    }

    public ArrayList<Peregrino> getPeregrinos() {
        return peregrinos;
    }

    public void setPeregrinos(ArrayList<Peregrino> peregrinos) {
        this.peregrinos = peregrinos;
    }

    @Override
    public String toString() {
        return "Parada{" +
                "idParada=" + idParada +
                ", nombre='" + nombre + '\'' +
                ", region=" + region +
                ", peregrinos=" + peregrinos +
                '}';
    }
}
