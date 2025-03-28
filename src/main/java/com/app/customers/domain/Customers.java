package com.app.customers.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Clientes")
@Data
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false, unique = true)
    private String apellido;

    @Column(nullable = false)
    private String telefono;

    @Column(nullable = false)
    private String fechaNacimiento;

    // Empty constructor (required for JPA)
    public Customers() {}

    // Constructor with parameters
    public Customers(Long id, String nombre, String apellido, String telefono, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getApellido () {
        return apellido;
    }

    public void setApellido (String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono () {
        return this.telefono;
    }

    public void setTelefono (String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento () {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento (String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}