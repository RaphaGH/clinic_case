package com.group.clinica.service;

import java.util.List;
import com.group.clinica.model.*;

public interface IEnfermeraService {
    public List<Enfermera> all();
    Enfermera newEnfermera(Enfermera newEnfermera);
    Enfermera one(String dni_enfermera);
    Enfermera replaceEnfermera(Enfermera newEnfermera, String dni_enfermera);
    void deleteEnfermera(String id);
}