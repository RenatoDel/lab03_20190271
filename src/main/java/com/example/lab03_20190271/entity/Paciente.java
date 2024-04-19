package com.example.lab03_20190271.entity;

import jakarta.persistence.*;

@Entity
@Table(name="paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "edad")
    private String edad;

    @Column(name = "genero")
    private String telefono;

    @Column(name = "diagnostico")
    private String diagnostico;

    @Column(name = "fecha_cita")
    private String fecha_cita;

    @Column(name = "numero_habitacion")
    private String numero_habitacion;

}
