package com.laboratorio.laboratorio_cruds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.laboratorio.laboratorio_cruds.model.Persona;
import com.laboratorio.laboratorio_cruds.service.PersonaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonaController {
    
    @Autowired
    private PersonaService personaService;

    @GetMapping("/mostrarPersonas")
    public String listarPersonas(Model model) {
        model.addAttribute("personas", personaService.listar());
        return "listaPersonas";
    }

    @GetMapping("/nuevapersona")
    public String mostrarFormulario(Model model) {
        model.addAttribute("persona", new Persona());
        return "formularioPersonas";
    }
    
    @PostMapping("/guardarpersona")
    public String guardarPersona(@ModelAttribute Persona persona) {
        personaService.crear(persona);
        return "redirect:/mostrarPersonas";
    }

    @GetMapping("/editar/{id}")
    public String editarPersona(@PathVariable Long id, Model model) {
        model.addAttribute("persona", personaService.obtenerPorId(id));
        return "formularioPersonas";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarPersona(@PathVariable Long id, Model model) {
        personaService.eliminar(id);
        return "redirect:/mostrarPersonas";
    }
}
