package com.projeto_final.obras.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
@Entity
public class Inspecao {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private ObraInspecao obraInspecao;
    private Date data;
    private String observacoes;

    public void setId(Long id) {
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

    public Long getId() {
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
