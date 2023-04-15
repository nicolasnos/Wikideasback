/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iasoftware.wikideas.models;

/**
 *
 * @author Quiero Ser Digital
 */
public class Tema {
 private int temaID;
 private String nombre;

    public Tema(int temaID, String nombre) {
        this.temaID = temaID;
        this.nombre = nombre;
    }

    public int getTemaID() {
        return temaID;
    }

    public void setTemaID(int temaID) {
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
