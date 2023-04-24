/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iasoftware.wikideas.models;

import jakarta.persistence.*;


/**
 * @author Tatiana Martínez
 */

@Entity
public class Tema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long temaID;

    private String nombre;


    public Tema(Long temaID, String nombre) {
        this.temaID = temaID;
        this.nombre = nombre;
    }

    public Tema() {
    }

    public Long getTemaID() {
        return temaID;
    }

    public void setTemaID(Long temaID) {
        this.temaID = temaID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Tema{" + "temaID=" + temaID + ", nombre=" + nombre + '}';
    }

}
