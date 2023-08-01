package com.PortaventuraPark.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "atracciones")
public class Atraccion {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="zona")
    private int zona;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="alturamin")
    private float alturaMin;
    @Column(name="capacidad")
    private int capacidad;
    @Column(name="duracion")
    private int duracion;
    @Column(name="img")
    private String imagen;
}
