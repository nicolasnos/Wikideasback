/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iasoftware.wikideas.models;

/**
 *
 * @author Quiero Ser Digital
 */
public class Articulo {
   private int articuloID;
   private String titulo;
   private String contenido;

    public Articulo(int articuloID, String titulo, String contenido) {
        this.articuloID = articuloID;
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public int getArticuloID() {
        return articuloID;
    }

    public void setArticuloID(int articuloID) {
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
