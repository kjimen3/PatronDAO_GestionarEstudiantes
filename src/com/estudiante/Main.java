package com.estudiante;

import com.estudiante.daos.EstudianteDaoH2;
import com.estudiante.entidades.Estudiante;
import com.estudiante.servicios.EstudianteService;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();

        estudiante.setId(1L);
        estudiante.setNombre("Javier");
        estudiante.setApellido("Rabuch");

        EstudianteService estudianteService = new EstudianteService();
        estudianteService.setEstudianteIdao(new EstudianteDaoH2());

        estudianteService.guardarEstudiante(estudiante);



    }
}

































































