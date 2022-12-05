package com.projeto_final.obras.controller;

import com.projeto_final.obras.controller.dto.ObraDto;
import com.projeto_final.obras.controller.form.ObraForm;
import com.projeto_final.obras.model.Obra;
import com.projeto_final.obras.repository.ObraRepository;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/obras")
public class ObraController {


    @Autowired
    private ObraRepository obraRepository;

    @GetMapping
    public List<ObraDto> hello(String nome){
        if (nome == null) {
            List<Obra> obra = obraRepository.findAll();
            return ObraDto.converter(obra);
        }else {
            List<Obra> obra = obraRepository.findByNome(nome);
            return ObraDto.converter(obra);
        }
    };

    @PostMapping
    public ResponseEntity<ObraDto> cadastrar(@RequestBody ObraForm obraForm, UriComponentsBuilder uriBuilder){
        Obra obra = obraForm.converter();
        obraRepository.save(obra);

        URI uri = uriBuilder.path("/obras/{id}").buildAndExpand(obra.getId()).toUri();
        return ResponseEntity.created(uri).body(new ObraDto(obra));
    };

}
