package com.springapp.springapp;

import org.springframework.data.repository.CrudRepository;

public interface ConvidadoRespository extends CrudRepository<Convidado, String> {
    Iterable<Convidado> findByEvento(Evento evento);
    Convidado findByCPF(String CPF);
}
