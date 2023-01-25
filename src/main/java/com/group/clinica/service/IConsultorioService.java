package com.group.clinica.service;

import java.util.List;
import com.group.clinica.model.*;

public interface IConsultorioService {
    public List<Consultorio> all();
    Consultorio newConsultorio(Consultorio newConsultorio);
    Consultorio one(String id);
    Consultorio replaceConsultorio(Consultorio newConsultorio, String id);
    void deleteConsultorio(String id);
}