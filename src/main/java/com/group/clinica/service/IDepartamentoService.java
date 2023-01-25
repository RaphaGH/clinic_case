package com.group.clinica.service;

import java.util.List;
import com.group.clinica.model.*;

public interface IDepartamentoService {
    public List<Departamento> all();
    Departamento newDepartamento(Departamento newDepartamento);
    Departamento one(String id);
    Departamento replaceDepartamento(Departamento newDepartamento, String id);
    void deleteDepartamento(String id);
}