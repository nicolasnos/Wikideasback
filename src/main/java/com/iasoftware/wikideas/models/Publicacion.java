/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iasoftware.wikideas.models;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Quiero Ser Digital
 */
public class Publicacion {
   private int publicacionID;
   private Date FechaPublicacion;
   private int temaID;
   private int articuloID;

    public Publicacion(int publicacionID, Date FechaPublicacion, int temaID, int articuloID) {
        this.publicacionID = publicacionID;
        this.FechaPublicacion = FechaPublicacion;
        this.temaID = temaID;
        this.articuloID = articuloID;
    }

    public int getPublicacionID() {
        return publicacionID;
    }

    public void setPublicacionID(int publicacionID) {
        this.publicacionID = publicacionID;
    }

    public Date getFechaPublicacion() {
        return FechaPublicacion;
    }

    public void setFechaPublicacion(Date FechaPublicacion) {
        this.FechaPublicacion = FechaPublicacion;
    }

    public int getTemaID() {
        return temaID;
    }

    public void setTemaID(int temaID) {
        this.temaID = temaID;
    }

    public int getArticuloID() {
        return articuloID;
    }

    public void setArticuloID(int articuloID) {
        this.articuloID = articuloID;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "publicacionID=" + publicacionID + ", FechaPublicacion=" + FechaPublicacion + ", temaID=" + temaID + ", articuloID=" + articuloID + '}';
    }
   
}


