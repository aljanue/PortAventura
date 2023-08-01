package com.PortaventuraPark.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "reserva")
public class Reserva {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="estado")
    private int estado;
    @Column(name="id_persona")
    private int persona;
    @Column(name="id_atraccion")
    private int atraccion;
    @Column(name="hora")
    private LocalTime hora;
}
