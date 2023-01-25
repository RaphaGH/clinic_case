package com.group.clinica.service;

import java.util.List;
import com.group.clinica.model.*;

public interface IHistoria_clinicaService {
    public List<Historia_clinica> all();
    Historia_clinica newHistoria_clinica(Historia_clinica newHistoria_clinica);
    Historia_clinica one(String fecha_apertura);
    Historia_clinica replaceHistoria_clinica(Historia_clinica newHistoria_clinica, String fecha_apertura);
    void deleteHistoria_clinica(String id);
}