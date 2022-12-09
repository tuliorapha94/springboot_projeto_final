package com.projeto_final.obras.model;

import javax.persistence.*;

@Entity
public class ObraLocalizacao {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cidade;
    @OneToOne
    private Obra obra;
    private String estado;
    private String latitude;
    private String longitude;

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public Obra getObra() {
        return obra;
    }

    public String getLongitude() {
        return longitude;
    }
}
