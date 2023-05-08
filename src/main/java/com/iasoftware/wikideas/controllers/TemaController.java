package com.iasoftware.wikideas.controllers;

import com.iasoftware.wikideas.models.Articulo;
import com.iasoftware.wikideas.models.Tema;
import com.iasoftware.wikideas.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/temas")
public class TemaController {
    @Autowired
    private TemaRepository temaRepository;

    @GetMapping
    public ResponseEntity<Collection<Tema>> listarTemas() {
        return new ResponseEntity<>(temaRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/findTheme/{id}")
    public ResponseEntity<Tema> obtenerTemaPorId(@PathVariable long id) {
        Tema tema = temaRepository.findById(id).orElseThrow();

        if (tema != null) {
            return new ResponseEntity<>(temaRepository.findById(id).orElseThrow(), HttpStatus.OK);
        }

        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PostMapping("/newTheme")
    public ResponseEntity<?> guardarTema(@RequestBody Tema tema){
        return new ResponseEntity<>(temaRepository.save(tema), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> eliminarTema(@PathVariable long id){
        temaRepository.deleteById(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @GetMapping("/{id}/articulos")
    public ResponseEntity<Collection<Articulo>> listarArticulosPorTema(@PathVariable long id){
        Tema tema = temaRepository.findById(id).orElseThrow();

        if (tema != null) {
            return new ResponseEntity<>(tema.getArticulos(), HttpStatus.OK);
        }

        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}
