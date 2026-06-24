package com.laboratorio.laboratorio_cruds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laboratorio.laboratorio_cruds.model.Mascota;

public interface MascotaRepository extends JpaRepository<Mascota, Long> {}

