package com.projeto_final.obras.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

public class Obra {
    public Obra(BigInteger id, String nome, BigInteger anoConstrucao, String coordenacao, String gerencia, String diretoria, String outorga, String titularidade) {
        this.id = id;
        this.nome = nome;
        this.anoConstrucao = anoConstrucao;
        this.coordenacao = coordenacao;
        this.gerencia = gerencia;
        this.diretoria = diretoria;
        this.outorga = outorga;
        this.titularidade = titularidade;
    }

    private BigInteger id;
    private String nome;
    private BigInteger anoConstrucao;

    public BigInteger getId() {
        return id;
    }

    private String coordenacao;
    private String gerencia;
    private String diretoria;
    private String outorga;
    private String titularidade;

    public String getNome() {
        return nome;
    }

    public BigInteger getAnoConstrucao() {
        return anoConstrucao;
    }

    public String getCoordenacao() {
        return coordenacao;
    }

    public String getGerencia() {
        return gerencia;
    }

    public String getDiretoria() {
        return diretoria;
    }

    public String getOutorga() {
        return outorga;
    }

    public String getTitularidade() {
        return titularidade;
    }
}
