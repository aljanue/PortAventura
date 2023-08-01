package com.PortaventuraPark.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Persona {
    @Id
    @Column
    private Long id;
    @Column
    private String nombre;
    @Column
    private String dia;
}
