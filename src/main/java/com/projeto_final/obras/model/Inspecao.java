package com.projeto_final.obras.model;

import java.math.BigInteger;
import java.util.Date;

public class Inspecao {
    private BigInteger id;
    private ObraInspecao obraInspecao;
    private Date data;
    private String observacoes;

    public void setId(BigInteger id) {
        this.id = id;
    }

    public void setObraInspecao(ObraInspecao obraInspecao) {
        this.obraInspecao = obraInspecao;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public BigInteger getId() {
        return id;
    }

    public ObraInspecao getObraInspecao() {
        return obraInspecao;
    }

    public Date getData() {
        return data;
    }

    public String getObservacoes() {
        return observacoes;
    }
}
