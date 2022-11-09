package com.estudiante.servicios;

import com.estudiante.daos.Idao;
import com.estudiante.entidades.Estudiante;

import java.util.List;

public class EstudianteService {

    private Idao<Estudiante> estudianteIdao;

    public Idao<Estudiante> getEstudianteIdao() {
        return estudianteIdao;
    }

    public void setEstudianteIdao(Idao<Estudiante> estudianteIdao) {
        this.estudianteIdao = estudianteIdao;
    }

    // Metodos que delegan la responsabilidad al DAO --->

    public Estudiante guardarEstudiante(Estudiante e){
        return estudianteIdao.guardar(e);
    }

    public void eliminarEstudiante(Long id){
        estudianteIdao.eliminar(id);
    }

    public Estudiante buscarEstudiante(Long id){
        return estudianteIdao.buscar(id);
    }

    public List<Estudiante> buscarTodos(){
        return estudianteIdao.buscarTodos();
    }
}
