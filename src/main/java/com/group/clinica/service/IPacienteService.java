package com.group.clinica.service;

import java.util.List;
import com.group.clinica.model.*;

public interface IPacienteService {
    public List<Paciente> all();
    Paciente newPaciente(Paciente newPaciente);
    Paciente one(String fecha_nacimiento);
    Paciente replacePaciente(Paciente newPaciente, String fecha_nacimiento);
    void deletePaciente(String id);
}