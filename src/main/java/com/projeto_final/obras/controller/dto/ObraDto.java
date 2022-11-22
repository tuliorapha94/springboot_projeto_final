package com.projeto_final.obras.controller.dto;

import com.projeto_final.obras.model.Obra;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

public class ObraDto {
    private BigInteger id;
    private String nome;
    private BigInteger anoConstrucao;

    public ObraDto(Obra obra){
        this.id = obra.getId();
        this.anoConstrucao = obra.getAnoConstrucao();
        this.nome = obra.getNome();
    }

    public static List<ObraDto> converter(List<Obra> obras) {
        return obras.stream().map(ObraDto::new).collect(Collectors.toList());
    }

    public BigInteger getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigInteger getAnoConstrucao() {
        return anoConstrucao;
    }
}
