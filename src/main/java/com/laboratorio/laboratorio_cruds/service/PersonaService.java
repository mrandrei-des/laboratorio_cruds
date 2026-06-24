package com.laboratorio.laboratorio_cruds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laboratorio.laboratorio_cruds.model.Persona;
import com.laboratorio.laboratorio_cruds.repository.PersonaRepository;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;
        

    public Persona crear(Persona persona) {
        return personaRepository.save(persona);
    }
    
    public List<Persona> listar() {
        return personaRepository.findAll();
    }

    public Persona obtenerPorId(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    public Persona editar(Persona persona) {
        return personaRepository.save(persona);
    }

    public void eliminar(Long id) {
        if(personaRepository.findById(id) != null) {
            personaRepository.deleteById(id);
        }
    }
}
