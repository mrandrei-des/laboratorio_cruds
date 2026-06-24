package com.laboratorio.laboratorio_cruds.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.laboratorio.laboratorio_cruds.model.Mascota;
import com.laboratorio.laboratorio_cruds.repository.MascotaRepository;

@Service
public class MascotaService {
    @Autowired
    private MascotaRepository mascotaRepository;
        
    public Mascota crear(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }
    
    public List<Mascota> listar() {
        return mascotaRepository.findAll();
    }

    public Mascota obtenerPorId(Long id) {
        return mascotaRepository.findById(id).orElse(null);
    }

    public Mascota editar(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    public void eliminar(Long id) {
        if(mascotaRepository.findById(id) != null) {
            mascotaRepository.deleteById(id);
        }
    }
}