package com.iasoftware.wikideas.controllers;

import com.iasoftware.wikideas.models.Articulo;
import com.iasoftware.wikideas.repository.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/articulos")
public class ArticuloController {
    @Autowired
    private ArticuloRepository articuloRepository;

    @GetMapping
    public ResponseEntity<Collection<Articulo>> listarArticulos() {
        return new ResponseEntity<>(articuloRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/findArticle/{id}")
    public ResponseEntity<Articulo> obtenerARticuloPorId(@PathVariable long id) {
        Articulo articulo = articuloRepository.findById(id).orElseThrow();

        if (articulo != null) {
            return new ResponseEntity<>(articuloRepository.findById(id).orElseThrow(), HttpStatus.OK);
        }

        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PostMapping("/newArticle")
    public ResponseEntity<?> guardarArticulo(@RequestBody Articulo articulo){
        return new ResponseEntity<>(articuloRepository.save(articulo), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> eliminarArticulo(@PathVariable long id){
        articuloRepository.deleteById(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


}
