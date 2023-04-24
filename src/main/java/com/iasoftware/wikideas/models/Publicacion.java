/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iasoftware.wikideas.models;

import jakarta.persistence.*;


import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

/**
 * @author Tatiana Martínez
 */

@Entity
@Table(name = "publicacion")
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long publicacionID;

    private LocalDate fechaPublicacion;

    @OneToOne
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;

    @ManyToMany
    private List<Tema> temas = new ArrayList<>();

    public Long getPublicacionID() {
        return publicacionID;
    }

    public void setPublicacionID(Long publicacionID) {
        this.publicacionID = publicacionID;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public List<Tema> getTemas() {
        return temas;
    }

    public void setTemas(List<Tema> temas) {
        this.temas = temas;
    }

    public Publicacion() {
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "publicacionID=" + publicacionID +
                ", fechaPublicacion=" + fechaPublicacion +
                ", articulo=" + articulo +
                ", temas=" + temas +
                '}';
    }
}


