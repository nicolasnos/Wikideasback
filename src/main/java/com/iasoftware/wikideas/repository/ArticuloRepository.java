package com.iasoftware.wikideas.repository;

import com.iasoftware.wikideas.models.Articulo;
import com.iasoftware.wikideas.models.Tema;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface ArticuloRepository extends CrudRepository<Articulo, Long> {
    Collection<Articulo> findAll();
}
