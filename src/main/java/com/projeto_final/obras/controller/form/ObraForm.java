package com.projeto_final.obras.controller.form;

import com.projeto_final.obras.model.Obra;
import com.projeto_final.obras.repository.ObraRepository;

import java.math.BigInteger;

public class ObraForm {
    private String nome;
    private BigInteger anoConstrucao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigInteger getAnoConstrucao() {
        return anoConstrucao;
    }

    public void setAnoConstrucao(BigInteger anoConstrucao) {
        this.anoConstrucao = anoConstrucao;
    }

    public Obra converter(){
        return new Obra(nome, anoConstrucao);
    }
}
