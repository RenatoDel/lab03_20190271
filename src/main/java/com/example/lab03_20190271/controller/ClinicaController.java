package com.example.lab03_20190271.controller;

import com.example.lab03_20190271.entity.Clinica;
import com.example.lab03_20190271.repository.ClinicaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLOutput;
import java.util.List;

@Controller
@RequestMapping("/listarclinica")
public class ClinicaController {
    final ClinicaRepository clinicaRepository;

    public ClinicaController(ClinicaRepository clinicaRepository) {
        this.clinicaRepository = clinicaRepository;
    }
    public String listarTransportistas(){
        List<Clinica> lista= clinicaRepository.findAll();
        for(Clinica c: lista){
            System.out.print("Clinica ID: "+ c.getId() );
            System.out.print("Clinica ID: "+ c.getNombre() );
            System.out.print("Clinica ID: "+ c.getDireccion() );
            System.out.print("Telefono ID: "+ c.getTelefono() );
        }
    }
}
