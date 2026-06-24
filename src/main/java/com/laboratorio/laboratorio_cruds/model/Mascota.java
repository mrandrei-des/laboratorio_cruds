package com.laboratorio.laboratorio_cruds.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
public class Mascota {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    @NotBlank(message = "El nombre de la mascota no puede estar en blanco.")
    private String nombre;
    @NotBlank(message = "La especie de la mascota no puede estar en blanco.")
    private String especie;
    @NotBlank(message = "La raza de la mascota no puede estar en blanco.")
    private String raza;
    @Positive(message = "La edad de la mascota no puede ser 0 o menor.")
    @Max(value = 50, message = "La edad de la mascota no puede mayor a 50 años.")
    private int edad;
    public Mascota(Long id, String nombre, String especie, String raza, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
    }

    public Mascota() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
