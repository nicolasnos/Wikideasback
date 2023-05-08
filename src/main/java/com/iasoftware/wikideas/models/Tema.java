
package com.iasoftware.wikideas.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;


/**
 * @author Tatiana Martínez
 */

@Entity
@Table(name = "tema")
public class Tema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "temaID")
    private Long temaID;

    @NotNull
    private String nombre;
    @JsonBackReference // <- esto evita problemas de recursividad y serialización. Si esto no se agrega vamos a corromper los datos de las tablas y a crear registros infinitos
    @ManyToMany(mappedBy = "temas")
    private Set<Articulo> articulos = new HashSet<>();

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

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }

    @Override
    public String toString() {
        return "Tema{" + "temaID=" + temaID + ", nombre=" + nombre + '}';
    }

}
