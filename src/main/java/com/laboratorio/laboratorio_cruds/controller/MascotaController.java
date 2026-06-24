package com.laboratorio.laboratorio_cruds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.laboratorio.laboratorio_cruds.model.Mascota;
import com.laboratorio.laboratorio_cruds.service.MascotaService;

@Controller
public class MascotaController {
    @Autowired
    private MascotaService mascotaService;

    @GetMapping("/mostrarMascotas")
    public String listarMascotas(Model model) {
        model.addAttribute("mascotas", mascotaService.listar());
        return "listaMascotas";
    }

    @GetMapping("/nuevamascota")
    public String mostrarFormulario(Model model) {
        model.addAttribute("mascota", new Mascota());
        return "formularioMascotas";
    }
    
    @PostMapping("/guardarmascota")
    public String guardarPersona(@ModelAttribute Mascota mascota) {
        mascotaService.crear(mascota);
        return "redirect:/mostrarMascotas";
    }

    @GetMapping("/editarMascota/{id}")
    public String editarMascota(@PathVariable Long id, Model model) {
        model.addAttribute("mascota", mascotaService.obtenerPorId(id));
        return "formularioMascotas";
    }

    @GetMapping("/eliminarMascota/{id}")
    public String eliminarMascota(@PathVariable Long id, Model model) {
        mascotaService.eliminar(id);
        return "redirect:/mostrarMascotas";
    }
}
