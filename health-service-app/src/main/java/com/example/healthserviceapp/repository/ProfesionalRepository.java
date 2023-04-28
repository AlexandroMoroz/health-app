package com.example.healthserviceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.healthserviceapp.entity.Profesional;
import com.example.healthserviceapp.enums.Especialidad;
import com.example.healthserviceapp.enums.Provincias;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface ProfesionalRepository extends JpaRepository<Profesional, String>{
    
    @Query("SELECT p FROM Profesional p WHERE p.especialidad = :especialidad")
    public List<Profesional> buscarPorEspecialidad(@Param("especialidad") Especialidad especialidad);
    
    @Query("SELECT p FROM Profesional p WHERE p.provincia = :provincia")
    public List<Profesional> buscarPorLocalidad(@Param("provincia") Provincias provincia);
    
}
