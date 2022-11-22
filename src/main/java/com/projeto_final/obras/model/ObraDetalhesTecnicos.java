package com.projeto_final.obras.model;

import java.math.BigInteger;

public class ObraDetalhesTecnicos {
    private BigInteger id;
    private Obra obra;
    private String tipo;
    private String risco;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setRisco(String risco) {
        this.risco = risco;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getId() {
        return id;
    }

    public Obra getObra() {
        return obra;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRisco() {
        return risco;
    }
}
