package com.projeto_final.obras.model;

import javax.persistence.*;
import java.math.BigInteger;
@Entity
public class Obra {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private BigInteger anoConstrucao;
    private String coordenacao;
    private String gerencia;
    private String diretoria;
    private String outorga;
    private String titularidade;
    public Obra(){
    };
    public Obra(String nome, BigInteger anoConstrucao) {
        this.nome = nome;
        this.anoConstrucao = anoConstrucao;
    }

    public Long getId() {
        return id;
    }

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
