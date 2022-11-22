package com.projeto_final.obras.model;

import java.math.BigInteger;

public class ObraInspecao {
    private BigInteger id;
    private Obra obra;
    private String frequencia;
    private int mes;
    private String status;
    private int prioridade;

    public void setId(BigInteger id) {
        this.id = id;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public BigInteger getId() {
        return id;
    }

    public Obra getObra() {
        return obra;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public int getMes() {
        return mes;
    }

    public String getStatus() {
        return status;
    }

    public int getPrioridade() {
        return prioridade;
    }
}
