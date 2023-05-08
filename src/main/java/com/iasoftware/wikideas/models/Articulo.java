package com.iasoftware.wikideas.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.HashSet;

import java.util.Set;


/**
 * @author Tatiana Martínez
 */

@Entity
@Table(name = "articulo")
public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long articuloID;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "contenido")
    private String contenido;

    @JsonBackReference // <- esto evita problemas de recursividad y serialización. Si esto no se agrega vamos a corromper los datos de las tablas y a crear registros infinitos
    @ManyToMany
    @JoinTable(name = "publicacion",
            joinColumns = @JoinColumn(name = "articulo_id", referencedColumnName = "articuloID"),
            inverseJoinColumns = @JoinColumn(name = "tema_id", referencedColumnName = "temaID"))
    private Set<Tema> temas = new HashSet<>();


    public Articulo() {
    }

    public Long getArticuloID() {
        return articuloID;
    }

    public void setArticuloID(Long articuloID) {
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

    public Set<Tema> getTemas() {
        return temas;
    }

    public void setTemas(Set<Tema> temas) {
        this.temas = temas;
    }

    @Override
    public String toString() {
        return "Articulo{" + "articuloID=" + articuloID + ", titulo=" + titulo + ", contenido=" + contenido + '}';
    }


}
