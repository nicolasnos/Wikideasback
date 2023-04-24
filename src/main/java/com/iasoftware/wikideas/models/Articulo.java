/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iasoftware.wikideas.models;

import jakarta.persistence.*;


/**
 * @author Tatiana Ramírez
 */

@Entity
@Table(name = "articulo")
public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long articuloID;

    private String titulo;

    private String contenido;

    @OneToOne(mappedBy = "articulo")
    private Publicacion publicacion;

    public Articulo() {
    }

    public Articulo(Long articuloID, String titulo, String contenido) {
        this.articuloID = articuloID;
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public long getArticuloID() {
        return articuloID;
    }

    public void setArticuloID(long articuloID) {
        this.articuloID = articuloID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Articulo{" + "articuloID=" + articuloID + ", titulo=" + titulo + ", contenido=" + contenido + '}';
    }


}
