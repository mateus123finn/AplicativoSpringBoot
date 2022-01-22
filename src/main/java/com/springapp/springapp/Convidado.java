package com.springapp.springapp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Convidado {
    @Id
    private String CPF;
    private String NomeConvidado;

    @ManyToOne
    private Evento evento;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNomeConvidado() {
        return NomeConvidado;
    }

    public void setNomeConvidado(String nomeConvidado) {
        NomeConvidado = nomeConvidado;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
