package com.springapp.springapp;

import org.springframework.data.repository.CrudRepository;

public interface EventoRepository extends CrudRepository<Evento,String> {
    Evento findByCodigo(long codigo);
}
