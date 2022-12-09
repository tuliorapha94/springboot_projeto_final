package com.projeto_final.obras.model;

import javax.persistence.*;

@Entity
public class ObraInspecao {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Obra obra;
    @Enumerated(EnumType.STRING)
    private InspecaoFrequencia frequencia;
    private int mes;
    @Enumerated(EnumType.STRING)
    private InspecaoStatus status = InspecaoStatus.PENDENTE;
    private int prioridade;

    public void setId(Long id) {
        this.id = id;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public Long getId() {
        return id;
    }

    public Obra getObra() {
        return obra;
    }

    public InspecaoFrequencia getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(InspecaoFrequencia frequencia) {
        this.frequencia = frequencia;
    }

    public InspecaoStatus getStatus() {
        return status;
    }

    public void setStatus(InspecaoStatus status) {
        this.status = status;
    }

    public int getMes() {
        return mes;
    }

    public int getPrioridade() {
        return prioridade;
    }
}
