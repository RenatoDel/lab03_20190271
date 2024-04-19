package com.example.lab03_20190271.entity;

import jakarta.persistence.*;

@Entity
@Table(name="oftalmologo")
public class Oftalmologo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name="correo")
    private String correo;
}
