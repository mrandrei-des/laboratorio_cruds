package com.laboratorio.laboratorio_cruds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.laboratorio.laboratorio_cruds.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {}