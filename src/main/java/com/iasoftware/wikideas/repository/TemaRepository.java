package com.iasoftware.wikideas.repository;

import com.iasoftware.wikideas.models.Tema;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface TemaRepository extends CrudRepository<Tema, Long> {
    Collection<Tema> findAll();
}
