package com.laboratorio.laboratorio_cruds.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Persona {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    @NotBlank(message = "El nombre de la persona no puede estar en blanco.")
    private String nombre;
    @NotBlank(message = "El apellido de la persona no puede estar en blanco.")
    private String apellido;
    @NotBlank(message = "El email de la persona no puede estar en blanco.")
    @Email(message = "Debe ingresar una dirección de correo válida.")
    private String email;
    @NotBlank(message = "El teléfono de la persona no puede estar en blanco.")
    private String telefono;
    @NotBlank(message = "La fecha de nacimiento de la persona no puede estar en blanco.")
    private String fechaNacimiento;

    public Persona(Long id, String nombre, String apellido, String email, String telefono, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona() {
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
