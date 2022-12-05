package com.projeto_final.obras.repository;

import com.projeto_final.obras.model.Obra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ObraRepository extends JpaRepository<Obra, Long> {
    List<Obra> findByNome(String nome);
}
