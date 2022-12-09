package com.projeto_final.obras.model;

import javax.persistence.*;

@Entity
public class ObraDetalhesTecnicos {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Obra obra;
    @Enumerated(EnumType.STRING)
    private ObraTipo tipo;
    @Enumerated(EnumType.STRING)
    private ObraRisco risco;

    public void setTipo(ObraTipo tipo) {
        this.tipo = tipo;
    }

    public void setRisco(ObraRisco risco) {
        this.risco = risco;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Obra getObra() {
        return obra;
    }

    public ObraTipo getTipo() {
        return tipo;
    }

    public ObraRisco getRisco() {
        return risco;
    }
}
